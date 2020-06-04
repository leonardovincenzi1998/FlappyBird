package model;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Rectangle;

public class FlappyStateImpl implements FlappyState {

    public FlappyState flappyJump(Rectangle r) {
        r.setY(r.getY()-2.75);
        return this;
    }

    public FlappyState flappyDown(Rectangle r) {
        r.setY(r.getY()+2.75);
        return this;
    }
}
