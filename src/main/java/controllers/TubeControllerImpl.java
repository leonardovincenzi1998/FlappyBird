package controllers;

import controllers.utilities.TubeMapImpl;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import model.TubeDown;
import model.TubeUp;
import util.Pair;
import controllers.utilities.TubeMap;

import java.util.Map;

public class TubeControllerImpl {

    private final TubeUp tubeUp = new TubeUp("top.png");
    private final TubeDown tubeDown = new TubeDown("bottom.png");
    private final TubeMap tubeMap;

    public TubeControllerImpl(FlappyBirdController controller) {
        tubeMap = new TubeMapImpl(controller);
        tubeMap.addToMap(createTubePair());
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

    public void addTube() {
        tubeMap.addToMap(createTubePair());
        tubeMap.printPairTube(tubeMap.getLastValue());
    }

    public void scrollTubes(){
        this.tubeMap.scrollTubePair();
        this.tubeMap.checkWindowEnd();
    }

    public TubeMap getTubeMap(){
        return this.tubeMap;
    }



}
