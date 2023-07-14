package nz.co.ctg.jmsfx.icon;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import nz.co.ctg.foxglove.FoxgloveParser;
import nz.co.ctg.foxglove.SvgGraphic;
import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.AmplifierGuide;
import nz.co.ctg.jmsfx.model.Context;
import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.FrameAmplifierGroup;
import nz.co.ctg.jmsfx.model.HqtfDummy;
import nz.co.ctg.jmsfx.model.SectorOneModifier;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;
import nz.co.ctg.jmsfx.model.StandardIdentity;
import nz.co.ctg.jmsfx.model.Status;
import nz.co.ctg.jmsfx.model.SymbolIdentificationCode;
import nz.co.ctg.jmsfx.model.SymbolSet;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class IdentificationSymbolIconPreview extends Application {
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
                setGraphic(new ImageView(new Image(IdentificationSymbolIconPreview.class.getResourceAsStream(String.format("/%s.png", item.name().toLowerCase())))));
            }
        }
    }

    public static void main(String[] args) {
        Application.launch(IdentificationSymbolIconPreview.class, args);
    }

    private IdentificationSymbol symbol;
    private ProgressBar showAllProgress;
    private GridPane amplifiers;
    private Stage mainStage;
    private FoxgloveParser svgParser = new FoxgloveParser();
    private File lastDirectory;

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

        amplifiers = new GridPane();
        amplifiers.setVgap(12);
        amplifiers.setHgap(6);

        final Label title = new Label("Amplifiers");
        title.setStyle("-fx-font-weight: bold; -fx-font-size: 12");
        amplifiers.add(title, 0, 0);
        amplifiers.add(showGuides, 0, 1);

        symbol.symbolSetProperty().addListener((obs, oldValue, newValue) -> {
            amplifiers.getChildren().clear();
            amplifiers.add(title, 0, 0);
            amplifiers.add(showGuides, 0, 1);
            AtomicInteger row = new AtomicInteger(2);
            newValue.getAmplifierGuides().forEach(guide -> createAmplifierGuide(row, guide));
        });

        return amplifiers;
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
        amplifiers.add(new Label(String.format("[%s] %s", guide.getCode(), guide.getAmplifier().getLabel())), colIndex++, rowIndex);
        amplifiers.add(guideSelect, colIndex++, rowIndex);
        amplifiers.add(amplifierGraphic, colIndex++, rowIndex);
        amplifiers.add(amplifierScaleDirection, colIndex++, rowIndex);
        amplifiers.add(amplifierAttachment, colIndex++, rowIndex);
        amplifiers.add(amplifierText, colIndex++, rowIndex);
    }

    private Node createButtons() {
        ComboBox<String> country = new ComboBox<>(FXCollections.observableArrayList("Scotland", "United Kingdom", "USA"));
        country.valueProperty().addListener((obs, oldValue, newValue) -> {
            switch (newValue) {
                case "Scotland":
                    SymbolIdentificationCode.setExtensionCountryCode("684");
                    break;
                case "United Kingdom":
                    SymbolIdentificationCode.setExtensionCountryCode("826");
                    break;
                case "USA":
                    SymbolIdentificationCode.setExtensionCountryCode("840");
                    break;
            }
        });
        country.getSelectionModel().select(0);

        ComboBox<IconScale> scale = new ComboBox<>(FXCollections.observableArrayList(IconScale.values()));
        scale.setCellFactory(p -> new IconScaleListCell());
        scale.setButtonCell(new IconScaleListCell());
        scale.valueProperty().bindBidirectional(symbol.scaleProperty());

        Text sidc = new Text(symbol.getCode().toString());
        // this is only a one-way binding from a read-only property
        sidc.textProperty().bind(symbol.codeProperty());

        ComboBox<Context> context = new ComboBox<>(FXCollections.observableArrayList(Context.values()));
        context.setCellFactory(p -> new SymbolIdentificationCodeElementListCell<>());
        context.setButtonCell(new SymbolIdentificationCodeElementListCell<>());
        context.setMaxWidth(300);
        context.valueProperty().bindBidirectional(symbol.contextProperty());

        ComboBox<StandardIdentity> stdIdentity = new ComboBox<>(FXCollections.observableArrayList(StandardIdentity.values()));
        stdIdentity.setCellFactory(p -> new SymbolIdentificationCodeElementListCell<>());
        stdIdentity.setButtonCell(new SymbolIdentificationCodeElementListCell<>());
        stdIdentity.setMaxWidth(300);
        stdIdentity.valueProperty().bindBidirectional(symbol.standardIdentityProperty());

        ComboBox<SymbolSet> symbolSet = new ComboBox<>(FXCollections.observableArrayList(SymbolSet.values()));
        symbolSet.setCellFactory(p -> new SymbolIdentificationCodeElementListCell<>());
        symbolSet.setButtonCell(new SymbolIdentificationCodeElementListCell<>());
        symbolSet.setMaxWidth(300);
        symbolSet.valueProperty().bindBidirectional(symbol.symbolSetProperty());

        ComboBox<Status> status = new ComboBox<>(FXCollections.observableArrayList(Status.values()));
        status.setCellFactory(p -> new SymbolIdentificationCodeElementListCell<>());
        status.setButtonCell(new SymbolIdentificationCodeElementListCell<>());
        status.setMaxWidth(300);
        status.valueProperty().bindBidirectional(symbol.statusProperty());

        ComboBox<HqtfDummy> hqtfDummy = new ComboBox<>(FXCollections.observableArrayList(HqtfDummy.values()));
        hqtfDummy.setCellFactory(p -> new SymbolIdentificationCodeElementListCell<>());
        hqtfDummy.setButtonCell(new SymbolIdentificationCodeElementListCell<>());
        hqtfDummy.setMaxWidth(300);
        hqtfDummy.valueProperty().bindBidirectional(symbol.hqtfDummyProperty());

        ComboBox<AmplifierGroup> amplifier = new ComboBox<>(symbol.amplifierGroupsList());
        amplifier.setCellFactory(p -> new SymbolIdentificationCodeElementListCell<>());
        amplifier.setButtonCell(new SymbolIdentificationCodeElementListCell<>());
        amplifier.setMaxWidth(300);
        amplifier.valueProperty().bindBidirectional(symbol.amplifierProperty());
        amplifier.disableProperty().bind(Bindings.size(symbol.amplifierGroupsList()).lessThan(2));

        ComboBox<AmplifierGroup> amplifierTwo = new ComboBox<>(symbol.amplifierTwoGroupsList());
        amplifierTwo.setCellFactory(p -> new SymbolIdentificationCodeElementListCell<>());
        amplifierTwo.setButtonCell(new SymbolIdentificationCodeElementListCell<>());
        amplifierTwo.setMaxWidth(300);
        amplifierTwo.valueProperty().bindBidirectional(symbol.amplifierTwoProperty());
        amplifierTwo.disableProperty().bind(Bindings.size(symbol.amplifierTwoGroupsList()).lessThan(2));

        ComboBox<AmplifierGroup> amplifierThree = new ComboBox<>(symbol.amplifierThreeGroupsList());
        amplifierThree.setCellFactory(p -> new SymbolIdentificationCodeElementListCell<>());
        amplifierThree.setButtonCell(new SymbolIdentificationCodeElementListCell<>());
        amplifierThree.setMaxWidth(300);
        amplifierThree.valueProperty().bindBidirectional(symbol.amplifierThreeProperty());
        amplifierThree.disableProperty().bind(Bindings.size(symbol.amplifierThreeGroupsList()).lessThan(2));

        ComboBox<FrameAmplifierGroup> frameAmplifier = new ComboBox<>(symbol.frameAmplifierGroupsList());
        frameAmplifier.setCellFactory(p -> new SymbolIdentificationCodeElementListCell<>());
        frameAmplifier.setButtonCell(new SymbolIdentificationCodeElementListCell<>());
        frameAmplifier.setMaxWidth(300);
        frameAmplifier.valueProperty().bindBidirectional(symbol.frameAmplifierProperty());
        frameAmplifier.disableProperty().bind(Bindings.size(symbol.frameAmplifierGroupsList()).lessThan(2));

        ComboBox<Entity> entity = new ComboBox<>(symbol.entitiesList());
        entity.setCellFactory(p -> new SymbolIdentificationCodeElementListCell<>());
        entity.setButtonCell(new SymbolIdentificationCodeElementListCell<>());
        entity.setMaxWidth(300);
        entity.valueProperty().bindBidirectional(symbol.entityProperty());

        ComboBox<EntityType> entityType = new ComboBox<>(symbol.entityTypesList());
        entityType.setCellFactory(p -> new SymbolIdentificationCodeElementListCell<>());
        entityType.setButtonCell(new SymbolIdentificationCodeElementListCell<>());
        entityType.setMaxWidth(300);
        entityType.disableProperty().bind(Bindings.isEmpty(symbol.entityTypesList()));
        entityType.valueProperty().bindBidirectional(symbol.entityTypeProperty());

        ComboBox<EntitySubType> entitySubType = new ComboBox<>(symbol.entitySubTypesList());
        entitySubType.setCellFactory(p -> new SymbolIdentificationCodeElementListCell<>());
        entitySubType.setButtonCell(new SymbolIdentificationCodeElementListCell<>());
        entitySubType.setMaxWidth(300);
        entitySubType.disableProperty().bind(Bindings.isEmpty(symbol.entitySubTypesList()));
        entitySubType.valueProperty().bindBidirectional(symbol.entitySubTypeProperty());

        ComboBox<SectorOneModifier> mod1 = new ComboBox<>(symbol.sectorOneModifiersList());
        mod1.setCellFactory(p -> new SymbolIdentificationCodeElementListCell<>());
        mod1.setButtonCell(new SymbolIdentificationCodeElementListCell<>());
        mod1.setMaxWidth(300);
        mod1.disableProperty().bind(Bindings.isEmpty(symbol.sectorOneModifiersList()));
        mod1.valueProperty().bindBidirectional(symbol.sectorOneModifierProperty());

        ComboBox<SectorTwoModifier> mod2 = new ComboBox<>(symbol.sectorTwoModifiersList());
        mod2.setCellFactory(p -> new SymbolIdentificationCodeElementListCell<>());
        mod2.setButtonCell(new SymbolIdentificationCodeElementListCell<>());
        mod2.setMaxWidth(300);
        mod2.disableProperty().bind(Bindings.isEmpty(symbol.sectorTwoModifiersList()));
        mod2.valueProperty().bindBidirectional(symbol.sectorTwoModifierProperty());

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
        showAll.setOnAction(evt -> testParseAll());
        gridPane.add(showAll, 1, row++);

        showAllProgress = new ProgressBar();
        showAllProgress.setVisible(false);
        gridPane.add(showAllProgress, 0, row++, 2, 1);

        Button clearCache = new Button("Clear Cache");
        clearCache.setOnAction(evt -> FoxgloveParser.clearCache());
        gridPane.add(clearCache, 1, row++);

        return gridPane;
    }

    private VBox createSymbol() {
        symbol = new IdentificationSymbol(svgParser);
        VBox vBox = new VBox(symbol.createIcon());
        vBox.setPadding(new Insets(24));
        return vBox;
    }

    private void testModifierEvents(List<Runnable> events, SymbolSet symbolSet) {
        symbolSet.getAmplifierGroups().forEach(amplifier -> {
            events.add(() -> {
                System.out.format("\t\tAmplifier: %s%n", amplifier.getLabel());
                symbol.amplifierProperty().set(amplifier);
            });
        });
        events.add(() -> {
            symbol.amplifierProperty().set(null);
        });
        symbolSet.getSectorOneModifiers().forEach(mod -> {
            events.add(() -> {
                if (!mod.isUnknown()) {
                    System.out.format("\t\tMod 1: %s%n", mod.getLabel());
                    symbol.sectorOneModifierProperty().set(mod);
                }
            });
        });
        events.add(() -> {
            symbol.sectorOneModifierProperty().set(null);
        });
        symbolSet.getSectorTwoModifiers().forEach(mod -> {
            events.add(() -> {
                if (!mod.isUnknown()) {
                    System.out.format("\t\tMod 2: %s%n", mod.getLabel());
                    symbol.sectorTwoModifierProperty().set(mod);
                }
            });
        });
        events.add(() -> {
            symbol.sectorTwoModifierProperty().set(null);
        });
    }

    private void testParseAll() {
        System.out.println("Collecting combinations");
        List<Runnable> events = new ArrayList<>();
        Arrays.stream(SymbolSet.values()).forEach(symbolSet -> {
            events.add(() -> {
                symbol.symbolSetProperty().set(symbolSet);
            });
            Arrays.stream(Context.values()).forEach(ctx -> {
                events.add(() -> {
                    symbol.contextProperty().set(ctx);
                });
                Arrays.stream(StandardIdentity.values()).forEach(stdId -> {
                    events.add(() -> {
                        symbol.standardIdentityProperty().set(stdId);
                    });
                });
            });
            events.add(() -> {
                symbol.contextProperty().set(Context.REALITY);
                symbol.standardIdentityProperty().set(StandardIdentity.SI_FRIEND);
            });
            testModifierEvents(events, symbolSet);
            symbolSet.getEntities().forEach(entity -> {
                events.add(() -> {
                    System.out.format("\tEntity: %s%n", entity.getLabel());
                    symbol.entityProperty().set(entity);
                });
                entity.getEntityTypes().forEach(entityType -> {
                    events.add(() -> {
                        System.out.format("\t\tEntity Type: %s%n", entityType.getLabel());
                        symbol.entityTypeProperty().set(entityType);
                    });
                    entityType.getEntitySubTypes().forEach(subType -> {
                        events.add(() -> {
                            System.out.format("\t\t\tEntity Sub-Type: %s%n", subType.getLabel());
                            symbol.entitySubTypeProperty().set(subType);
                        });
                    });
                });
            });
        });
        final AtomicInteger showAllCounter = new AtomicInteger(0);
        final double totalEvents = events.size();
        new Thread(() -> {
            System.out.println("Starting show");
            Platform.runLater(() -> showAllProgress.setVisible(true));
            events.forEach(action -> {
                Platform.runLater(() -> {
                    showAllProgress.setProgress(showAllCounter.incrementAndGet() / totalEvents);
                });
                Platform.runLater(action);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            });
            Platform.runLater(() -> showAllProgress.setVisible(false));
        }).start();
    }

}
