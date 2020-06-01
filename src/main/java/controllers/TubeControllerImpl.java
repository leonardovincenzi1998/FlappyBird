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
import util.TubeMap;
import view.TubeViewImpl;

import java.util.*;

public class TubeControllerImpl {

    //public TubeUp tubeUp;
    //public TubeDown tubeDown;
    private TubeViewImpl tubeView;
    private TubeMap tubeMap;
    private int cont=0;
    private int deleteKeyN = 1;
    private TubeUp tubeUp = new TubeUp("top.png");
    private TubeDown tubeDown = new TubeDown("bottom.png");

    public TubeControllerImpl(TubeMap tubeMap) {

        this.tubeMap = tubeMap;
        this.tubeMap.addToMap(createTubePair());
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

    public TubeMap getTubeMap(){
        return this.tubeMap;
    }

}
