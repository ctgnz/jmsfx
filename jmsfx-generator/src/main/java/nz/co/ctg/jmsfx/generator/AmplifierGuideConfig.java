package nz.co.ctg.jmsfx.generator;

public class AmplifierGuideConfig {
    private String code;
    private String amplifier;
    private int x;
    private int y;
    private int width;
    private int height;

    public AmplifierGuideConfig() {
    }

    public String getAmplifier() {
        return amplifier;
    }

    public String getCode() {
        return code;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setAmplifier(String amplifier) {
        this.amplifier = amplifier;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
