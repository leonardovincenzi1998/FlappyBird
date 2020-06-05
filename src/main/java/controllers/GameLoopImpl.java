package controllers;


import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;


public class GameLoopImpl extends Application {

    private FlappyBirdController controller;
    private TubeControllerImpl tubeController;
    private FlappyControllerImpl flappyController;
    private AnimationTimer timer;
    private int cont = 0;
    private int cont2=0;
    final Timer timer2 = new Timer(200, (elem) ->  gravity=true);

    private boolean gravity = true;

    public GameLoopImpl(FlappyBirdControllerImpl controller, Stage primaryStage, TubeControllerImpl tubeController, FlappyControllerImpl flappyController) throws Exception {
        this.controller = controller;
        this.start(primaryStage);
        this.tubeController = tubeController;
        this.flappyController = flappyController;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                try {
                    checkCollision();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (gravity) {
                    flappyUpdateDown();
                } else {
                    flappyUpdateUp();
                }
                tubeController.scrollTubes();
                cont2++;
                if (cont2 == 125) {
                    cont2 = 0;
                    try {
                        tubeController.addTube();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        };
        timer.start();
    }

    public void userAction() {
        timer2.stop();
        gravity=false;
        timer2.start();
        //gravity = true;
        //cont=0;
        //System.out.println(flag);
    }


    public void flappyUpdateDown() {
        double n = 2.75;
        this.flappyController.flappyMovement(n);
    }

    public void flappyUpdateUp() {
        double n = -2.75;
        this.flappyController.flappyMovement(n);
    }


    public void checkCollision() throws IOException {
        controller.checkCollision();

    }

    public void collision() {
            timer.stop();
    }
}



