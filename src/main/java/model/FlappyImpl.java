package model;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import view.FlappyViewImpl;

public class FlappyImpl implements Flappy  {

    private static final double HEIGHT = 335;
    private double posX;
    private double posY;
    private double gravity = 20;
    private double inc = 1.0;
    private final String flappyImagePath;

    Timeline timeline=new Timeline();

    public FlappyImpl() {
        posX = 50;
        flappyImagePath = ("bird.png");
    }

    public void flappyUpdate(Rectangle r) {
        r.setTranslateY(gravity);
        timeline = new Timeline(new KeyFrame(
                Duration.seconds(0.025),
                x -> flappyGravity(r))
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();


    }

    public void flappyGravity(Rectangle r) {
        gravity = gravity+inc;
        if (gravity >= HEIGHT - getHeightBird()) {
            timeline.stop();
            System.out.println("diocane");
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
