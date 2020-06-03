package controllers.utilities;

import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import util.Pair;

import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class TubeMapImpl implements TubeMap{

    private TreeMap<Integer, Pair> tubeMap;
    private int cont=0;

    public TubeMapImpl(){
        tubeMap = new TreeMap<>();
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
            ((Rectangle) value.getX()).setX(((Rectangle) value.getX()).getX()-2);
            ((Rectangle) value.getY()).setX(((Rectangle) value.getY()).getX()-2);
        });
    }

    public void checkWindowEnd() {
        if (((Rectangle)tubeMap.firstEntry().getValue().getX()).getX() == -60) {
            tubeMap.remove(tubeMap.firstKey());
            System.out.println("Eliminato");
        }
    }

    public boolean checkCollision(Rectangle flappy){
        AtomicInteger flag = new AtomicInteger(0);
        //Shape intersect = Shape.intersect()
        tubeMap.forEach((key, value) -> {
            Shape intersect = Shape.intersect(flappy, ((Rectangle)value.getX()));
            if(intersect.getBoundsInLocal().getWidth() != -1){
                flag.set(1);
            }
            Shape intersect2 = Shape.intersect(flappy, ((Rectangle)value.getY()));
            if(intersect2.getBoundsInLocal().getWidth() != -1){
                flag.set(1);
            }
        });
        return flag.get() != 0;
    }
}
