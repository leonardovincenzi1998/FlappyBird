package controllers;

import model.bird.BirdImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class GameLoopImplTest {

    private final double n = 2.75;
    private final double test = 50;

    @Test
    void birdUpdateDown() {
        double expected;
        BirdImpl flappy = BirdImpl.getInstance();
        expected = (flappy.getPosY() + n);
        flappy.setPosY(test + n);
        assertEquals(flappy.getPosY(), expected);
    }

    @Test
    void birdUpdateUp() {
        double expected;
        BirdImpl flappy = BirdImpl.getInstance();
        expected = (flappy.getPosY() - n);
        flappy.setPosY(test - n);
        assertEquals(flappy.getPosY(), expected);
    }
}
