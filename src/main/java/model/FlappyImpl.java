package model;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import view.FlappyViewImpl;

public class FlappyImpl implements Flappy  {

    private static final double HEIGHT = 335;
    private double posX;
    private double posY;
    private double gravity = 20;
    private int cont = 0;
    //private double inc = 1.0;
    private final String flappyImagePath;

    Timeline timelineDown=new Timeline();
    Timeline timelineUp=new Timeline();


    public FlappyImpl() {
        posX = 50;
        flappyImagePath = ("bird.png");
    }

    public void flappyUpdate(Rectangle r) {
        double inc = 1.0;
        r.setTranslateY(gravity);
        timelineDown = new Timeline(new KeyFrame(
                Duration.seconds(0.005),
                x -> flappyGravity(r,inc))
        );
        timelineDown.setCycleCount(Timeline.INDEFINITE);
        timelineDown.play();
    }

    public void flappyJump(Rectangle r) {
        timelineDown.pause();
        double inc = -1.0;
        r.setTranslateY(gravity);
        timelineUp = new Timeline(new KeyFrame(
                Duration.seconds(0.005),
                x -> flappyGravity(r, inc))
        );
        timelineUp.setCycleCount(55);
        timelineUp.play();
        timelineUp.setOnFinished(actionEvent -> timelineDown.play());


    }

    public void flappyGravity(Rectangle r, double inc) {
        if ((gravity >= HEIGHT - getHeightBird()) || (gravity == 0 )) {
            System.out.println("fermati");
            timelineDown.stop();
            timelineUp.stop();
        }
        gravity = gravity + inc;
        r.setTranslateY(gravity);
    }




    /*public void jump(Rectangle r) {
        gravity--;
        r.setTranslateY(gravity);

    }*/
    public double getGravity() {
        return gravity;
    }


    public String getFlappyImagePath() {
        return flappyImagePath;
    }

    public int getWidthBird() {
        return 45;
    }

    public int getHeightBird() {
        return 32;
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }


}
