package controllers;

import model.bird.BirdImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameLoopImplTest {

    double n = 2.75;

    @Test
    void birdUpdateDown() {
        double expected;
        BirdImpl flappy = BirdImpl.getInstance();
        expected = (flappy.getPosY() + n);
        flappy.setPosY(50 + n);
        assertEquals(flappy.getPosY(),expected);
    }

    @Test
    void birdUpdateUp() {
        double expected;
        BirdImpl flappy = BirdImpl.getInstance();
        expected = (flappy.getPosY() - n);
        flappy.setPosY(50 - n);
        assertEquals(flappy.getPosY(),expected);
    }
}
