package controllers.utilities;

import controllers.FlappyBirdController;
import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import util.Pair;

import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class TubeMapImpl implements TubeMap{

    private final TreeMap<Integer, Pair> tubeMap;
    private int cont=0;
    FlappyBirdController controller;
    private static final int WINDOW_END = -60;
    private static final int PIXEL_SCROLL = 2;

    public TubeMapImpl(FlappyBirdController controller){
        tubeMap = new TreeMap<>();
        this.controller = controller;
    }


    public void addToMap(Pair tubePair){
        cont++;
        tubeMap.put(cont, tubePair);
    }


    public Pair getLastValue(){
        return tubeMap.lastEntry().getValue();
    }

    public void scrollTubePair(){
        tubeMap.forEach((key, value) -> {
            ((Rectangle) value.getX()).setX(((Rectangle) value.getX()).getX()-PIXEL_SCROLL);
            ((Rectangle) value.getY()).setX(((Rectangle) value.getY()).getX()-PIXEL_SCROLL);
        });
    }

    public void printPairTube(Pair tubePair){
        this.controller.addNode((Node) tubePair.getX());
        this.controller.addNode((Node) tubePair.getY());
    }

    public void checkWindowEnd() {
        if (((Rectangle)tubeMap.firstEntry().getValue().getX()).getX() == WINDOW_END) {
            controller.removeNode((Node) tubeMap.firstEntry().getValue().getX());
            controller.removeNode((Node) tubeMap.firstEntry().getValue().getY());
            tubeMap.remove(tubeMap.firstKey());
            controller.updateScore();
        }
    }

    public boolean checkCollision(Rectangle flappy){
        AtomicInteger flag = new AtomicInteger(0);
        tubeMap.forEach((key, value) -> {
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
        });
        return flag.get() != 0;
    }
}
