package model.flappy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlappyImplTest {

    @Test
    void testFlappyUpdate() {
        double n = 10;
        double result;
        FlappyImpl flappy = FlappyImpl.getInstance();
        flappy.setPosY(50);
        result = flappy.getPosY()+n;
        flappy.setPosY(result);
        assertEquals(result,flappy.getPosY());
    }
}