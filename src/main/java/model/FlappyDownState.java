package model;

import javafx.scene.shape.Rectangle;

public class FlappyDownState implements FlappyState{

    public void flappyDown(Rectangle r) {
        r.setY(r.getY()+2.75);
    }
    public void flappyJump(Rectangle r) {
        System.out.println("non sto saltando");
    }
}
