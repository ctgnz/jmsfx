package nz.co.ctg.jmsfx.icon.svg;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.imageio.ImageIO;
import javax.imageio.stream.MemoryCacheImageInputStream;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SvgImage {

    private double x;
    private double y;
    private double width;
    private double height;
    private String imageDataBase64;

    public SvgImage(double x, double y, double width, double height, String imageDataBase64) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.imageDataBase64 = imageDataBase64;
    }

    public ImageView createImage() {
        Image image = renderImage();
        ImageView imageView = new ImageView(image);
        imageView.setX(x);
        imageView.setY(y);
        imageView.setFitWidth(width);
        imageView.setFitHeight(height);
        return imageView;
    }

    protected Image renderImage() {
        try {
            byte[] bytes = Base64.getDecoder().decode(imageDataBase64.getBytes(StandardCharsets.UTF_8));
            BufferedImage img = ImageIO.read(new MemoryCacheImageInputStream(new ByteArrayInputStream(bytes)));
            return SwingFXUtils.toFXImage(img, null);
        } catch (Exception e) {
            throw new IllegalArgumentException("Can't render image");
        }
    }

    public double getHeight() {
        return height;
    }

    public String getImageDataBase64() {
        return imageDataBase64;
    }

    public double getWidth() {
        return width;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setImageDataBase64(String imageDataBase64) {
        this.imageDataBase64 = imageDataBase64;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    protected void drawGraphic(GraphicsContext graphicsContext) {
        graphicsContext.drawImage(renderImage(), x, y);
    }
}
