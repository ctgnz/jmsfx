package nz.co.ctg.jmsfx.icon.parser;

import org.apache.commons.lang3.StringUtils;

import static org.apache.commons.lang3.StringUtils.defaultIfBlank;

import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class FXFontHandler {
    public String parseFontFamily(String fontFamily) {
        return defaultIfBlank(fontFamily, "sans-serif");
    }

    public FontPosture parseFontPosture(String posture) {
        if (StringUtils.isNotBlank(posture)) {
            switch (posture.toUpperCase()) {
                case "ITALIC":
                case "OBLIQUE":
                    return FontPosture.ITALIC;
                default:
                    return FontPosture.REGULAR;
            }
        }
        return FontPosture.REGULAR;
    }

    public double parseFontSize(String fontSize, double defaultValue) {
        try {
            if (fontSize.endsWith("px")) {
                int pixels = Integer.parseInt(fontSize.substring(0, fontSize.indexOf("px")));
                return pixels;// * 0.75;
            } else if (fontSize.endsWith("pt")) {
                return Integer.parseInt(fontSize.substring(0, fontSize.indexOf("pt")));
            } else {
                return Integer.parseInt(fontSize);
            }
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public FontWeight parseFontWeight(String weight) {
        if (StringUtils.isNotBlank(weight)) {
            switch (weight.toUpperCase()) {
                case "100":
                    return FontWeight.THIN;
                case "200":
                    return FontWeight.EXTRA_LIGHT;
                case "LIGHTER": // fall through
                case "300":
                    return FontWeight.LIGHT;
                case "400":
                    return FontWeight.NORMAL;
                case "500":
                    return FontWeight.MEDIUM;
                case "600":
                    return FontWeight.SEMI_BOLD;
                case "BOLD": // fall through
                case "700":
                    return FontWeight.BOLD;
                case "BOLDER": // fall through
                case "800":
                    return FontWeight.EXTRA_BOLD;
                case "900":
                    return FontWeight.BLACK;
            }
        }
        return FontWeight.NORMAL;
    }

}
