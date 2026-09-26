# The fragment contract

Every part of a symbol - the frame, the main icon, each modifier and each amplifier - is one SVG file,
and rendering a symbol means picking the right files and layering them. This describes what those files
have to look like. It applies to every icon library, `jmsfx-standard` and `jmsfx-historical` alike.

Two of these rules are checked at `verify` and will fail the build. Both report by name, so a failure
tells you which file and what is wrong with it.

## One canvas

Every fragment is drawn against `viewBox="0 0 612 792"`. The frame, the icon, the modifiers and the
amplifiers all share that one coordinate space and each occupies its own region of it, which is what
lets the parts line up with no per-symbol layout.

The **bounding octagon** - x 183.5 to 426.5, y 272.5 to 516.5, centred on (305, 394.5) - is the region a
main icon and its sector modifiers are built within. It is in `BoundingOctagon.svg`, and in code as
`IconGeometry.OCTAGON`.

That an icon keeps within the octagon is a *rule*, not a measurement, and it is what lets a symbol's
extent be worked out without starting a JavaFX toolkit. The exception is `FREE_CANVAS`, below.

## Content roots

**A fragment holds exactly one content element: a `<g>` whose id names its family.**

| family | directory | content root |
| --- | --- | --- |
| main icon | `Appendices/<set>/` | `<g id="main">` |
| sector one modifier | `Appendices/<set>/mod1/` | `<g id="mod1">` |
| sector two modifier | `Appendices/<set>/mod2/` | `<g id="mod2">` |
| frame | `Frames/` | `<g id="frame">` |
| frame overlay | `Frames/Overlay/` | `<g id="frame_overlay">` |
| echelon amplifier | `Echelon/` | `<g id="echelon">` |
| other amplifier | `Amplifier/` | `<g id="amplifier">` |
| headquarters / task force / dummy | `HQTFFD/` | `<g id="hqtffd">` |
| operational condition | `OCA/` | `<g id="oca">` |
| engagement bar | `Engagement/` | `<g id="eng_bar">` |

All lowercase, so there is no exception to remember. It is always a `<g>`, even where the content is a
single `<rect>` that could have carried the id itself - one rule covers every family rather than one for
OCA and another for the rest.

Two things may sit beside the content, and nothing else may:

- **`<g id="octagon">`** - the positioning guide: the octagon outline, the `outFrame` trace and the two
  sector rules. Always `display="none"`. It belongs to main icons and modifiers, which are positioned
  within the octagon; frames are drawn *around* the octagon and carry no guide.
- **`<rect id="greyBox">`** - a backdrop behind an icon that needs one, also hidden.

Nothing else at the root: no bare drawing elements, and no groups under any other name.

### Free canvas fragments

The Control Measures, and three Cyberspace path and terrain graphics, are `FREE_CANVAS`: GIS construction
samples showing how a measure is drawn on a map, rather than icons assembled within the octagon. APP-6E
8.1.3 exempts them from the composition rules. They carry illustrative material alongside the content,
so they hold:

| element | how many | what it is |
| --- | --- | --- |
| `<g id="main">` | exactly one | the content - what a consumer renders |
| `<g id="template">` | zero or one | the construction guide: the `T` / `AS` labels and the `PT 1` / `PT 2` arrows that place them |
| `<g id="example">` | zero or more | a worked sample, normally `display="none"`. Numbered `example1`, `example2` and so on where there is more than one |
| `<defs>` | as needed | anything `main` references. Patterns and markers belong here, never loose in the document or inside `main` |

The template is optional because two kinds of fragment have nothing to construct. An **area** is defined
by at least three control points the user places, so there is no fixed geometry a template could draw -
that covers every area measure without one, Airhead Line included, which is an area despite the name.
And the six **Space Debris** fragments are whole symbols in the way an ordinary icon is, so `main` holds
all of it.

### No groups that group nothing

A `<g>` with no attributes and no siblings is a container around exactly one thing, styling nothing and
transforming nothing. There are none left, and new ones are worth taking out: they are what an editor
leaves behind after a copy or an ungroup.

## Graphic types

