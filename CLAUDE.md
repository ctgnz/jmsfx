# JMSFX - Joint Military Symbology on JavaFX

JavaFX implementation of **NATO APP-6, Edition E (2023)** military symbology - not MIL-STD-2525D. They're related, converged NATO-vs-US standards but formally distinct; don't conflate them. The `edition-e` git branch name refers to APP-6 **Edition E**, not a generic feature branch. Now the **canonical fork** of the old Esri `joint-military-symbology-xml` (JMSML) project, which modelled MIL-STD-2525D specifically - that upstream repo is dead/abandoned; this one owns the schema/data lineage going forward, held in `jmsfx-standard`. Depends on `foxglove` (separate repo) for SVG-in-JavaFX rendering.

Modules are grouped by deliverable rather than flat (#102), which is also how the directories are laid out:

- `jmsfx-parent` - the shared build configuration, and nothing else. It carries no modules so it can be versioned on its own; the root `pom.xml` is now *only* an aggregator.
- `jmsfx-core` - the API. Everything pins it.
- `jmsfx-tools/` - `jmsfx-generator`, `jmsfx-editor`. A real parent pom: these share a release, being coupled through the model file rather than the dependency graph.
- `jmsfx-viewer/` - `jmsfx-creator`, `jmsfx-server`. A real parent pom: one capability, two front ends.
- `library/` - `jmsfx-standard`, `jmsfx-hallux`, `jmsfx-battleorder`. A **plain directory, not a module** - these are exactly the lifecycles that should not move together. `jmsfx-battleorder` is documentation only until #81 can generate it, so it is not in `<modules>` yet.

A dependency that crosses a group boundary resolves through `${jmsfx.core.version}` or `${jmsfx.standard.version}`, declared in `jmsfx-parent`; both default to `${project.version}`, so pinning one to a released version is what splits that lifecycle off. In-group dependencies still use `${project.version}` directly. Prefer `-pl :jmsfx-server` over `-pl jmsfx-viewer/jmsfx-server` - selecting by artifactId survives a directory move.

## Domain background

APP-6E is deliberately designed so the base symbology model can be extended (add/subtract elements) by a consumer - that's the actual reason the core model is code-generated rather than hand-written (see Code generation below): generation absorbs both future revisions to the base standard and per-consumer extensions without hand-maintaining the combinatorial result.

Every icon fits within a standard SVG `viewBox="0 0 612 792"`. An icon is composed of several distinct, independently-selectable parts - the main icon, two modifiers (sector one/two - `SectorOneModifier`/`SectorTwoModifier`), and a variable number of amplifiers depending on the symbol set (see the `amplifier`/`amplifierTwo`/`amplifierThree`/`frameAmplifier` fields on `IdentificationSymbol`) - each with well-defined, fixed locations within that viewBox. Rendering an icon is just: pick the relevant SVG for each part and layer them in a defined z-order - no per-icon custom layout. This composes naturally with foxglove's SVG-in-JavaFX rendering. In jmsfx-core, **`IdentificationSymbol`** is the model of one icon (the selected main/modifiers/amplifiers and their state); **`IdentificationSymbolIcon`** is the JavaFX `Node` that renders it.

**`IdentificationSymbol` is the decoded SIDC.** The APP-6E symbol identification code is a 30-position hexadecimal string - thirteen elements of information in three sets of ten - and its positions map one-to-one onto the class's identity-bearing properties, with nothing left over on either side:

| SIDC positions | Property |
| --- | --- |
| 1-2, 3, 4, 5-6, 7, 8 | `version`, `context`, `standardIdentity`, `symbolSet`, `status`, `hqtfDummy` |
| 9-10 | `amplifier` (as `getFullId()` - the amplifier list's id, then the item's) |
| 11-12, 13-14, 15-16 | `entity`, `entityType`, `entitySubType` |
| 17-18, 19-20 | `sectorOneModifier`, `sectorTwoModifier` |
| 21, 22 | the same two modifiers again, via `getGroupId()` - zero means the symbol set's own modifier, non-zero means the common table, in which case the full common-modifier code is digit 21 then 17-18 (and 22 then 19-20) |
| 23-24, 25-26, 27 | `amplifierTwo`, `amplifierThree`, `frameAmplifier` |
| 28-30 | `countryCode` |

`getFirstTenDigits()`/`getSecondTenDigits()`/`getThirdTenDigits()` do that encoding, and `toString()` joins them space-separated. Every other field on the class is derived (the `*Graphic` properties, resolved from the above), presentational (`scale`, `textAmplifiers`, `graphicAmplifiers`, `amplifierTemplateVisible`) or the cached encoding itself (`code`). So the SIDC is the class's complete state, which means a symbol round-trips through its code, and the code is a sound cache key for anything derived from a whole symbol.

A standard amplifier's id **is** its complete two-digit code from APP-6E Table A-8 - echelon `11`-`18` and `21`-`26`, equipment mobility `31`-`37`, `41`-`42`, `51`-`52` - so `getFullId()` is inherited unchanged and the SVG assets are named `{identityGroupId}{id}`. It used to prefix the amplifier list's own id, which made the first digit a property of the group rather than of the value; that could not express echelon spanning two code groups, nor equipment mobility spanning three, and was a carry-over from the Esri model. Two values sit in the hex space edition E opened for extensions: `Staffel` at `1A`, which is an Annex B national designation rather than a Table A-8 echelon, and `Deputy Leader` at `72`. Constant order comes from the order of the values in the model file, not from the code, so `model-hallux.yml` can share these codes while listing `Staffel` in its own position.

Three consumer modules build on this:
- **`jmsfx-creator`** - desktop app for composing icons; can save the result as a composite SVG.
- **`jmsfx-server`** - the same icon-composition capability, web-based (has `IconRestController`).
- **`jmsfx-editor`** - desktop app for editing the *model file itself* (`model-standard.yml`), not for composing icons. Its `SymbolSetImpl` is a mutable, `ObservableList`-backed implementation of `SymbolSet`/`SymbolSetInfo` - the live-editable backing for this GUI, as opposed to `jmsfx-standard`'s generated, immutable `*SymbolSet` classes used for actual rendering.

## Code style

Eclipse formatter/import-order profile enforced via Spotless (`config/eclipse-formatter.xml`, `config/eclipse.importorder`), bound to the `verify` phase - `mvn verify` runs `spotless:check` and will fail on drift. `-Xlint:all -Werror` is on for the compiler. `jmsfx-parent/pom.xml` also has an `org.eclipse.m2e:lifecycle-mapping` entry telling m2e to skip Spotless's `check` goal during its own builds (otherwise Eclipse errors with "Plugin execution not covered by lifecycle configuration").

Source encoding is `UTF-8` throughout (property, compiler plugin, and Spotless all agree) - it used to be `ISO-8859-1`, which only "worked" because it was close enough to whatever the JVM's platform-default encoding happened to be when files were generated.

Enum constants are **not** named `UPPER_SNAKE_CASE` by convention here - the author's view is that an enum constant is closer to an anonymous inner class instance than a `static final` constant, so names are often mixed-case, sometimes letter-code-prefixed (e.g. `AmplifierEnum`'s `A_SymbolIcon`, `F_ReinforcedOrReduced`). Enums are frequently "heavy" - implementing multiple interfaces, holding real behavior. Don't suggest renaming toward conventional constant style or simplifying these to plain data.

