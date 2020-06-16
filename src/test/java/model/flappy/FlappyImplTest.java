package model.flappy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlappyImplTest {

    @Test
    public void testFlappyUpdate() {
        final double n = 10;
        final double x = 60;
        double expected;

        FlappyImpl flappy = FlappyImpl.getInstance();
        flappy.setPosY(x);
        expected = flappy.getPosY() + n;
        flappy.setPosY(expected);
        assertEquals(expected, flappy.getPosY());
    }
}
