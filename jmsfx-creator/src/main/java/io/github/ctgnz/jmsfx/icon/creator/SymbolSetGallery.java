package io.github.ctgnz.jmsfx.icon.creator;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

import io.github.ctgnz.jmsfx.CodeElement;
import io.github.ctgnz.jmsfx.IconLibrary;
import io.github.ctgnz.jmsfx.icon.HqtfDummyEnum;
import io.github.ctgnz.jmsfx.icon.IdentificationSymbol;
import io.github.ctgnz.jmsfx.icon.StandardIdentityEnum;
import io.github.ctgnz.jmsfx.icon.StatusEnum;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.IconScale;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

public class SymbolSetGallery extends BorderPane {
    private SymbolSetEnum symbolSet;
    private IconLibrary library;

    public SymbolSetGallery(IconLibrary library, SymbolSetEnum symbolSet) {
        this.library = library;
        this.symbolSet = symbolSet;
        setCenter(new VBox(createFrames(), createStatus(), createHqtfDummy(), createSector1(), createSector2()));
        setRight(createMainIcons());
    }

    private Node createFrames() {
        TilePane flowPane = new TilePane();
        Arrays.stream(StandardIdentityEnum.values()).forEach(stdId -> {
            IdentificationSymbol symbol = createDefaultSymbol(flowPane, stdId);
            symbol.setStandardIdentity(stdId);
        });
        TitledPane framePane = new TitledPane("Frames", flowPane);
        framePane.setCollapsible(false);
        return framePane;
    }

    private Node createHqtfDummy() {
        TilePane flowPane = new TilePane();
        Arrays.stream(HqtfDummyEnum.values()).filter(status -> status.isSupported(symbolSet)).forEach(hqtfDummy -> {
            IdentificationSymbol symbol = createDefaultSymbol(flowPane, hqtfDummy);
            symbol.setHqtfDummy(hqtfDummy);
        });
        TitledPane hqtfDummyPane = new TitledPane("HQ/TF/Dummy/Feint", flowPane);
        hqtfDummyPane.setCollapsible(false);
        return hqtfDummyPane;
    }

    private Node createMainIcons() {
        TilePane flowPane = new TilePane();
        symbolSet.getEntities().forEach(entity -> {
            IdentificationSymbol entitySymbol = createDefaultSymbol(flowPane, entity);
            entitySymbol.setEntity(entity);
            entity.getEntityTypes().forEach(entityType -> {
                IdentificationSymbol entityTypeSymbol = createDefaultSymbol(flowPane, entityType);
                entityTypeSymbol.setEntityType(entityType);
                entityType.getEntitySubTypes().forEach(subType -> {
                    IdentificationSymbol subTypeSymbol = createDefaultSymbol(flowPane, subType);
                    subTypeSymbol.setEntitySubType(subType);
                });
            });
        });
        TitledPane mainIconPane = new TitledPane("Main Icons", flowPane);
        mainIconPane.minWidthProperty().bind(widthProperty().divide(2));
        mainIconPane.setCollapsible(false);
        return mainIconPane;
    }

    private Node createSector1() {
        TilePane flowPane = new TilePane();
        TitledPane mod1Pane = new TitledPane("Sector 1 Modifiers", flowPane);
        symbolSet.getSectorOneModifiers().forEach(mod -> {
            IdentificationSymbol symbol = createDefaultSymbol(flowPane, mod);
            symbol.setSectorOneModifier(mod);
        });
        mod1Pane.setCollapsible(false);
        return mod1Pane;
    }

    private Node createSector2() {
        TilePane flowPane = new TilePane();
        symbolSet.getSectorTwoModifiers().forEach(mod -> {
            IdentificationSymbol symbol = createDefaultSymbol(flowPane, mod);
            symbol.setSectorTwoModifier(mod);
        });
        TitledPane mod2Pane = new TitledPane("Sector 2 Modifiers", flowPane);
        mod2Pane.setCollapsible(false);
        return mod2Pane;
    }

    private Node createStatus() {
        TilePane flowPane = new TilePane();
        Arrays.stream(StatusEnum.values()).filter(status -> status.isSupported(symbolSet)).forEach(status -> {
            IdentificationSymbol symbol = createDefaultSymbol(flowPane, status);
            symbol.setStatus(status);
        });
        TitledPane statusPane = new TitledPane("Status", flowPane);
        statusPane.setCollapsible(false);
        return statusPane;
    }

    protected IdentificationSymbol createDefaultSymbol(TilePane tilePane, CodeElement element) {
        IdentificationSymbol symbol = new IdentificationSymbol(library);
        symbol.setSymbolSet(symbolSet);
        symbol.setScale(IconScale.MediumSmall);
        Label label = new Label(StringUtils.abbreviate(element.getLabel(), 24), symbol.createIcon());
        label.setTooltip(new Tooltip(element.getLabel()));
        label.setContentDisplay(ContentDisplay.TOP);
        TilePane.setAlignment(label, Pos.BOTTOM_CENTER);
        tilePane.getChildren().add(label);
        return symbol;
    }


}
