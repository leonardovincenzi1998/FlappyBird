package model.flappy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlappyImplTest {

    @Test
    void testFlappyUpdate() {
        double n = 10;
        double expected;

        FlappyImpl flappy = FlappyImpl.getInstance();
        flappy.setPosY(50);
        expected = flappy.getPosY() + n;
        flappy.setPosY(expected);
        assertEquals(expected , flappy.getPosY());
    }
}
