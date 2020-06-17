package view;

import javafx.scene.shape.Rectangle;

/**
 * View's interface of bird.
 */
public interface BirdView {
    /**
     * Set Rectangle position.
     * @param x coordinate X
     * @param y coordinate Y
     */
    void setPosition(double x, double y);

    /**
     * Set Rectangle's size.
     * @param height rectangle's height
     * @param width rectangle's width
     */
    void setWidthHeight(int height, int width);

    /**
     * Set Rectangle's image.
     * @param image bird's image
     */
    void setImage(String image);

    /**
     * Set current Y position of rectangle.
     * @param y coordinate Y
     */
    void updatePosition(double y);

    /**
     * Return the rectangle.
     * @return Rectangle initialize in constructor
     */
    Rectangle getBird();
}
