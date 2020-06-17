package view;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class BirdViewImpl implements BirdView {

    private final Rectangle r;

<<<<<<< HEAD:src/main/java/view/BirdViewImpl.java
    /**
     * This is the constructor method that initialize the rectangle.
     */
=======
>>>>>>> 307ef70f46473b59b90ea7dc29a83c4933cfa6e2:src/main/java/view/FlappyViewImpl.java
    public BirdViewImpl() {
        r = new Rectangle();
    }

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
    public Rectangle getBird() {
        return this.r;
    }
}
