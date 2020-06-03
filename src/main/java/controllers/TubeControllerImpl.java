package controllers;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import model.TubeDown;
import model.TubeUp;
import util.Pair;
import util.TubeMap;
import util.TubeMapImpl;
import view.TubeViewImpl;

import java.util.Map;

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
