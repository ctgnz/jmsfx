package nz.co.ctg.jmsfx.icon.parser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.batik.parser.NumberListHandler;
import org.apache.batik.parser.NumberListParser;
import org.apache.batik.parser.ParseException;
import org.apache.commons.lang3.RegExUtils;
import org.apache.commons.lang3.StringUtils;

public class FXNumberHandler implements NumberListHandler {
    private final List<Double> points = new ArrayList<>();
    private final NumberListParser parser = new NumberListParser();

    public FXNumberHandler() {
        parser.setNumberListHandler(this);
    }

    @Override
    public void endNumber() throws ParseException {
    }

    @Override
    public void endNumberList() throws ParseException {
    }

    @Override
    public void numberValue(float v) throws ParseException {
        points.add(Double.valueOf(v));
    }

    public List<Double> parse(String floatListValue) {
        try {
            parser.parse(floatListValue);
            return points;
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }

    public double parseDouble(String floatValue, double defaultValue) {
        try {
            if (StringUtils.isNotBlank(floatValue)) {
                parser.parse(floatValue);
                return points.get(0);
            }
            return defaultValue;
        } catch (ParseException e) {
            return defaultValue;
        }
    }

    public int parseInt(String floatValue, int defaultValue) {
        try {
            if (StringUtils.isNotBlank(floatValue)) {
                if (!StringUtils.isNumeric(floatValue)) {
                    floatValue = RegExUtils.removeAll(floatValue, "\\D");
                }
                parser.parse(floatValue);
                return points.get(0).intValue();
            }
            return defaultValue;
        } catch (ParseException e) {
            return defaultValue;
        }
    }

    @Override
    public void startNumber() throws ParseException {
    }

    @Override
    public void startNumberList() throws ParseException {
        points.clear();
    }

}
