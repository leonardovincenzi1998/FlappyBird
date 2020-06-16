package controllers.utilities;

import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import org.junit.jupiter.api.Test;
import util.Pair;

import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class TubeMapImplTest {

    //Stage primaryStage;

    //FlappyBirdController controller = new FlappyBirdControllerImpl(primaryStage);
    //TubeController tubeController = new TubeControllerImpl(controller);
    //TubeMap map = new TubeMapImpl(controller);
    TreeMap<Integer, Pair<Rectangle,Rectangle>> tubeMap;
    Rectangle r = new Rectangle();
    Rectangle r2 = new Rectangle();
    Pair<Rectangle, Rectangle> pair = new Pair<>(r,r2);


    TubeMapImplTest() {
         tubeMap = new TreeMap<>();
         r.setX(0);
    }

    @Test
    public void testAddToMap() {
        assertNotSame(tubeMap, tubeMap.put(1,pair));
    }

    @Test
    public void testGetLastValue() {
        Pair<Rectangle, Rectangle> expected = pair;
        tubeMap.put(1,pair);
        assertEquals(expected,tubeMap.lastEntry().getValue());
    }

    @Test
    public void testScrollTubePair() {
        int n = 2;
        tubeMap.put(1,pair);
        Pair<Rectangle, Rectangle> expected = pair;

        tubeMap.forEach((key, value) -> {
            value.getX().setX(value.getX().getX()-n);
            value.getY().setX(value.getY().getX()-n);
        });

        (expected.getX()).setX(r.getX()-n);
        assertEquals((expected.getX()).getX(), tubeMap.lastEntry().getValue().getX().getX());

    }


    @Test
    public void testCheckCollision() {
        Rectangle flappy = new Rectangle();
        int n = 2;
        AtomicInteger flag = new AtomicInteger(0);

        flappy.setX(50);
        flappy.setY(50);
        r.setX(600);
        r2.setX(600);
        r.setY(90);
        r2.setY(r.getY()+105);


        tubeMap.put(1,pair);
        for(int i = 0; i < 300; i++) {
            tubeMap.forEach((key, value) -> {
                value.getX().setX(value.getX().getX() - n);
                value.getY().setX(value.getY().getX() - n);
            });

            tubeMap.forEach((key, value) -> {
                Shape intersect = Shape.intersect(flappy, value.getX());
                if(intersect.getBoundsInLocal().getWidth() != -1){
                    flag.set(1);

                }
                Shape intersect2 = Shape.intersect(flappy, value.getY());
                if(intersect2.getBoundsInLocal().getWidth() != -1){
                    flag.set(1);
                }

                if((flappy.getY() < 0 && value.getX().getX() == flappy.getX())){
                    flag.set(1);
                }
                if(flag.get() == 1){
                    assertEquals(1,flag.get());
                }
            });
        }
        /*tubeMap.forEach((key, value) -> {
            Shape intersect = Shape.intersect(flappy, ((Rectangle)value.getX()));
            if(intersect.getBoundsInLocal().getWidth() != -1){
                flag.set(1);
            }
            Shape intersect2 = Shape.intersect(flappy, ((Rectangle)value.getY()));
            if(intersect2.getBoundsInLocal().getWidth() != -1){
                flag.set(1);
            }

            if((flappy.getY() < 0 && ((Rectangle) value.getX()).getX() == flappy.getX())){
                flag.set(1);
            }
        });*/



    }
}