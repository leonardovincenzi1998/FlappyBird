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

    //public TubeUp tubeUp;
    //public TubeDown tubeDown;
    private TubeViewImpl tubeView;
    private Map<Integer, Pair> tubeMap;
    private int cont=0;
    private int deleteKeyN = 0;
    private TubeUp tubeUp = new TubeUp("top.png");
    private TubeDown tubeDown = new TubeDown("bottom.png");



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

        TubeUp tubeUpCopy = tubeUp.copy();
        TubeDown tubeDownCopy = tubeDown.copy();
        tubeUpCopy.setY();
        tubeDownCopy.getDownHeight(tubeUpCopy.getHeight());
        tubeDownCopy.setY();
        //System.out.println(cont);
        r.setWidth(tubeUpCopy.getWidth());
        r.setHeight(tubeUpCopy.getHeight());
        r2.setWidth(tubeDownCopy.getWidth());
        r2.setHeight(tubeDownCopy.getHeight());

        r.setX(tubeUpCopy.getPosX());
        r.setY(tubeUpCopy.getPosY() - r.getHeight());
        r.setFill(new ImagePattern(new Image(tubeUp.getTubeImagePath())));
        r2.setX(tubeDownCopy.getPosX());
        r2.setY(tubeDownCopy.getPosY());
        r2.setFill(new ImagePattern(new Image(tubeDown.getTubeImagePath())));

        /*System.out.println(tubeUpCopy.getPosX());
        System.out.println(r.getX());
        System.out.println(tubeDownCopy.getPosX());
        System.out.println(r2.getX());*/

        return new Pair(r, r2);
    }

    /*public Pair getPair(){
        //return tubeMap.e;
    }*/

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

    public void scrollTubePair(Map<Integer, Pair> tubeMap){

        tubeMap.forEach((key, value) -> {
            ((Rectangle) value.getX()).setX(((Rectangle) value.getX()).getX()-2);
            ((Rectangle) value.getY()).setX(((Rectangle) value.getY()).getX()-2);
        //this.tubeUp.setPosX(this.tubeUp.getPosX()-1);
        //rectangle.setX(rectangle.getX()-1);

        /*this.tubeDown.setPosX(this.tubeDown.getPosX()-1);
        this.r2.setX(this.tubeDown.getPosX()-1);*/
        });
    }
}
