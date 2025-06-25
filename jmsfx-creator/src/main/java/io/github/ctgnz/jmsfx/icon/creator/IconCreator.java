package io.github.ctgnz.jmsfx.icon.creator;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

import nz.co.ctg.foxglove.FoxgloveParser;
import nz.co.ctg.foxglove.SvgGraphic;

import io.github.ctgnz.jmsfx.AmplifierGuide;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.Context;
import io.github.ctgnz.jmsfx.CountryCode;
import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.HqtfDummy;
import io.github.ctgnz.jmsfx.IconLibrary;
import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.Status;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.ContextEnum;
import io.github.ctgnz.jmsfx.icon.HqtfDummyEnum;
import io.github.ctgnz.jmsfx.icon.IdentificationSymbol;
import io.github.ctgnz.jmsfx.icon.IdentificationSymbolIcon;
import io.github.ctgnz.jmsfx.icon.StandardIconLibrary;
import io.github.ctgnz.jmsfx.icon.StandardIdentityEnum;
import io.github.ctgnz.jmsfx.icon.StatusEnum;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;
import io.github.ctgnz.jmsfx.icon.amplifier.NatoCountryCode;
import io.github.ctgnz.jmsfx.types.IconScale;
import io.github.ctgnz.jmsfx.types.ScaleDirection;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class IconCreator extends Application {
    private final class PosListCell extends ListCell<Pos> {

        @Override
        protected void updateItem(Pos item, boolean empty) {
            super.updateItem(item, empty);
            setText("");
            if (item == null || empty) {
                setTooltip(null);
                setGraphic(null);
            } else {
                setTooltip(new Tooltip(item.name()));
                setGraphic(new ImageView(new Image(IconCreator.class.getResourceAsStream(String.format("/%s.png", item.name().toLowerCase())))));
            }
        }
    }

    public static void main(String[] args) {
        Application.launch(IconCreator.class, args);
    }

    private IdentificationSymbol symbol;
    private ProgressBar showAllProgress;
    private GridPane amplifierGuidePane;
    private Stage mainStage;
    private FoxgloveParser svgParser = new FoxgloveParser();
    private File lastDirectory;
    private IdentificationSymbolIcon icon;
    private IconLibrary library = StandardIconLibrary.instance();
    private final ObservableList<AmplifierListItem> amplifiers = FXCollections.observableArrayList(Arrays.asList(library.getDefaultAmplifier()));
    private final ObservableList<AmplifierListItem> amplifiersTwo = FXCollections.observableArrayList(Arrays.asList(library.getDefaultAmplifier()));
    private final ObservableList<AmplifierListItem> amplifiersThree = FXCollections.observableArrayList(Arrays.asList(library.getDefaultAmplifier()));
    private final ObservableList<AmplifierListItem> frameAmplifiers = FXCollections.observableArrayList(Arrays.asList(library.getDefaultAmplifier()));
    private final ObservableList<Entity> entities = FXCollections.observableArrayList(library.getDefaultSymbolSet().getEntities());
    private final ObservableList<EntityType> entityTypes = FXCollections.observableArrayList(Arrays.asList(library.getDefaultEntityType()));
    private final ObservableList<EntitySubType> entitySubTypes = FXCollections.observableArrayList(Arrays.asList(library.getDefaultEntitySubType()));
    private final ObservableList<SectorOneModifier> sectorOneModifiers = FXCollections.observableArrayList(library.getCommonSectorOneModifiers());
    private final ObservableList<SectorTwoModifier> sectorTwoModifiers = FXCollections.observableArrayList(library.getCommonSectorTwoModifiers());

    @Override
    public void start(Stage stage) throws Exception {
        this.mainStage = stage;
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(12));

        root.setCenter(createSymbol());
        root.setLeft(createButtons());
        root.setRight(createAmplifierButtons());

        Scene scene = new Scene(root);
        mainStage.setScene(scene);
        mainStage.setResizable(true);
        mainStage.setMaximized(true);
        mainStage.setTitle("Icon Previewer");
        mainStage.show();
    }

    private Node createAmplifierButtons() {
        final CheckBox showGuides = new CheckBox("Show Amplifier Guides");
        symbol.amplifierGuidesVisibleProperty().bind(showGuides.selectedProperty());

        amplifierGuidePane = new GridPane();
        amplifierGuidePane.setVgap(6);
        amplifierGuidePane.setHgap(3);

        final Label title = new Label("Amplifiers");
        title.setStyle("-fx-font-weight: bold; -fx-font-size: 12");
        amplifierGuidePane.add(title, 0, 0);
        amplifierGuidePane.add(showGuides, 0, 1);

        symbol.symbolSetProperty().addListener((obs, oldValue, newValue) -> {
            amplifierGuidePane.getChildren().clear();
            amplifierGuidePane.add(title, 0, 0);
            amplifierGuidePane.add(showGuides, 0, 1);
            AtomicInteger row = new AtomicInteger(2);
            newValue.getAmplifierGuides().forEach(guide -> createAmplifierGuide(row, guide));
        });

        ScrollPane sp = new ScrollPane(amplifierGuidePane);
        sp.setMinWidth(620);
        return sp;
    }

    private void createAmplifierGuide(AtomicInteger row, AmplifierGuide guide) {
        int rowIndex = row.getAndIncrement();

        ComboBox<String> guideSelect = new ComboBox<>(FXCollections.observableArrayList("None", "Text", "Graphic"));
        guideSelect.getSelectionModel().select(0);
        guideSelect.valueProperty().addListener((obs, oldValue, newValue) -> {
            switch (newValue) {
                case "Text":
                    symbol.addTextAmplifier(guide.getAmplifier(), Pos.TOP_LEFT, guide.getCode());
                    break;
                case "Graphic":
                    break;
                default:
                    symbol.removeTextAmplifier(guide.getAmplifier());
                    symbol.removeGraphicAmplifier(guide.getAmplifier());
            }
        });

        ComboBox<Pos> amplifierAttachment = new ComboBox<>(FXCollections.observableArrayList(Pos.values()));
        amplifierAttachment.setCellFactory(p -> new PosListCell());
        amplifierAttachment.setButtonCell(new PosListCell());
        amplifierAttachment.disableProperty().bind(guideSelect.valueProperty().isEqualTo("None"));
        amplifierAttachment.getSelectionModel().select(Pos.TOP_LEFT);
        amplifierAttachment.valueProperty().addListener((obs, oldValue, newValue) -> {
            switch (guideSelect.getValue()) {
                case "Text":
                    symbol.getTextAmplifier(guide.getAmplifier()).setAttachment(newValue);
                    break;
                case "Graphic":
                    symbol.getGraphicAmplifier(guide.getAmplifier()).setAttachment(newValue);
                    break;
            }
        });

        ComboBox<ScaleDirection> amplifierScaleDirection = new ComboBox<>(FXCollections.observableArrayList(ScaleDirection.values()));
        amplifierScaleDirection.disableProperty().bind(guideSelect.valueProperty().isNotEqualTo("Graphic"));
        amplifierScaleDirection.getSelectionModel().select(ScaleDirection.Original);
        amplifierScaleDirection.valueProperty().addListener((obs, oldValue, newValue) -> {
            symbol.getGraphicAmplifier(guide.getAmplifier()).setScaleDirection(newValue);
        });

        TextField amplifierText = new TextField();
        amplifierText.disableProperty().bind(guideSelect.valueProperty().isNotEqualTo("Text"));
        amplifierText.textProperty().addListener((obs, oldValue, newValue) -> {
            symbol.getTextAmplifier(guide.getAmplifier()).setText(newValue);
        });

        Button amplifierGraphic = new Button("...");
        amplifierGraphic.disableProperty().bind(guideSelect.valueProperty().isNotEqualTo("Graphic"));
        amplifierGraphic.setOnAction(evt -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Select Amplifier Graphic");
            fileChooser.getExtensionFilters().add(new ExtensionFilter("SVG Graphic Files", "*.svg"));
            fileChooser.setInitialDirectory(lastDirectory);
            File selectedFile = fileChooser.showOpenDialog(mainStage);
            if (selectedFile != null) {
                lastDirectory = selectedFile.getParentFile();
                SvgGraphic graphic = svgParser.parseFile(selectedFile);
                symbol.addGraphicAmplifier(guide.getAmplifier(), graphic, ScaleDirection.Original, Pos.TOP_LEFT);
            }
        });

        int colIndex = 0;
        amplifierGuidePane.add(new Label(String.format("[%s] %s", guide.getCode(), guide.getAmplifier().getLabel())), colIndex++, rowIndex);
        amplifierGuidePane.add(guideSelect, colIndex++, rowIndex);
        amplifierGuidePane.add(amplifierGraphic, colIndex++, rowIndex);
        amplifierGuidePane.add(amplifierScaleDirection, colIndex++, rowIndex);
        amplifierGuidePane.add(amplifierAttachment, colIndex++, rowIndex);
        amplifierGuidePane.add(amplifierText, colIndex++, rowIndex);
    }

    private Node createButtons() {
        ComboBox<CountryCode> country = new ComboBox<>(FXCollections.observableArrayList(NatoCountryCode.values()));
        country.valueProperty().addListener((obs, oldValue, newValue) -> {
            library.setExtensionCountryCode(newValue);
        });
        country.setCellFactory(p -> new CodeElementListCell<>());
        country.setButtonCell(new CodeElementListCell<>());
        country.setMaxWidth(300);
        country.valueProperty().bindBidirectional(symbol.countryCodeProperty());

        ComboBox<IconScale> scale = new ComboBox<>(FXCollections.observableArrayList(IconScale.values()));
        scale.setCellFactory(p -> new IconScaleListCell());
        scale.setButtonCell(new IconScaleListCell());
        scale.valueProperty().bindBidirectional(symbol.scaleProperty());

        Text sidc = new Text(symbol.getCode());
        // this is only a one-way binding from a read-only property
        sidc.textProperty().bind(symbol.codeProperty());

        ComboBox<Context> context = new ComboBox<>(FXCollections.observableArrayList(ContextEnum.values()));
        context.setCellFactory(p -> new CodeElementListCell<>());
        context.setButtonCell(new CodeElementListCell<>());
        context.setMaxWidth(300);
        context.valueProperty().bindBidirectional(symbol.contextProperty());

        ComboBox<StandardIdentity> stdIdentity = new ComboBox<>(FXCollections.observableArrayList(StandardIdentityEnum.values()));
        stdIdentity.setCellFactory(p -> new CodeElementListCell<>());
        stdIdentity.setButtonCell(new CodeElementListCell<>());
        stdIdentity.setMaxWidth(300);
        stdIdentity.valueProperty().bindBidirectional(symbol.standardIdentityProperty());

        ComboBox<SymbolSet> symbolSet = new ComboBox<>(FXCollections.observableArrayList(SymbolSetEnum.values()));
        symbolSet.setCellFactory(p -> new CodeElementListCell<>());
        symbolSet.setButtonCell(new CodeElementListCell<>());
        symbolSet.setMaxWidth(300);
        symbolSet.valueProperty().bindBidirectional(symbol.symbolSetProperty());

        ComboBox<Status> status = new ComboBox<>(FXCollections.observableArrayList(StatusEnum.values()));
        status.setCellFactory(p -> new CodeElementListCell<>());
        status.setButtonCell(new CodeElementListCell<>());
        status.setMaxWidth(300);
        status.valueProperty().bindBidirectional(symbol.statusProperty());

        ComboBox<HqtfDummy> hqtfDummy = new ComboBox<>(FXCollections.observableArrayList(HqtfDummyEnum.values()));
        hqtfDummy.setCellFactory(p -> new CodeElementListCell<>());
        hqtfDummy.setButtonCell(new CodeElementListCell<>());
        hqtfDummy.setMaxWidth(300);
        hqtfDummy.valueProperty().bindBidirectional(symbol.hqtfDummyProperty());

        ComboBox<AmplifierListItem> amplifier = new ComboBox<>(amplifiers);
        amplifier.setCellFactory(p -> new CodeElementListCell<>());
        amplifier.setButtonCell(new CodeElementListCell<>());
        amplifier.setMaxWidth(300);
        amplifier.valueProperty().bindBidirectional(symbol.amplifierProperty());
        amplifier.disableProperty().bind(Bindings.size(amplifiers).lessThan(2));

        ComboBox<AmplifierListItem> amplifierTwo = new ComboBox<>(amplifiersTwo);
        amplifierTwo.setCellFactory(p -> new CodeElementListCell<>());
        amplifierTwo.setButtonCell(new CodeElementListCell<>());
        amplifierTwo.setMaxWidth(300);
        amplifierTwo.valueProperty().bindBidirectional(symbol.amplifierTwoProperty());
        amplifierTwo.disableProperty().bind(Bindings.size(amplifiersTwo).lessThan(2));

        ComboBox<AmplifierListItem> amplifierThree = new ComboBox<>(amplifiersThree);
        amplifierThree.setCellFactory(p -> new CodeElementListCell<>());
        amplifierThree.setButtonCell(new CodeElementListCell<>());
        amplifierThree.setMaxWidth(300);
        amplifierThree.valueProperty().bindBidirectional(symbol.amplifierThreeProperty());
        amplifierThree.disableProperty().bind(Bindings.size(amplifiersThree).lessThan(2));

        ComboBox<AmplifierListItem> frameAmplifier = new ComboBox<>(frameAmplifiers);
        frameAmplifier.setCellFactory(p -> new CodeElementListCell<>());
        frameAmplifier.setButtonCell(new CodeElementListCell<>());
        frameAmplifier.setMaxWidth(300);
        frameAmplifier.valueProperty().bindBidirectional(symbol.frameAmplifierProperty());
        frameAmplifier.disableProperty().bind(Bindings.size(frameAmplifiers).lessThan(2));

        ComboBox<Entity> entity = new ComboBox<>(entities);
        entity.setCellFactory(p -> new CodeElementListCell<>());
        entity.setButtonCell(new CodeElementListCell<>());
        entity.setMaxWidth(300);
        entity.valueProperty().bindBidirectional(symbol.entityProperty());
        entity.valueProperty().addListener((obs, oldValue, newValue) -> {
            entityTypes.retainAll(library.getDefaultEntityType());
            if (newValue != null) {
                entityTypes.addAll(newValue.getEntityTypes());
            }
        });

        ComboBox<EntityType> entityType = new ComboBox<>(entityTypes);
        entityType.setCellFactory(p -> new CodeElementListCell<>());
        entityType.setButtonCell(new CodeElementListCell<>());
        entityType.setMaxWidth(300);
        entityType.disableProperty().bind(Bindings.size(entityTypes).isEqualTo(1));
        entityType.valueProperty().bindBidirectional(symbol.entityTypeProperty());
        entityType.valueProperty().addListener((obs, oldValue, newValue) -> {
            entitySubTypes.retainAll(library.getDefaultEntitySubType());
            if (newValue != null) {
                entitySubTypes.addAll(newValue.getEntitySubTypes());
            }
        });

        ComboBox<EntitySubType> entitySubType = new ComboBox<>(entitySubTypes);
        entitySubType.setCellFactory(p -> new CodeElementListCell<>());
        entitySubType.setButtonCell(new CodeElementListCell<>());
        entitySubType.setMaxWidth(300);
        entitySubType.disableProperty().bind(Bindings.size(entitySubTypes).isEqualTo(1));
        entitySubType.valueProperty().bindBidirectional(symbol.entitySubTypeProperty());

        ComboBox<SectorOneModifier> mod1 = new ComboBox<>(sectorOneModifiers);
        mod1.setCellFactory(p -> new CodeElementListCell<>());
        mod1.setButtonCell(new CodeElementListCell<>());
        mod1.setMaxWidth(300);
        mod1.disableProperty().bind(Bindings.isEmpty(sectorOneModifiers));
        mod1.valueProperty().bindBidirectional(symbol.sectorOneModifierProperty());

        ComboBox<SectorTwoModifier> mod2 = new ComboBox<>(sectorTwoModifiers);
        mod2.setCellFactory(p -> new CodeElementListCell<>());
        mod2.setButtonCell(new CodeElementListCell<>());
        mod2.setMaxWidth(300);
        mod2.disableProperty().bind(Bindings.isEmpty(sectorTwoModifiers));
        mod2.valueProperty().bindBidirectional(symbol.sectorTwoModifierProperty());

        symbolSet.valueProperty().addListener((obs, oldValue, newValue) -> {
            amplifiers.retainAll(library.getDefaultAmplifier());
            amplifiers.addAll(newValue.getAmplifierList());
            amplifiersTwo.retainAll(library.getDefaultAmplifier());
            amplifiersTwo.addAll(newValue.getAmplifierListTwo());
            amplifiersThree.retainAll(library.getDefaultAmplifier());
            amplifiersThree.addAll(newValue.getAmplifierListThree());
            frameAmplifiers.retainAll(library.getDefaultAmplifier());
            frameAmplifiers.addAll(newValue.getFrameAmplifierList());
            sectorOneModifiers.retainAll(library.getCommonSectorOneModifiers());
            sectorOneModifiers.addAll(newValue.getSectorOneModifiers());
            sectorOneModifiers.sort(SectorOneModifier.VIEW_ORDER);
            sectorTwoModifiers.retainAll(library.getCommonSectorTwoModifiers());
            sectorTwoModifiers.addAll(newValue.getSectorTwoModifiers());
            sectorTwoModifiers.sort(SectorTwoModifier.VIEW_ORDER);
            entities.retainAll(library.getDefaultEntity());
            entities.addAll(newValue.getEntities());
        });

        GridPane gridPane = new GridPane();
        gridPane.setVgap(12);
        gridPane.setHgap(6);

        int row = 0;
        gridPane.add(new Label("Country:"), 0, row);
        gridPane.add(country, 1, row++);

        gridPane.add(new Label("Icon Scale:"), 0, row);
        gridPane.add(scale, 1, row++);

        gridPane.add(new Label("SIDC:"), 0, row);
        gridPane.add(sidc, 1, row++);

        gridPane.add(new Label("Context:"), 0, row);
        gridPane.add(context, 1, row++);

        gridPane.add(new Label("Standard Identity:"), 0, row);
        gridPane.add(stdIdentity, 1, row++);

        gridPane.add(new Label("Symbol Set:"), 0, row);
        gridPane.add(symbolSet, 1, row++);

        gridPane.add(new Label("Status:"), 0, row);
        gridPane.add(status, 1, row++);

        gridPane.add(new Label("HQ/TF/Dummy:"), 0, row);
        gridPane.add(hqtfDummy, 1, row++);

        gridPane.add(new Label("Amplifier 1:"), 0, row);
        gridPane.add(amplifier, 1, row++);

        gridPane.add(new Label("Amplifier 2:"), 0, row);
        gridPane.add(amplifierTwo, 1, row++);

        gridPane.add(new Label("Amplifier 3:"), 0, row);
        gridPane.add(amplifierThree, 1, row++);

        gridPane.add(new Label("Frame Amplifier:"), 0, row);
        gridPane.add(frameAmplifier, 1, row++);

        gridPane.add(new Label("Entity:"), 0, row);
        gridPane.add(entity, 1, row++);

        gridPane.add(new Label("Entity Type:"), 0, row);
        gridPane.add(entityType, 1, row++);

        gridPane.add(new Label("Entity Sub-Type:"), 0, row);
        gridPane.add(entitySubType, 1, row++);

        gridPane.add(new Label("Sector 1 Mod:"), 0, row);
        gridPane.add(mod1, 1, row++);

        gridPane.add(new Label("Sector 2 Mod:"), 0, row);
        gridPane.add(mod2, 1, row++);

        Button showAll = new Button("Show All");
        showAll.setOnAction(evt -> {
            Dialog<String> dialog = new Dialog<>();
            dialog.getDialogPane().setContent(new IconGallery(library, mainStage));
            dialog.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);
            dialog.setOnShown(e2 -> {
                Stage window = (Stage) dialog.getDialogPane().getScene().getWindow();
                window.setMaximized(true);
            });
            dialog.show();
        });
        gridPane.add(showAll, 1, row++);

        showAllProgress = new ProgressBar();
        showAllProgress.setVisible(false);
        gridPane.add(showAllProgress, 0, row++, 2, 1);

        Button clearCache = new Button("Clear Cache");
        clearCache.setOnAction(evt -> FoxgloveParser.clearCache());
        gridPane.add(clearCache, 1, row++);

        return gridPane;
    }

    private Node createSymbol() {
        this.symbol = new IdentificationSymbol(library);
        this.icon = symbol.createIcon();
        icon.setFillBackground(true);
        symbol.codeProperty().addListener((obs, oldValue, newValue) -> {
            icon.setLayoutX(icon.getLayoutBounds().getMinX());
            icon.setLayoutY(icon.getLayoutBounds().getMinY());
        });
        Group stack = new Group(icon);
        BorderPane.setAlignment(stack, Pos.TOP_CENTER);
        return stack;
    }

}
