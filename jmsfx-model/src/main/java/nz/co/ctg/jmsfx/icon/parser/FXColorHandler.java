package nz.co.ctg.jmsfx.icon.parser;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class FXColorHandler {
    private static final Map<String, Color> cache = new HashMap<>();

    public static Color convertOpacity(Color color, double opacity) {
        return Color.hsb(color.getHue(), color.getSaturation(), color.getBrightness(), opacity);
    }

    public static Color getForegroundColorFor(Color background) {
        double r2 = background.getRed() * background.getRed();
        double g2 = background.getGreen() * background.getGreen();
        double b2 = background.getBlue() * background.getBlue();
        double brightness = Math.sqrt(0.299 * r2 + 0.587 * g2 + 0.114 * b2);
        return brightness > 130 ? Color.BLACK : Color.WHITE;
    }

    public static Paint parseColor(String rgb) {
        if (StringUtils.isBlank(rgb)) {
            return Color.BLACK;
        }
        if ("none".equals(rgb)) {
            return Color.TRANSPARENT;
        }
        if (rgb.startsWith("#")) {
            return cache.computeIfAbsent(rgb, key -> parseRGB(key.substring(1)));
        }
        return Color.TRANSPARENT;
    }

    public static Color parseRGB(String rgb) {
        String text = rgb;
        if (text.startsWith("#")) {
            text = rgb.substring(1);
        }
        int rgbVals = Integer.parseInt(text, 16);
        int r = (rgbVals & 0xFF0000) >> 16;
        int g = (rgbVals & 0xFF00) >> 8;
        int b = rgbVals & 0xFF;
        if (r == 255 && g == 255 && b == 255) {
            // avoid pure white as this is used as the transparent pixel
            r = 254;
            g = 254;
            b = 254;
        }
        return Color.rgb(r, g, b);
    }

    public static Color parseRGB(String rbg, double opacity) {
        Color tmp = parseRGB(rbg);
        return convertOpacity(tmp, opacity);
    }

    public static String toRgb(Color color) {
        return String.format("%02X%02X%02X", (int) (color.getRed() * 255), (int) (color.getGreen() * 255), (int) (color.getBlue() * 255));
    }

}
