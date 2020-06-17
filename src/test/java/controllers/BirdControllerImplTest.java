package controllers;

import javafx.scene.shape.Rectangle;
import model.bird.BirdImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BirdControllerImplTest {

    private static final int HEIGHT_WINDOWS = 335;
    @Test
    void floorCollision() {
        int num;
        Rectangle rectangle = new Rectangle();
        BirdImpl bird = BirdImpl.getInstance();

        num = HEIGHT_WINDOWS - bird.getHeightBird();
        rectangle.setY(num);
        bird.setPosY(num);
        assertEquals(bird.getPosY(), rectangle.getY());
    }
}