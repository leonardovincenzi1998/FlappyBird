package util;

import javafx.scene.shape.Rectangle;

import java.util.TreeMap;

public class TubeMap {

    private TreeMap<Integer, Pair> tubeMap;
    private int cont=0;

    public TubeMap(){
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
            ((Rectangle) value.getX()).setX(((Rectangle) value.getX()).getX()-1);
            ((Rectangle) value.getY()).setX(((Rectangle) value.getY()).getX()-1);
        });
    }

    public void checkWindowEnd() {
        if (((Rectangle)tubeMap.firstEntry().getValue().getX()).getX() == -55) {
            tubeMap.remove(tubeMap.firstKey());
        }
    }
}
