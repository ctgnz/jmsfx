package nz.co.ctg.jmsfx.icon.parser;

import java.util.ArrayList;
import java.util.List;

import org.apache.batik.parser.ParseException;
import org.apache.batik.parser.PointsHandler;
import org.apache.batik.parser.PointsParser;

public class FXPointsHandler implements PointsHandler {
    private final List<Double> points = new ArrayList<>();

    public List<Double> parse(String pointsText) {
        PointsParser parser = new PointsParser();
        parser.setPointsHandler(this);
        parser.parse(pointsText);
        return new ArrayList<>(points);
    }

    @Override
    public void startPoints() throws ParseException {
        points.clear();
    }

    @Override
    public void point(float x, float y) throws ParseException {
        points.add(Double.valueOf(x));
        points.add(Double.valueOf(y));
    }

    @Override
    public void endPoints() throws ParseException {
    }

}
