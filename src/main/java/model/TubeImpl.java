package model;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class TubeImpl implements Tube{

    private final static double INITIAL_POSX = 545;
    private final static double INITIAL_POSY = 335;
    private final static double WIDTH = 55;
    private double gravity = 0;
    private double inc = 1.0;
    Timeline timeline = new Timeline();
    private double PosX;
    private double PosY;
    private double tubeHeight = 50 + (Math.random() * 141);;
    private final String tubeImagePath;

    private final TranslateTransition transition = new TranslateTransition();
    private final int duration = 10000;


    public TubeImpl(/*double height*/) {
        this.PosX = INITIAL_POSX;
        this.PosY = INITIAL_POSY;
        //this.screenHeight = height;
        tubeImagePath = ("tube.png");
    }


    public void tubeUpdate(Rectangle r) {
        transition.setNode(r);
        transition.setFromX(55);
        transition.setToX(-600);
        transition.setDuration(Duration.millis(this.duration));
        transition.play();
    }

    /*public void tubeUpdate(Rectangle r) {
        r.setTranslateX(gravity);
        timeline = new Timeline(new KeyFrame(
                Duration.seconds(0.025),
                x -> tubeMovement(r))
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();


    }*/

    public void tubeMovement(Rectangle r) {
        gravity = gravity-inc;
        if (gravity == 0) {
            timeline.stop();
            System.out.println("Tubo fermo");
            System.out.println(gravity);
        }
        if (gravity <= 545) {
            inc = 1.0;

        }
        r.setTranslateX(gravity);
    }

    @Override
    public double getPosX() {
        return this.PosX;
    }

    @Override
    public double getPosY() {
        return this.PosY;
    }

    @Override
    public double getWidth() {
        return WIDTH;
    }

    @Override
    public double getHeight() {
        return tubeHeight;
    }

    @Override
    public String getTubeImagePath(){
        return tubeImagePath;
    }


}
