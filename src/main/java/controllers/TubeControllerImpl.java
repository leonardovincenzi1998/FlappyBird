package controllers;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import model.TubeDown;
import model.TubeUp;
import util.Pair;
import view.TubeViewImpl;

import java.util.*;

public class TubeControllerImpl {

    //public TubeUp tubeUp;
    //public TubeDown tubeDown;
    private TubeViewImpl tubeView;
    private TreeMap<Integer, Pair> tubeMap;
    private int cont=0;
    private int deleteKeyN = 1;
    private TubeUp tubeUp = new TubeUp("top.png");
    private TubeDown tubeDown = new TubeDown("bottom.png");

    public TubeControllerImpl() {

        tubeMap = new TreeMap<>();
        addToMap();
    }

    public Pair createTubePair(){

        Rectangle r = new Rectangle();
        Rectangle r2 = new Rectangle();

        TubeUp tubeUpCopy = tubeUp.copy();
        TubeDown tubeDownCopy = tubeDown.copy();
        tubeUpCopy.setY();
        tubeDownCopy.setY(tubeUpCopy.getPosY());

        r.setWidth(tubeUpCopy.getWidth());
        r.setHeight(tubeUpCopy.getHeight());
        r2.setWidth(tubeDownCopy.getWidth());
        r2.setHeight(tubeDownCopy.getHeight());

        r.setX(tubeUpCopy.getPosX());
        r.setY(tubeUpCopy.getPosY() - r.getHeight());
        r.setFill(new ImagePattern(new Image(tubeUp.getTubeImagePath())));
        //r.setStroke(Color.BLACK);
        r2.setX(tubeDownCopy.getPosX());
        r2.setY(tubeDownCopy.getPosY());
        r2.setFill(new ImagePattern(new Image(tubeDown.getTubeImagePath())));
        //r2.setStroke(Color.BLACK);
        return new Pair(r, r2);
    }

    /*public Pair getPair(){
        //return tubeMap.e;
    }*/

    public void addToMap(){
        cont++;
        tubeMap.put(cont, createTubePair());

    }

    public Pair getLastValue(){
        return tubeMap.lastEntry().getValue();
    }

    public Map<Integer, Pair> getTubeMap(){
        return tubeMap;
    }


    public void scrollTubePair(){

        tubeMap.forEach((key, value) -> {
            ((Rectangle) value.getX()).setX(((Rectangle) value.getX()).getX()-1);
            ((Rectangle) value.getY()).setX(((Rectangle) value.getY()).getX()-1);
        //this.tubeUp.setPosX(this.tubeUp.getPosX()-1);
        //rectangle.setX(rectangle.getX()-1);

        /*this.tubeDown.setPosX(this.tubeDown.getPosX()-1);
        this.r2.setX(this.tubeDown.getPosX()-1);*/
        });
    }

    public void finishPlayground() {
        if (((Rectangle)tubeMap.firstEntry().getValue().getX()).getX() == -55) {
            tubeMap.remove(tubeMap.firstKey());
        }
    }
}
