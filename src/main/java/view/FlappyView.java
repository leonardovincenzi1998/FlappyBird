package view;

import javafx.scene.shape.Rectangle;

public interface FlappyView {

    void setPosition(double x, double y);

    void setWidthHeight(int height, int width);

    void setImage(String image);

    void updatePosition(double y);

    Rectangle getFlappy();



}
