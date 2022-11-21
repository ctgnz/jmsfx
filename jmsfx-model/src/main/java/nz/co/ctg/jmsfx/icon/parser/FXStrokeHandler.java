package nz.co.ctg.jmsfx.icon.parser;

import org.apache.commons.lang3.StringUtils;

import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;

public class FXStrokeHandler {

    public StrokeLineCap parseLineCap(String lineCapValue) {
        if (StringUtils.isNotBlank(lineCapValue)) {
            switch (lineCapValue.toUpperCase()) {
                case "ROUND":
                    return StrokeLineCap.ROUND;
                case "SQUARE":
                    return StrokeLineCap.SQUARE;
                default:
                    return StrokeLineCap.BUTT;
            }
        }
        return StrokeLineCap.BUTT;
    }

    public StrokeLineJoin parseLineJoin(String lineJoinValue) {
        if (StringUtils.isNotBlank(lineJoinValue)) {
            switch (lineJoinValue.toUpperCase()) {
                case "ROUND":
                    return StrokeLineJoin.ROUND;
                case "BEVEL":
                    return StrokeLineJoin.BEVEL;
                default:
                    return StrokeLineJoin.MITER;
            }
        }
        return StrokeLineJoin.MITER;
    }

}
