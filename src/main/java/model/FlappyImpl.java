package model;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.sql.SQLXML;

public class FlappyImpl implements Flappy{

    private static final double HEIGHT = 335  ;
    private double posX;
    private double posY;
    double inc = 1.0;
    private final String flappyImagePath;
    private FlappyStateImpl state;


    public FlappyImpl() {
        posX = 50;
        posY = 50;
        flappyImagePath = ("bird.png");
    }


    @Override
    public void flappyUpdate(Rectangle r, double n) {
        r.setY(r.getY()+n);
        System.out.println(r.getY());
    }


    /*public void getJump(){
        return state.setState();
    }

    public void getDown(){
        return state.setState();

    }*/

    public String getFlappyImagePath() {
        return flappyImagePath;
    }

    @Override
    public int getWidthBird() {
        return 45;
    }

    @Override
    public int getHeightBird() {
        return 32;
    }

    @Override
    public double getPosX() {
        return posX;
    }

    @Override
    public void setPosX(double posX) {
        this.posX = posX;
    }

    @Override
    public double getPosY() {
        return posY;
    }

    @Override
    public void setPosY(double posY) {
        this.posY = posY;
    }


}
