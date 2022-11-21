package nz.co.ctg.jmsfx.icon.parser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.batik.parser.ParseException;
import org.apache.batik.parser.TransformListHandler;
import org.apache.batik.parser.TransformListParser;

import javafx.scene.transform.Affine;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Shear;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;

public class FXTransformListHandler implements TransformListHandler {
    private final List<Transform> transforms = new ArrayList<>();

    public List<Transform> parse(String transformText) {
        try {
            TransformListParser parser = new TransformListParser();
            parser.setTransformListHandler(this);
            parser.parse(transformText);
            return transforms;
        } catch (ParseException e) {
            return Collections.emptyList();
        }
    }

    @Override
    public void translate(float tx, float ty) throws ParseException {
        transforms.add(new Translate(tx, ty));
    }

    @Override
    public void translate(float tx) throws ParseException {
        transforms.add(new Translate(tx, 0));
    }

    @Override
    public void startTransformList() throws ParseException {
        transforms.clear();
    }

    @Override
    public void skewY(float sky) throws ParseException {
        transforms.add(new Shear(0, sky));
    }

    @Override
    public void skewX(float skx) throws ParseException {
        transforms.add(new Shear(skx, 0));
    }

    @Override
    public void scale(float sx, float sy) throws ParseException {
        transforms.add(new Scale(sx, sy));
    }

    @Override
    public void scale(float sx) throws ParseException {
        transforms.add(new Scale(sx, sx));
    }

    @Override
    public void rotate(float theta, float cx, float cy) throws ParseException {
        transforms.add(new Rotate(theta, cx, cy));
    }

    @Override
    public void rotate(float theta) throws ParseException {
        transforms.add(new Rotate(theta));
    }

    @Override
    public void matrix(float mxx, float myx, float mxy, float myy, float tx, float ty) throws ParseException {
        transforms.add(new Affine(mxx, mxy, tx, myx, myy, ty));
    }

    @Override
    public void endTransformList() throws ParseException {
    }

}