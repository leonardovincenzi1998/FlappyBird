package util;

import javafx.scene.shape.Rectangle;

import java.util.TreeMap;

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
}
