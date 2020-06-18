package controllers;

import javafx.scene.shape.Rectangle;
import model.bird.BirdImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FlappyControllerImplTest {

    private static final int HEIGHT_WINDOWS = 335;
    @Test
    void floorCollision() {
        int num;
        final Rectangle flappyRectangle = new Rectangle();
        final BirdImpl flappy = BirdImpl.getInstance();

        num = HEIGHT_WINDOWS - flappy.getHeightBird();
        flappyRectangle.setY(num);
        flappy.setPosY(num);
        assertEquals(flappy.getPosY(), flappyRectangle.getY());
    }
}