## Code generation

The Java sources of every library under `library/` are **generated**, not hand-written, by `jmsfx-generator`:

- `DomainModelGenerator` (`jmsfx-tools/jmsfx-generator/src/main/java/.../DomainModelGenerator.java`) drives generation from FreeMarker templates in `jmsfx-tools/jmsfx-generator/src/main/resources/templates/*.ftl`.
- Each library has a config/model pair in `jmsfx-tools/jmsfx-generator/src/main/resources/`: `config.yml`/`model-standard.yml` target `library/jmsfx-standard` (the base APP-6E model), and `config-hallux.yml`/`model-hallux.yml` target `library/jmsfx-hallux`. Both configs carry **absolute** output paths, so they are machine-specific and have to be corrected if the checkout moves. `config-battleorder.yml` exists but cannot run yet - its model is an overlay, and composing one is #81. `model-hallux.yml` is mostly a superset of `model-standard.yml`, with two deliberate deviations: it keeps a few icons from the older APP-6D edition that APP-6E removed, and its Dismounted Individual symbol set is extended far beyond APP-6E's original intent for that domain - expect that domain to look unusually large/elaborate. The user describes hallux's extensions as "a bit liberal" relative to the base standard.
- Always writes UTF-8 explicitly (`newWriter(Path)` helper) regardless of platform default.
- Enum-emitting templates indent constant declarations at 8 spaces (one level deeper than the rest of the enum body) to match this project's real Eclipse formatter setting - confirmed by regenerating a module and diffing against Spotless's output until it converged to zero.

