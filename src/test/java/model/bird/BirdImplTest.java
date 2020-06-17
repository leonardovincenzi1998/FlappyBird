package model.bird;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BirdImplTest {

    @Test
    public void testFlappyUpdate() {
        final double n = 10;
        final double x = 60;
        double expected;

        BirdImpl bird = BirdImpl.getInstance();
        bird.setPosY(x);
        expected = bird.getPosY() + n;
        bird.setPosY(expected);
        assertEquals(expected, bird.getPosY());
    }
}
