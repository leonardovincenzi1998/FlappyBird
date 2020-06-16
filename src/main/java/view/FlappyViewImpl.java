package view;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class FlappyViewImpl implements FlappyView {

    private Rectangle r = new Rectangle();

    public FlappyViewImpl() { }

    @Override
    public void setPosition(final double x, final double y) {
        r.setX(x);
        r.setY(y);
    }

    @Override
    public void setWidthHeight(final int height, final int width) {
        r.setHeight(height);
        r.setWidth(width);
    }

    @Override
    public void setImage(final String image) {
        r.setFill(new ImagePattern(new Image(image)));
    }

    @Override
    public void updatePosition(final double y) {
        r.setY(y);
    }

    @Override
    public Rectangle getFlappy() {
        return this.r;
    }

}
