package nz.co.ctg.jmsfx.icon;

import nz.co.ctg.jmsfx.icon.parser.FXColorHandler;
import nz.co.ctg.jmsfx.model.Amplifier;
import nz.co.ctg.jmsfx.model.FrameAmplifierGroup;

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

    protected IdentificationSymbolIcon(IdentificationSymbol symbol) {
        this.symbol = symbol;
        getChildren().add(container);
        symbol.scaleProperty().addListener((obs, oldValue, newValue) -> updateScale(newValue));
        symbol.codeProperty().addListener((obs, oldValue, newValue) -> updateIcon());
        symbol.amplifierGuidesVisibleProperty().addListener((obs, oldValue, newValue) -> updateIcon());
        symbol.getTextAmplifiers().addListener((MapChangeListener<Amplifier, TextAmplifier>) change -> {
            TextAmplifier newAmplifier = change.getValueAdded();
            if (newAmplifier != null) {
                newAmplifier.locationProperty().addListener((obs, oldValue, newValue) -> updateIcon());
            }
            updateIcon();
        });
        symbol.getGraphicAmplifiers().addListener((MapChangeListener<Amplifier, GraphicAmplifier>) change -> {
            GraphicAmplifier newGraphic = change.getValueAdded();
            if (newGraphic != null) {
                newGraphic.transformProperty().addListener((obs, oldValue, newValue) -> updateIcon());
            }
            updateIcon();
        });
        updateScale(symbol.getScale());
    }

    public IdentificationSymbol getSymbol() {
        return symbol;
    }

    protected void updateIcon() {
        container.getChildren().clear();
        if (symbol.isFrameUsed()) {
            Group frame = symbol.getFrameGraphic().createGroup();
            if (symbol.isFrameAmplifierUsed()) {
                FrameAmplifierGroup frameAmplifier = symbol.getFrameAmplifier();
                replaceFill(frame, FXColorHandler.parseColor(frameAmplifier.getBackgroundFill()));
            }
            container.getChildren().add(frame);
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
        if (symbol.isSpecialSubTypeUsed()) {
            container.getChildren().add(symbol.getSpecialSubTypeGraphic().createGroup());
        }
        if (symbol.isAmplifierGuidesVisible()) {
            symbol.getSymbolSet().getAmplifierGuides().forEach(guide -> {
                Rectangle rect = new Rectangle(guide.getX(), guide.getY(), guide.getWidth(), guide.getHeight());
                rect.setStrokeWidth(2);
                rect.setStroke(Color.BLUE);
                rect.setFill(null);
                container.getChildren().add(rect);
            });
        }
        symbol.getTextAmplifiers().values().forEach(textAmplifier -> {
            Point2D location = textAmplifier.getLocation();
            Text text = new Text(location.getX(), location.getY(), textAmplifier.getText());
            text.setFont(TextAmplifier.AMPLIFIER_FONT);
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
