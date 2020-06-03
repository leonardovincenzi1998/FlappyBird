package model;

import javafx.scene.shape.Rectangle;

public class FlappyJumpState implements FlappyState {

    public void flappyJump(Rectangle r) {
        r.setY(r.getY()-2.75);
    }
    public void flappyDown(Rectangle r) {
        System.out.println("non sto scendendo");
    }
}
