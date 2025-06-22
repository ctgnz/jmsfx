package io.github.ctgnz.jmsfx.icon;

import io.github.ctgnz.jmsfx.Amplifier;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.MapChangeListener;
import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.scene.transform.Transform;

public class IdentificationSymbolIcon extends Pane {
    private final Group container = new Group();
    private final IdentificationSymbol symbol;
    private final BooleanProperty fillBackground = new SimpleBooleanProperty(false);

    protected IdentificationSymbolIcon(IdentificationSymbol symbol) {
        this.symbol = symbol;
        getChildren().add(container);
        symbol.scaleProperty().addListener((obs, oldValue, newValue) -> updateScale(newValue));
        symbol.codeProperty().addListener((obs, oldValue, newValue) -> updateIcon());
        symbol.amplifierGuidesVisibleProperty().addListener((obs, oldValue, newValue) -> updateIcon());
        symbol.getTextAmplifiers().addListener((MapChangeListener<Amplifier, TextAmplifierValue>) change -> {
            TextAmplifierValue newAmplifier = change.getValueAdded();
            if (newAmplifier != null) {
                newAmplifier.locationProperty().addListener((obs, oldValue, newValue) -> updateIcon());
            }
            updateIcon();
        });
        symbol.getGraphicAmplifiers().addListener((MapChangeListener<Amplifier, GraphicAmplifierValue>) change -> {
            GraphicAmplifierValue newGraphic = change.getValueAdded();
            if (newGraphic != null) {
                newGraphic.transformProperty().addListener((obs, oldValue, newValue) -> updateIcon());
            }
            updateIcon();
        });
        updateScale(symbol.getScale());
    }

    public BooleanProperty fillBackgroundProperty() {
        return fillBackground;
    }

    public IdentificationSymbol getSymbol() {
        return symbol;
    }

    public boolean isFillBackground() {
        return fillBackground.get();
    }

    public void setFillBackground(boolean fillBackground) {
        this.fillBackground.set(fillBackground);
    }

    protected void updateIcon() {
        container.getChildren().clear();
        if (isFillBackground()) {
            Rectangle bg = new Rectangle(0, 0, 612, 792);
            bg.setStroke(Color.BLACK);
            bg.setStrokeWidth(1);
            bg.setFill(Color.WHITE);
            container.getChildren().add(bg);
        }
        if (symbol.isFrameUsed()) {
            Group frame = symbol.getFrameGraphic().createGroup();
            container.getChildren().add(frame);
            if (symbol.isFrameOverlayUsed()) {
                Group overlay = symbol.getFrameOverlayGraphic().createGroup();
                container.getChildren().add(overlay);
            }
            if (symbol.isFrameAmplifierUsed()) {
                AmplifierListItem frameAmplifier = symbol.getFrameAmplifier();
                replaceFill(frame, Color.web(frameAmplifier.getBackgroundFill()));
            }
        }
        if (symbol.isStatusIconUsed()) {
            container.getChildren().add(symbol.getStatusGraphic().createGroup());
        }
        if (symbol.isHqtfDummyIconUsed()) {
            container.getChildren().add(symbol.getHqtfDummyGraphic().createGroup());
        }
        if (symbol.isMainIconUsed()) {
            container.getChildren().add(symbol.getMainIconGraphic().createGroup());
        }
        if (symbol.isAmplifierUsed()) {
            container.getChildren().add(symbol.getAmplifierGraphic().createGroup());
        }
        if (symbol.isAmplifierTwoUsed()) {
            container.getChildren().add(symbol.getAmplifierTwoGraphic().createGroup());
        }
        if (symbol.isAmplifierThreeUsed()) {
            container.getChildren().add(symbol.getAmplifierThreeGraphic().createGroup());
        }
        if (symbol.isSectorOneModifierUsed()) {
            container.getChildren().add(symbol.getSectorOneModifierGraphic().createGroup());
        }
        if (symbol.isSectorTwoModifierUsed()) {
            container.getChildren().add(symbol.getSectorTwoModifierGraphic().createGroup());
        }
        if (symbol.isAmplifierTemplateVisible()) {
            symbol.getSymbolSet().getAmplifierGuides().forEach(guide -> {
                Shape shape = guide.getShape();
                shape.setStrokeWidth(2);
                shape.setStroke(Color.BLUE);
                shape.setFill(null);
                container.getChildren().add(shape);
            });
        }
        symbol.getTextAmplifiers().values().forEach(textAmplifier -> {
            Point2D location = textAmplifier.getLocation();
            Text text = new Text(location.getX(), location.getY(), textAmplifier.getText());
            text.setFont(TextAmplifierValue.AMPLIFIER_FONT);
            text.textProperty().bind(textAmplifier.textProperty());
            container.getChildren().add(text);
        });
        symbol.getGraphicAmplifiers().values().forEach(graphicAmplifier -> {
            Group group = graphicAmplifier.getGraphic().createGroup();
            group.getTransforms().add(graphicAmplifier.getTransform());
            container.getChildren().add(group);
        });
        Bounds lb = container.getLayoutBounds();
        double scaleFactor = symbol.getScale().getFactor();
        container.setTranslateX(-lb.getMinX() * scaleFactor + 2);
        container.setTranslateY(-lb.getMinY() * scaleFactor + 2);
        setMaxWidth(lb.getWidth() * scaleFactor + 4);
        setMaxHeight(lb.getHeight() * scaleFactor + 4);
        setPrefWidth(getMaxWidth());
        setPrefHeight(getMaxHeight());
        container.layout();
    }

    protected void updateScale(IconScale scaleFactor) {
        container.getTransforms().clear();
        container.getTransforms().add(Transform.scale(scaleFactor.getFactor(), scaleFactor.getFactor(), 0, 0));
        updateIcon();
    }

    private void replaceFill(Node node, Paint fill) {
        if (node instanceof Group) {
            ((Group) node).getChildren().forEach(child -> replaceFill(child, fill));
        } else if (node instanceof Shape) {
            Shape shape = (Shape) node;
            if (shape.getFill() != null) {
                shape.setFill(fill);

            }
        }
    }

}
