package controllers;

import javafx.scene.shape.Rectangle;
import model.flappy.FlappyImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlappyControllerImplTest {

    private static final int HEIGHT_WINDOWS = 335;
    @Test
    void floorCollision() {
        int num;
        Rectangle flappyRectangle = new Rectangle();
        FlappyImpl flappy = FlappyImpl.getInstance();

        num = HEIGHT_WINDOWS - flappy.getHeightBird();
        flappyRectangle.setY(num);
        flappy.setPosY(num);
        assertEquals(flappy.getPosY(), flappyRectangle.getY());
    }
}