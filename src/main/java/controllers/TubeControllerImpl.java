package controllers;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import model.TubeDown;
import model.TubeUp;
import util.Pair;
import view.TubeViewImpl;

import java.util.HashMap;
import java.util.Map;

public class TubeControllerImpl {

    public TubeUp tubeUp;
    public TubeDown tubeDown;
    private TubeViewImpl tubeView;
    private Map<Integer, Pair> tubeMap;
    private int cont=0;
    private int deleteKeyN = 0;



    public TubeControllerImpl() {



        tubeMap = new HashMap<>();

        addToMap();

        //this.tubeView = new TubeViewImpl(this.tubeUp, this.tubeDown);
        //this.tubeView = new TubeViewImpl(tubeMap);
        /*this.tubeUp = new TubeUp("top.png");
        this.tubeDown = new TubeDown("bottom.png");
        this.tubeUp.setY();
        this.tubeDown.getDownHeight(this.tubeUp.getHeight());
        this.tubeDown.setY();*/



        //System.out.println(getTubeModel().getPosY());
        //System.out.println(getTubeModel().getHeight());




        //sthis.tube.tubeUpdate(this.tubeView.getTube());
    }

    public Pair createTubePair(){

        Rectangle r = new Rectangle();
        Rectangle r2 = new Rectangle();

        this.tubeUp = new TubeUp("top.png");
        this.tubeDown = new TubeDown("bottom.png");

        this.tubeUp.setY();
        this.tubeDown.getDownHeight(this.tubeUp.getHeight());
        this.tubeDown.setY();
        //System.out.println(cont);
        r.setWidth(this.tubeUp.getWidth());
        r.setHeight(this.tubeUp.getHeight());
        r2.setWidth(this.tubeDown.getWidth());
        r2.setHeight(this.tubeDown.getHeight());

        r.setX(tubeUp.getPosX());
        r.setY(tubeUp.getPosY() - r.getHeight());
        r.setFill(new ImagePattern(new Image(this.tubeUp.getTubeImagePath())));
        r2.setX(tubeDown.getPosX());
        r2.setY(tubeDown.getPosY());
        r2.setFill(new ImagePattern(new Image(this.tubeDown.getTubeImagePath())));

        return new Pair(r, r2);
    }

    public void addToMap(){
        cont++;
        tubeMap.put(cont, createTubePair());

    }

    public void deleteTubePair() {
        tubeMap.remove(deleteKeyN);
        deleteKeyN++;
    }

    public Map<Integer, Pair> getTubeMap(){
        return tubeMap;
    }

    public void getTubeModel(){
        //return this.tubeDown;
    }

    public TubeViewImpl getTubeView(){
        return this.tubeView;
    }

    public void scrollTubePair(Rectangle rectangle){
        this.tubeUp.setPosX(this.tubeUp.getPosX()-1);
        rectangle.setX(this.tubeUp.getPosX()-1);

        /*this.tubeDown.setPosX(this.tubeDown.getPosX()-1);
        this.r2.setX(this.tubeDown.getPosX()-1);*/
    }
}
