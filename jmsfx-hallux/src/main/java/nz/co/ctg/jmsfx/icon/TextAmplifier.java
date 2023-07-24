package nz.co.ctg.jmsfx.icon;

import nz.co.ctg.jmsfx.model.AmplifierGuide;

import javafx.beans.binding.Bindings;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class TextAmplifier {
    protected static final Font AMPLIFIER_FONT = Font.font("sans-serif", FontWeight.NORMAL, FontPosture.REGULAR, 60);
    private final AmplifierGuide guide;
    private final ObjectProperty<Pos> attachment;
    private final StringProperty text;
    private final ObjectProperty<Point2D> location;

    public TextAmplifier(AmplifierGuide guide, Pos initialAttachment, String initialText) {
        this.guide = guide;
        this.attachment = new SimpleObjectProperty<>(initialAttachment);
        this.text = new SimpleStringProperty(initialText);
        this.location = new SimpleObjectProperty<>(calculateAttachment());
        location.bind(Bindings.createObjectBinding(() -> calculateAttachment(), attachment, text));
    }

    public ObjectProperty<Pos> attachmentProperty() {
        return attachment;
    }

    public Pos getAttachment() {
        return attachment.get();
    }

    public AmplifierGuide getGuide() {
        return guide;
    }

    public Point2D getLocation() {
        return location.get();
    }

    public String getText() {
        return text.get();
    }

    public ReadOnlyObjectProperty<Point2D> locationProperty() {
        return location;
    }

    public void setAttachment(Pos attachment) {
        this.attachment.set(attachment);
    }

    public void setText(String text) {
        this.text.setValue(text);
    }

    public StringProperty textProperty() {
        return text;
    }

    private Point2D calculateAttachment() {
        Text holder = new Text(getText());
        holder.setFont(AMPLIFIER_FONT);
        double width = holder.getLayoutBounds().getWidth();
        double height = holder.getBaselineOffset();
        switch (getAttachment()) {
            case TOP_LEFT:
                return new Point2D(guide.getX(), guide.getY() + height);
            case TOP_CENTER:
                return new Point2D(guide.getX() + guide.getWidth() / 2 - width / 2, guide.getY() + height);
            case TOP_RIGHT:
                return new Point2D(guide.getX() + guide.getWidth() - width, guide.getY() + height);
            case CENTER_LEFT:
                return new Point2D(guide.getX(), guide.getY() + guide.getHeight() / 2 + height / 2);
            case CENTER:
                return new Point2D(guide.getX() + guide.getWidth() / 2 - width / 2, guide.getY() + guide.getHeight() / 2 + height / 2);
            case CENTER_RIGHT:
                return new Point2D(guide.getX() + guide.getWidth() - width, guide.getY() + guide.getHeight() / 2 + height / 2);
            case BOTTOM_LEFT:
                return new Point2D(guide.getX(), guide.getY() + guide.getHeight());
            case BOTTOM_CENTER:
                return new Point2D(guide.getX() + guide.getWidth() / 2 - width / 2, guide.getY() + guide.getHeight());
            case BOTTOM_RIGHT:
                return new Point2D(guide.getX() + guide.getWidth() - width, guide.getY() + guide.getHeight());
            case BASELINE_LEFT:
                return new Point2D(guide.getX(), guide.getY());
            case BASELINE_CENTER:
                return new Point2D(guide.getX() + guide.getWidth() / 2 - width / 2, guide.getY());
            case BASELINE_RIGHT:
                return new Point2D(guide.getX() + guide.getWidth() - width, guide.getY());
            default:
                return new Point2D(guide.getX(), guide.getY());
        }
    }

}
