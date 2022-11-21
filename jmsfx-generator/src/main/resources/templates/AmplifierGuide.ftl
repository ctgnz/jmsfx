package ${basePackage};

public class AmplifierGuide {
    private final String code;
    private final Amplifier amplifier;
    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public AmplifierGuide(String code, Amplifier amplifier, int x, int y, int width, int height) {
        this.code = code;
        this.amplifier = amplifier;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Amplifier getAmplifier() {
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

}