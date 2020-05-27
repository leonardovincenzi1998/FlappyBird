package model;

import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.sql.SQLXML;

public class FlappyImpl implements Flappy  {

    private static final double HEIGHT = 335;
    private double posX;
    private double posY;
    private double gravity = 20;
    private final String flappyImagePath;

    TranslateTransition move = new TranslateTransition();

    public FlappyImpl() {
        posX = 50;
        posY = 50;
        flappyImagePath = ("bird.png");
    }

    public void flappyUpdate(Rectangle r, double n) {
        //System.out.println(getPosY());
        r.setY(getPosY()+n);
        setPosY(getPosY()+n);
    }

    public void floorCollision(Rectangle r) throws IOException {
        final Parent root = FXMLLoader.load(ClassLoader.getSystemResource("layouts/main.fxml"));
        final Scene scene = new Scene(root);
        final Stage window = new Stage();

        if (getPosY()==HEIGHT-getHeightBird()) {
            System.out.println("quit");
            window.setScene(scene);
            window.show();
        }
    }

    /*public void flappyJump(Rectangle r) {
        System.out.println(getPosY());
        move.setByY(-400);
        System.out.println(getPosY());
        move.setDuration(Duration.millis(1000));
        move.setAutoReverse(true);
        move.setCycleCount(2);
        move.setNode(r);
        move.play();
        //double inc = 1.0;
        r.setTranslateY(gravity);
        timelineDown = new Timeline(new KeyFrame(
                Duration.seconds(0.005),
                x -> flappyGravity(r,inc))
        );
        timelineDown.setCycleCount(Timeline.INDEFINITE);
        timelineDown.setRate(inc);
        timelineDown.play();
    }*/

    /*public void flappyGravity(Rectangle r, double inc) {
        if ((gravity >= HEIGHT - getHeightBird()) || (gravity == 0 )) {
            System.out.println("fermati");
            timelineDown.stop();
            timelineUp.stop();
        }
        gravity = gravity + inc;
        r.setTranslateY(gravity);
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
    }*/

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
