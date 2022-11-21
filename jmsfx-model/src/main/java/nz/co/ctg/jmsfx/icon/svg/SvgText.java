package nz.co.ctg.jmsfx.icon.svg;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class SvgText extends SvgShape {

    private Font font;
    private String content;

    public SvgText(String content) {
        this.content = content;
    }

    @Override
    public Shape createShape() {
        Text text = new Text(content);
        text.setFont(font);
        setColors(text);
        setTransforms(text);
        return text;
    }

    public String getContent() {
        return content;
    }

    public Font getFont() {
        return font;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    @Override
    protected void drawGraphics(GraphicsContext graphics) {
        graphics.setFont(font);
        if (fill != null) {
            graphics.fillText(content, 0, 0);
        }
        graphics.strokeText(content, 0, 0);
    }
}