A main element's `graphicType` in the model says how its graphic relates to the octagon, and therefore
whether its extent follows from a rule or has to be measured.

| type | what it means |
| --- | --- |
| `NA` | no graphic at all - the entity exists only to carry a level of the hierarchy, and has no fragment |
| `MAIN`, `MAIN_1`, `MAIN_2` | built within the octagon; extent is the octagon by rule |
| `FULL_OCTAGON` | fills the octagon |
| `FULL_FRAME` | takes the frame's bounds, so the fragment is per standard identity group and its filename carries the group's suffix |
| `FREE_CANVAS` | free of the composition rules; may use any part of the canvas, so its extent is **measured** rather than derived |

`FREE_CANVAS` is the reason `FragmentMeasurer` exists: those are the only fragments whose bounds cannot
be worked out from the rules, and the generated libraries carry the measurements.

## Normalisation

The fragments are edited in Inkscape, which rewrites a file wholesale on every save - its own namespace
declarations and metadata, an empty `<defs>`, a fresh crop of generated ids, re-serialised coordinates,
and the whole document either on one line or with every attribute on a line of its own. A file's diff
ends up dominated by changes that have nothing to do with the drawing.

`FragmentNormaliser` puts it back:

```
mvn -q -Pstandard -pl :jmsfx-generator exec:java \
  -Dexec.mainClass=io.github.ctgnz.jmsfx.generator.FragmentNormaliser -Dexec.args=--apply
```

It strips editor attributes, elements and namespace declarations, empty `<defs>` and generated ids,
shortens numbers that carry more precision than they mean, and tidies the whitespace inside coordinate
lists. Then it pretty-prints with real element nesting.

**Every rewrite is checked against `SvgFingerprint`.** A file that would come back describing a different
drawing is reported and left alone, never written - so "this reformat changed nothing" is a property the
run verifies rather than one the author asserts. Structure, attributes and text must match exactly;
numbers are compared within a tolerance, because the precision step deliberately moves a few by a
fraction of a thousandth of a unit.

An id that is an editor's serial number - `path2999`, `XMLID_1_` - is a generated id and goes. An id that
names part of the construction - `main`, `octagon`, `template`, `varT` - is a name and stays. The test is
an SVG element name followed by digits, and nothing else, which is deliberately conservative: it means
`frame_1_` reads as a name worth keeping, because `frame` is not an element name. It was a name. Just not
a useful one.

## What the build checks

| check | what it enforces |
| --- | --- |
| `FragmentNormaliser --check` | every fragment is still normalised. The fix is the same tool with `--apply`, and the failure message says so |
| `FragmentShapeChecker` | every free canvas fragment holds the shape above. It reports every fault on a file at once, so a file is named once rather than once per problem |

Both are bound to `verify` rather than written as tests, so skipping tests cannot skip them, and both
report only - neither writes.

`FragmentShapeChecker` covers free canvas fragments today. The other families' content roots are settled
now, so extending it is a matter of saying so.

Editor metadata is passed over by the shape check on purpose: the normaliser's check is bound to the same
phase and already fails on it with a message that says what to do, and reporting the same file twice for
something that is not about its shape would only be noise.

## Changing a fragment

1. Edit it, in Inkscape or by hand.
2. Run the normaliser with `--apply`. If it **refuses** the file, it is telling you the rewrite would have
   changed the drawing - that is a real difference, not a formatting one, and worth understanding before
   going further.
3. If the change moved anything between groups, `SvgFingerprint` cannot help: it records structure, so a
   new group or a moved element changes it by design. Verify another way - compare each drawing element
   with its ancestors' attributes folded in, and re-run `FragmentMeasurer` to confirm no bounds moved.
4. Mirror it into the other tree. The shared fragments are byte-identical between `jmsfx-standard` and
   `jmsfx-historical`, and are meant to stay that way.
5. `mvn -Pstandard verify`.

## Related

`IconGeometry` holds the canvas, the octagon and the trim padding. `MainElement.getIconBounds()` is the
rule about extent. `FragmentMeasurer` measures what the rules cannot derive and writes it back into the
model; it needs a JavaFX toolkit, which is why it runs by hand rather than in the build.
