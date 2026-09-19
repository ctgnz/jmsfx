# JMSFX - Joint Military Symbology on JavaFX

[![Java CI with Maven](https://github.com/ctgnz/jmsfx/actions/workflows/maven.yml/badge.svg)](https://github.com/ctgnz/jmsfx/actions/workflows/maven.yml)
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](LICENSE.md)

A JavaFX implementation of **NATO APP-6, Edition E (2023)** military symbology - the standard set of symbols used to represent units, equipment, installations and activities on a military map.

Symbols are composed and rendered as ordinary `javafx.scene.Node`s, by way of [foxglove](https://github.com/ctgnz/foxglove), so they can be styled, transformed and embedded in a scene graph like any other JavaFX content. The same model also serialises back out to SVG, or rasterises to PNG.

> **APP-6E, not MIL-STD-2525D.** The two are related and largely converged, but they are formally distinct documents and differ in detail. This project targets the NATO standard. Its data lineage comes from Esri's `joint-military-symbology-xml` (JMSML), which modelled MIL-STD-2525D specifically; that project is no longer maintained, and JMSFX now owns the schema and instance data going forward.

## Try it

**[jmsfx.ctg.co.nz](https://jmsfx.ctg.co.nz/)** - browse the symbol sets and compose icons in the browser, with SVG and PNG export. It runs the `jmsfx-server` module from this repository.

## How a symbol is put together

Every icon is drawn inside a standard `viewBox="0 0 612 792"`, and is composed of independently selectable parts, each with a fixed, well-defined position:

- the **frame**, which carries identity and dimension,
- the **main icon**, identifying the entity itself,
- two **sector modifiers**, qualifying it further,
- and a number of **amplifiers**, varying by symbol set.

Rendering is therefore a matter of choosing the SVG for each part and layering them in a defined order - there is no per-icon layout. `IdentificationSymbol` models the chosen parts and their state; `IdentificationSymbolIcon` is the JavaFX `Node` that draws it.

## The model is generated, not hand-written

APP-6E is deliberately designed so that a consumer can extend the base symbology - adding or removing elements for its own domain. Hand-maintaining the resulting combinations is impractical, so the domain model is generated instead: `jmsfx-generator` reads a YAML model and emits the Java for `jmsfx-standard`. Revisions to the standard, and per-consumer extensions, are absorbed by regenerating rather than by editing thousands of classes.

## Modules

| Module | What it is |
|---|---|
| `jmsfx-core` | The symbology API - symbol sets, entities, modifiers, amplifiers, and the rendering model. |
| `jmsfx-standard` | The generated APP-6E domain model. Not hand-written; see above. |
| `jmsfx-generator` | Generates `jmsfx-standard` from a YAML model, via FreeMarker templates. |
| `jmsfx-creator` | Desktop application for composing icons and saving them as composite SVG. |
| `jmsfx-editor` | Desktop application for editing the YAML model itself, rather than composing icons. |
| `jmsfx-server` | Spring Boot web application exposing the same capability over HTTP - this is what runs the site above. |

## Building

Requires **JDK 25** and Maven. JMSFX is not yet published to Maven Central, so build it from source:

```sh
git clone --recurse-submodules https://github.com/ctgnz/jmsfx.git
cd jmsfx
mvn install
```

The `--recurse-submodules` matters: `jmsfx-server` takes its branding stylesheet from the [ctg-brand](https://github.com/ctgnz/ctg-brand) submodule, and Maven will quietly skip the missing directory rather than fail if it is absent.

To run the web application locally:

```sh
mvn -pl jmsfx-server -am verify
java -jar jmsfx-server/target/jmsfx-server-*.jar
```

It serves on port 8080 by default.

The web application runs headless, with no display or JavaFX toolkit required - icons are composed and served as SVG. It deliberately does not rasterise: converting SVG to other formats is a job existing tools already do well.

## Licence

Apache License 2.0 - see [LICENSE.md](LICENSE.md).
