# JMSFX - Joint Military Symbology on JavaFX

JavaFX implementation of **NATO APP-6, Edition E (2023)** military symbology - not MIL-STD-2525D. They're related, converged NATO-vs-US standards but formally distinct; don't conflate them. The `edition-e` git branch name refers to APP-6 **Edition E**, not a generic feature branch. Now the **canonical fork** of the old Esri `joint-military-symbology-xml` (JMSML) project, which modelled MIL-STD-2525D specifically - that upstream repo is dead/abandoned; this one owns the schema/data lineage going forward, held in `jmsfx-standard`. Depends on `foxglove` (separate repo) for SVG-in-JavaFX rendering.

All modules are wired into the Maven reactor: `jmsfx-core`, `jmsfx-generator`, `jmsfx-standard`, `jmsfx-editor`, `jmsfx-creator`, `jmsfx-server`.

## Domain background

APP-6E is deliberately designed so the base symbology model can be extended (add/subtract elements) by a consumer - that's the actual reason the core model is code-generated rather than hand-written (see Code generation below): generation absorbs both future revisions to the base standard and per-consumer extensions without hand-maintaining the combinatorial result.

Every icon fits within a standard SVG `viewBox="0 0 612 792"`. An icon is composed of several distinct, independently-selectable parts - the main icon, two modifiers (sector one/two - `SectorOneModifier`/`SectorTwoModifier`), and a variable number of amplifiers depending on the symbol set (see the `amplifier`/`amplifierTwo`/`amplifierThree`/`frameAmplifier` fields on `IdentificationSymbol`) - each with well-defined, fixed locations within that viewBox. Rendering an icon is just: pick the relevant SVG for each part and layer them in a defined z-order - no per-icon custom layout. This composes naturally with foxglove's SVG-in-JavaFX rendering. In jmsfx-core, **`IdentificationSymbol`** is the model of one icon (the selected main/modifiers/amplifiers and their state); **`IdentificationSymbolIcon`** is the JavaFX `Node` that renders it.

Three consumer modules build on this:
- **`jmsfx-creator`** - desktop app for composing icons; can save the result as a composite SVG.
- **`jmsfx-server`** - the same icon-composition capability, web-based (has `IconRestController`).
- **`jmsfx-editor`** - desktop app for editing the *model file itself* (`model-standard.yml`), not for composing icons. Its `SymbolSetImpl` is a mutable, `ObservableList`-backed implementation of `SymbolSet`/`SymbolSetInfo` - the live-editable backing for this GUI, as opposed to `jmsfx-standard`'s generated, immutable `*SymbolSet` classes used for actual rendering.

## Code style

Eclipse formatter/import-order profile enforced via Spotless (`config/eclipse-formatter.xml`, `config/eclipse.importorder`), bound to the `verify` phase - `mvn verify` runs `spotless:check` and will fail on drift. `-Xlint:all -Werror` is on for the compiler. `pom.xml` also has an `org.eclipse.m2e:lifecycle-mapping` entry telling m2e to skip Spotless's `check` goal during its own builds (otherwise Eclipse errors with "Plugin execution not covered by lifecycle configuration").

Source encoding is `UTF-8` throughout (property, compiler plugin, and Spotless all agree) - it used to be `ISO-8859-1`, which only "worked" because it was close enough to whatever the JVM's platform-default encoding happened to be when files were generated.

Enum constants are **not** named `UPPER_SNAKE_CASE` by convention here - the author's view is that an enum constant is closer to an anonymous inner class instance than a `static final` constant, so names are often mixed-case, sometimes letter-code-prefixed (e.g. `AmplifierEnum`'s `A_SymbolIcon`, `F_ReinforcedOrReduced`). Enums are frequently "heavy" - implementing multiple interfaces, holding real behavior. Don't suggest renaming toward conventional constant style or simplifying these to plain data.

## Code generation

`jmsfx-standard`'s Java sources (and a separate copy in `hallux`'s `jmsfx-hallux` module) are **generated**, not hand-written, by `jmsfx-generator`:

- `DomainModelGenerator` (`jmsfx-generator/src/main/java/.../DomainModelGenerator.java`) drives generation from FreeMarker templates in `jmsfx-generator/src/main/resources/templates/*.ftl`.
- `config.yml`/`model-standard.yml` target `jmsfx-standard` (the base APP-6E model); `config-hallux.yml`/`model-hallux.yml` target hallux's `jmsfx-hallux` (hardcoded output path into the sibling `hallux` repo on this machine). `model-hallux.yml` is mostly a superset of `model-standard.yml`, with two deliberate deviations: it keeps a few icons from the older APP-6D edition that APP-6E removed, and its Dismounted Individual symbol set is extended far beyond APP-6E's original intent for that domain - expect that domain to look unusually large/elaborate. The user describes hallux's extensions as "a bit liberal" relative to the base standard.
- Always writes UTF-8 explicitly (`newWriter(Path)` helper) regardless of platform default.
- Enum-emitting templates indent constant declarations at 8 spaces (one level deeper than the rest of the enum body) to match this project's real Eclipse formatter setting - confirmed by regenerating a module and diffing against Spotless's output until it converged to zero.

**When `jmsfx-core`'s public interfaces change, fix the relevant `.ftl` template and regenerate** - don't hand-patch the generated `.java` output, since a later regeneration would silently revert the hand-patch. To verify a template matches house style: regenerate with raw output (no Spotless), then run `spotless:apply` once and diff against the previously-committed source - zero diff means the template is correct.

## Method-level generics on interfaces like `AmplifierList`

`AmplifierList.getItems()`/`getValueClass()` are declared with their own method-level type parameter (`<A extends AmplifierListItem> List<A> getItems()`), not a class-level one - the same pattern `SymbolSetInfo`/`SymbolSet` used to have before `f62ac24` dropped it there as unused. Nothing calls these with an explicit type witness either, so the class-level-vs-method-level distinction only matters for how an implementer satisfies the signature:

- The generated `AmplifierListEnum` (jmsfx-standard) implements it by redeclaring the same method-level `<A extends AmplifierListItem>` and casting from an untyped/`Object` source (`(Class<A>) valueClass`, `(A[]) ...invoke(...)`) - always a legal unchecked cast, never a hard error.
- `jmsfx-editor`'s hand-written `Impl` classes (`StandardAmplifierImpl`, `AmplifierListImpl`) are themselves generic over a class-level type parameter and used to implement `getItems()` by returning that class-level type directly. That satisfies the override (erasure matches) but two things go wrong once warnings are errors: it's flagged as an unchecked-conversion override, and a direct cast from the field's concrete type (`ObservableList<StandardAmplifierItemImpl<A>>`) to the interface's `List<A>` is a **hard compile error**, not just a warning, because they're two differently-parameterized instances of the same generic type. Fixed by redeclaring the same method-level type parameter (matching `AmplifierListEnum`'s approach) and casting through `List<?>` (e.g. `(List<T>) (List<?>) values`). If you add another `Impl` class implementing `AmplifierList`, follow this same shape rather than binding to the class's own type parameter.
