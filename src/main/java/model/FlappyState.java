package model;

import javafx.scene.shape.Rectangle;

public interface FlappyState {

    FlappyState flappyDown(Rectangle r);

    FlappyState flappyJump(Rectangle r);

}
