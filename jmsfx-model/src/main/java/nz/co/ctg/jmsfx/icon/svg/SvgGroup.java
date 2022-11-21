package nz.co.ctg.jmsfx.icon.svg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

import javafx.scene.Group;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Shape;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Shear;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;

public class SvgGroup {
    private final List<Transform> transforms = new ArrayList<>();
    private final List<SvgShape> elements = new ArrayList<>();
    private final List<SvgGroup> children = new ArrayList<>();
    private final List<SvgImage> images = new ArrayList<>();

    public void addImage(SvgImage svgImage) {
        images.add(svgImage);
    }

    public void add(SvgGroup group) {
        children.add(group);
    }

    public Group createGroup() {
        Stream<Shape> s1 = elements.stream().map(SvgShape::createShape);
        Stream<Group> s2 = children.stream().map(SvgGroup::createGroup);
        Stream<ImageView> s3 = images.stream().map(SvgImage::createImage);
        Group group = new Group(Stream.concat(s1, Stream.concat(s2, s3)).collect(toList()));
        group.getTransforms().addAll(transforms);
        return group;
    }

    public void drawGraphic(GraphicsContext graphicsContext) {
        graphicsContext.save();
        transforms.forEach(trans -> transform(graphicsContext, trans));
        elements.forEach(element -> element.draw(graphicsContext));
        children.forEach(child -> child.drawGraphic(graphicsContext));
        images.forEach(child -> child.drawGraphic(graphicsContext));
        graphicsContext.restore();
    }

    public List<SvgGroup> getChildren() {
        return children;
    }

    public List<SvgShape> getElements() {
        return elements;
    }

    public boolean isEmpty() {
        return children.isEmpty() && elements.isEmpty();
    }

    public List<Transform> getTransforms() {
        return transforms;
    }

    private void transform(GraphicsContext graphicsContext, Transform transform) {
        if (transform instanceof Affine) {
            graphicsContext.transform((Affine) transform);
        }
        if (transform instanceof Translate) {
            Translate xlate = (Translate) transform;
            graphicsContext.translate(xlate.getX(), xlate.getY());
        }
        if (transform instanceof Rotate) {
            Rotate rotate = (Rotate) transform;
            graphicsContext.rotate(rotate.getAngle());
        }
        if (transform instanceof Scale) {
            Scale scale = (Scale) transform;
            graphicsContext.scale(scale.getX(), scale.getY());
        }
        if (transform instanceof Shear) {
            Shear shear = (Shear) transform;
            graphicsContext.transform(shear.getMxx(), shear.getMyx(), shear.getMxy(), shear.getMyy(), shear.getTx(), shear.getTy());
        }
    }

}
