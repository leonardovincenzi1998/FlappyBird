package view;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import model.TubeDown;
import model.TubeUp;
import util.Pair;

import java.util.HashMap;
import java.util.Map;


public class TubeViewImpl {

    //FlappyBirdView view;
    //public Rectangle r = new Rectangle();
    //public Rectangle r2 = new Rectangle();
    //public Imag   e ico;
    //public Image ico2;
    //private TubeUp tubeUp;
    //private TubeDown tubeDown;
    public Map<Integer, Pair> tube = new HashMap<>();
    private int cont=-1;
    private Rectangle r;
    private Pair pair;


    public TubeViewImpl(final Map tubeMap){
        //addRectangles(tubePair);
        this.tube = tubeMap;

    }

    public void addRectangles(Pair tubePair){
        cont++;
        Rectangle r = new Rectangle();
        this.pair = tubePair;

        //r.setWidth(tubePair.getX().);
        //r.setHeight(this.tubeUp.getHeight());
        tube.put(cont, tubePair);
        System.out.println(tubePair.getX());
    }



    /*public TubeViewImpl(final TubeUp tubeUp, TubeDown tubeDown){
        this.tubeUp = tubeUp;
        this.tubeDown = tubeDown;
        this.ico = new Image(tubeUp.getTubeImagePath());
        this.ico2 = new Image(tubeDown.getTubeImagePath());


        r.setWidth(this.tubeUp.getWidth());
        r.setHeight(this.tubeUp.getHeight());

        r2.setWidth(this.tubeDown.getWidth());
        r2.setHeight(this.tubeDown.getHeight());

        r.setX(tubeUp.getPosX());
        r.setY(tubeUp.getPosY() - r.getHeight());
        r.setFill(new ImagePattern(ico));

        r2.setX(tubeDown.getPosX());
        r2.setY(tubeDown.getPosY());
        r2.setFill(new ImagePattern(ico2));


    }*/


    /*public Rectangle getTubeUp(){
        return this.r;
    }

    public Rectangle getTubeDown(){
        return this.r2;
    }*/

}
