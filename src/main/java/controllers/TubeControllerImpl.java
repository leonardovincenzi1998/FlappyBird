package controllers;

import model.Tube;
import model.TubeImpl;
import view.TubeViewImpl;

public class TubeControllerImpl {

    private final Tube tube;
    private TubeViewImpl tubeView;

    public TubeControllerImpl() {
        this.tube = new TubeImpl(/*primaryStage.getHeight()*/);
        this.tubeView = new TubeViewImpl(this.tube);

        //sthis.tube.tubeUpdate(this.tubeView.getTube());
    }

    public Tube getTubeModel(){
        return this.tube;
    }

    public TubeViewImpl getTubeView(){
        return this.tubeView;
    }
}
