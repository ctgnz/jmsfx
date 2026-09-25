# JMSFX Extension for Battle Order

An extension to the [JMSFX](https://github.com/ctgnz/jmsfx) APP-6E symbology model that colours a
unit's frame by its branch of service, following the convention used by
[Battle Order](https://www.battleorder.org/icons)'s icon library.

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

`model-battleorder.yml` is the extension overlay, and at the moment that is all this repository holds.

Generating a library from a base model plus an overlay is [jmsfx#81](https://github.com/ctgnz/jmsfx/issues/81),
and is part of the 2.0.0 release. Until it lands there is no build here: the existing generator reads one
whole model file rather than composing one, which is exactly what #81 exists to change. This extension is
the first thing it will be tried on, being small enough that the overlay is seven lines rather than a
copy of the base.

## Licence

Apache 2.0, the same as JMSFX. The Battle Order colours are reproduced from their published icon library;
the symbology itself is NATO APP-6E.
