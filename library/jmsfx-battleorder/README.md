# JMSFX Extension for Battle Order

An extension to the JMSFX APP-6E symbology model that colours a unit's frame by its branch of
service, following the convention used by [Battle Order](https://www.battleorder.org/icons)'s icon
library.

It is a small extension by design. The icons, modifiers and echelons are the standard APP-6E ones;
the only addition is a single frame amplifier, scoped to the Land Units symbol set.

## The colours

| SIDC 27 | Branch | Fill |
| :---: | --- | --- |
| `1` | Infantry | `#5BAA5B` |
| `2` | Armor/Recon | `#FFD00B` |
| `3` | Artillery/Air Defense | `#FF3333` |
| `4` | Combat Support, Medical | `#F7F7F7` |
| `5` | Logistics, Services | `#D87600` |
| `6` | Aviation | `#A2E3E8` |
| `7` | Maritime | `#67C6EF` |

`0` is left as APP-6E's unspecified frame amplifier, which carries the standard unknown yellow.

## What this does to the frame

Worth being explicit about, because it is a departure from the standard rather than an addition to it.

In APP-6E the frame's fill **is** the standard identity - blue for friend, red for hostile, yellow for
unknown, green for neutral - and a frame amplifier replaces that fill. Battle Order's charts draw every
unit as Friend whichever side they describe, so the fill is free to carry something else.

A consumer of this library therefore gets **branch colour instead of affiliation colour, not as well as
it**. If you need both, this is the wrong extension: that would want a second fill region or a border
treatment, which is a change to how a symbol is composed rather than an entry in the model.

## Status

**Not built yet, and not in the reactor.** This directory holds the extension's documentation; its
model overlay and generator config live with the other models, in
`jmsfx-tools/jmsfx-generator/src/main/resources/`:

| File | What it is |
| --- | --- |
| `model-battleorder.yml` | The overlay - one frame amplifier group, seven values. |
| `config-battleorder.yml` | Where the generated library goes, and under what package. |

The overlay is an overlay, not a whole model, and the generator reads one complete model file rather
than composing one. Composing a library from a base model plus an overlay is
[jmsfx#81](https://github.com/ctgnz/jmsfx/issues/81); this extension is the first thing it will be
tried on, being small enough that the overlay is a dozen lines rather than a copy of the base. Once
#81 lands, this becomes a generated library beside `jmsfx-standard` and `jmsfx-historical`, and joins the
root pom's `<modules>`.

It came in from its own repository as part of [jmsfx#102](https://github.com/ctgnz/jmsfx/issues/102),
which settled on a monorepo: every change here so far has been cross-cutting, and an extension that
needs a generator change to exist at all is the clearest case of that.

## Licence

Apache 2.0, the same as the rest of JMSFX - see `LICENSE.md` at the repository root. The Battle Order
colours are reproduced from their published icon library; the symbology itself is NATO APP-6E.
