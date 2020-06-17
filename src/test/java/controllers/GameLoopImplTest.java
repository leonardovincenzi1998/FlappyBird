package controllers;

import model.flappy.FlappyImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameLoopImplTest {

    double n = 2.75;

    @Test
    void birdUpdateDown() {
        double expected;
        FlappyImpl flappy = FlappyImpl.getInstance();
        expected = (flappy.getPosY() + n);
        flappy.setPosY(50 + n);
        assertEquals(flappy.getPosY(),expected);
    }

    @Test
    void birdUpdateUp() {
        double expected;
        FlappyImpl flappy = FlappyImpl.getInstance();
        expected = (flappy.getPosY() - n);
        flappy.setPosY(50 - n);
        assertEquals(flappy.getPosY(),expected);
    }
}
