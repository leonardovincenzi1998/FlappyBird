package model;

import javafx.scene.shape.Rectangle;

public interface Tube {

    double getPosX();

    double getPosY();

    double getWidth();

    double getHeight();

    String getTubeImagePath();

    void tubeUpdate(Rectangle r);

    void tubeMovement(Rectangle r);

    
}