**When `jmsfx-core`'s public interfaces change, fix the relevant `.ftl` template and regenerate** - don't hand-patch the generated `.java` output, since a later regeneration would silently revert the hand-patch. To verify a template matches house style: regenerate with raw output (no Spotless), then run `spotless:apply` once and diff against the previously-committed source - zero diff means the template is correct.

That zero-diff test can't catch a template whose *raw* (pre-Spotless) import grouping is wrong, though: Spotless always re-sorts imports into `config/eclipse.importorder`'s groups regardless of what order the source handed it, so a template that puts a group in the wrong place still produces a zero-diff result once `spotless:apply` has run. To actually check a template's raw import order, inspect the un-formatted generated output directly against `config/eclipse.importorder`'s groups (`java`, `javax`, `javafx`, `org`, `com`, `nz`, then every other prefix - e.g. `io.github.ctgnz.*` - as an implicit trailing group). Within that trailing group, Spotless sorts case-sensitively (ASCII, so uppercase before lowercase - e.g. `io.github.ctgnz.jmsfx.SymbolSet` sorts before `io.github.ctgnz.jmsfx.standard.SymbolSetEnum` because `'S' < 's'`), and templates that build an import list by iterating model data in domain order (not alphabetical) need an explicit `?sort`/`?sort_by` to match - see `SymbolSetEnum.ftl`'s `symbolSets?sort_by("packageName")` and `SymbolSetInfo.ftl`'s sorted `amplifierClasses` list.

The templates' raw output is now fully Spotless-clean **except** for one category that's genuinely impractical to fix statically: enum constants whose argument list is long enough to need wrapping (`AmplifierEnum`, `AmplifierListEnum`, `StatusEnum`, `ControlMeasureEntitySubType`/`EntityType`, and any other enum where a row's label/description pushes it over the line-length limit). Eclipse wraps these by column-aligning the continuation under wherever the last kept argument starts on the first line - a position that depends on that specific row's rendered text length, which varies per enum constant. Replicating this in a template would mean reimplementing Eclipse's line-wrapping algorithm in FreeMarker; not worth it. These files still need the one-time `spotless:apply` after regeneration.

## Method-level generics on interfaces like `AmplifierList`

`AmplifierList.getItems()`/`getValueClass()` are declared with their own method-level type parameter (`<A extends AmplifierListItem> List<A> getItems()`), not a class-level one - the same pattern `SymbolSetInfo`/`SymbolSet` used to have before `f62ac24` dropped it there as unused. Nothing calls these with an explicit type witness either, so the class-level-vs-method-level distinction only matters for how an implementer satisfies the signature:

- The generated `AmplifierListEnum` (jmsfx-standard) implements it by redeclaring the same method-level `<A extends AmplifierListItem>` and casting from an untyped/`Object` source (`(Class<A>) valueClass`, `(A[]) ...invoke(...)`) - always a legal unchecked cast, never a hard error.
- `jmsfx-editor`'s hand-written `Impl` classes (`StandardAmplifierImpl`, `AmplifierListImpl`) are themselves generic over a class-level type parameter and used to implement `getItems()` by returning that class-level type directly. That satisfies the override (erasure matches) but two things go wrong once warnings are errors: it's flagged as an unchecked-conversion override, and a direct cast from the field's concrete type (`ObservableList<StandardAmplifierItemImpl<A>>`) to the interface's `List<A>` is a **hard compile error**, not just a warning, because they're two differently-parameterized instances of the same generic type. Fixed by redeclaring the same method-level type parameter (matching `AmplifierListEnum`'s approach) and casting through `List<?>` (e.g. `(List<T>) (List<?>) values`). If you add another `Impl` class implementing `AmplifierList`, follow this same shape rather than binding to the class's own type parameter.
