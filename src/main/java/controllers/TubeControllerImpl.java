package controllers;

import controllers.utilities.TubeMapImpl;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import model.tube.TubeDown;
import model.tube.TubeUp;
import util.Pair;
import controllers.utilities.TubeMap;
import view.TubeView;
import view.TubeViewImpl;

public class TubeControllerImpl implements TubeController{

    private final TubeUp tubeUp = new TubeUp("top.png");
    private final TubeDown tubeDown = new TubeDown("bottom.png");
    private final TubeMap tubeMap;
    private final TubeView tubeView;

    public TubeControllerImpl(FlappyBirdController controller) {
        tubeMap = new TubeMapImpl(controller);
        tubeView = new TubeViewImpl();
        tubeMap.addToMap(createTubePair());

    }

    @Override
    public Pair createTubePair(){

        /*Rectangle r = new Rectangle();
        Rectangle r2 = new Rectangle();*/

        TubeUp tubeUpCopy = tubeUp.copy();
        TubeDown tubeDownCopy = tubeDown.copy();
        tubeUpCopy.setY();
        tubeDownCopy.setY(tubeUpCopy.getPosY());

        tubeView.createRectangles();

        tubeView.setTubeUpDimension(tubeUpCopy.getWidth(),tubeUpCopy.getHeight());
        tubeView.setTubeDownDimension(tubeDownCopy.getWidth(),tubeDownCopy.getHeight());

        tubeView.setTubeUpPosition(tubeUpCopy.getPosX(),tubeUpCopy.getPosY()-tubeUpCopy.getHeight());
        tubeView.setTubeDownPosition(tubeDownCopy.getPosX(),tubeDownCopy.getPosY());

        tubeView.seTubeUpImage(tubeUp.getTubeImagePath());
        tubeView.seTubeDownImage(tubeDown.getTubeImagePath());

        /*r.setWidth(tubeUpCopy.getWidth());
        r.setHeight(tubeUpCopy.getHeight());
        r2.setWidth(tubeDownCopy.getWidth());
        r2.setHeight(tubeDownCopy.getHeight());*/

        /*r.setX(tubeUpCopy.getPosX());
        r.setY(tubeUpCopy.getPosY() - r.getHeight());
        r.setFill(new ImagePattern(new Image(tubeUp.getTubeImagePath())));
        //r.setStroke(Color.BLACK);
        r2.setX(tubeDownCopy.getPosX());
        r2.setY(tubeDownCopy.getPosY());
        r2.setFill(new ImagePattern(new Image(tubeDown.getTubeImagePath())));
        //r2.setStroke(Color.BLACK);*/
        return tubeView.getRectangles();
    }

    @Override
    public void addTube() {
        tubeMap.addToMap(createTubePair());
        tubeMap.printPairTube(tubeMap.getLastValue());
    }

    @Override
    public void scrollTubes(){
        this.tubeMap.scrollTubePair();
        this.tubeMap.checkWindowEnd();
    }

    @Override
    public TubeMap getTubeMap(){
        return this.tubeMap;
    }



}
