package controllers;

import model.Flappy;
import model.FlappyImpl;
import view.FlappyViewImpl;

public class FlappyControllerImpl {

    private final FlappyImpl flappy;
    private final FlappyViewImpl flappyView;

    public FlappyControllerImpl() {
        this.flappy = new FlappyImpl();
        this.flappyView = new FlappyViewImpl(this.flappy);
    }


    public Flappy getFlappyModel(){
        return this.flappy;
    }

    public FlappyViewImpl getFlappyView(){
        return this.flappyView;
    }
}
