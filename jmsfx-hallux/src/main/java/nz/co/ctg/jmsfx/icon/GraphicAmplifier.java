package nz.co.ctg.jmsfx.icon;

import nz.co.ctg.foxglove.SvgGraphic;
import nz.co.ctg.jmsfx.model.AmplifierGuide;

import javafx.beans.binding.Bindings;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Bounds;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.transform.Transform;

public class GraphicAmplifier {
    protected static final Font AMPLIFIER_FONT = Font.font("sans-serif", FontWeight.NORMAL, FontPosture.REGULAR, 60);
    private final AmplifierGuide guide;
    private final ObjectProperty<SvgGraphic> graphic;
    private final ObjectProperty<Pos> attachment;
    private final ObjectProperty<ScaleDirection> scaleDirection;
    private final ObjectProperty<Transform> transform;

    public GraphicAmplifier(AmplifierGuide guide, SvgGraphic graphic, ScaleDirection scaleDirection, Pos attachment) {
        this.guide = guide;
        this.graphic = new SimpleObjectProperty<>(graphic);
        this.attachment = new SimpleObjectProperty<>(attachment);
        this.scaleDirection = new SimpleObjectProperty<>(scaleDirection);
        this.transform = new SimpleObjectProperty<>(calculateTransform());
        transform.bind(Bindings.createObjectBinding(() -> calculateTransform(), this.scaleDirection, this.attachment));
    }

    public ObjectProperty<Pos> attachmentProperty() {
        return attachment;
    }

    public Pos getAttachment() {
        return attachment.get();
    }

    public SvgGraphic getGraphic() {
        return graphic.get();
    }

    public AmplifierGuide getGuide() {
        return guide;
    }

    public ScaleDirection getScaleDirection() {
        return scaleDirection.get();
    }

    public Transform getTransform() {
        return transform.get();
    }

    public ReadOnlyObjectProperty<SvgGraphic> graphicProperty() {
        return graphic;
    }

    public ObjectProperty<ScaleDirection> scaleDirectionProperty() {
        return scaleDirection;
    }

    public void setAttachment(Pos attachment) {
        this.attachment.set(attachment);
    }

    public void setScaleDirection(ScaleDirection scaleDirection) {
        this.scaleDirection.set(scaleDirection);
    }

    public ReadOnlyObjectProperty<Transform> transformProperty() {
        return transform;
    }

    private Transform calculateTransform() {
        Group group = graphic.get().createGroup();
        Bounds bounds = group.getLayoutBounds();
        double dx = guide.getWidth() / bounds.getWidth();
        double dy = guide.getHeight() / bounds.getHeight();
        switch (getScaleDirection()) {
            case Both:
                return Transform.translate(guide.getX(), guide.getY()).createConcatenation(Transform.scale(dx, dy));
            case Horizontal:
                return Transform.translate(guide.getX(), guide.getY()).createConcatenation(Transform.scale(dx, dx));
            case Vertical:
                return Transform.translate(guide.getX(), guide.getY()).createConcatenation(Transform.scale(dy, dy));
            default:
                return Transform.translate(guide.getX(), guide.getY());
        }
    }

}
