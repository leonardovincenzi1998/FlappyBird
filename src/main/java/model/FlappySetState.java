package model;

import javafx.scene.shape.Rectangle;

public class FlappySetState {

    private FlappyState state = new FlappyStateImpl();

    public void setStateJump(Rectangle r) {
        state = state.flappyJump(r);
    }

    public void setStateDown(Rectangle r) {
        state = state.flappyDown(r);
    }
}
