package model;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class FlappyImpl implements Flappy  {

    private static final double HEIGHT = 335;
    private static final double WIDTH = 600;
    private double posX;
    private double posY;
    private double gravity;
    private double inc;
    private final String flappyImagePath;

    Rectangle r= new Rectangle();
    Timeline timeline=new Timeline();

    public FlappyImpl() {
        posX = 50;
        posY = 50;
        gravity = 20;
        flappyImagePath = ("bird.png");
    }

    public void flappyUpdate() {
        r.setTranslateY(gravity);
        timeline = new Timeline(new KeyFrame(
                Duration.seconds(0.025),
                x -> flappyGravity())
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    public void flappyGravity() {
        gravity = gravity+inc;
        if (gravity >= HEIGHT - getHeightBird()) {
            timeline.stop();
        }
        if (gravity <= 20) {
            inc = 1.0;
        }
        r.setTranslateY(gravity);
    }

    public double getGravity() {
        return gravity;
    }

    public String getFlappyImagePath() {
        return flappyImagePath; }

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
