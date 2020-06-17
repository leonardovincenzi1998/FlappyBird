package controllers;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;


public class GameLoopImpl extends Application implements GameLoop{

    private final FlappyBirdController controller;
    private AnimationTimer timer;

    private int cont2 = 0;
    private final Timer timer2 = new Timer(200, (elem) ->  gravity = true);

    private boolean gravity = true;

    public GameLoopImpl(final FlappyBirdControllerImpl controller, final Stage primaryStage) {
        this.controller = controller;
        this.start(primaryStage);
    }

    @Override
    public void start(final Stage primaryStage) {
        timer = new AnimationTimer() {
            @Override
            public void handle(final long now) {
                try {
                    checkCollision();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (gravity) {
                    birdUpdateDown();
                } else {
                    birdUpdateUp();
                }
                controller.getTubeController().scrollTubes();
                cont2++;
                if (cont2 == 125) {
                    cont2 = 0;
                    try {
                        controller.getTubeController().addTube();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        };
        timer.start();
    }

    @Override
    public void userAction() {
        timer2.stop();
        gravity=false;
        timer2.start();
    }

    @Override
    public void birdUpdateDown() {
        final double n = 2.75;
        this.controller.getFlappyController().flappyMovement(n);
    }

    @Override
    public void birdUpdateUp() {
        final double n = -2.75;
        this.controller.getFlappyController().flappyMovement(n);
    }

    @Override
    public void checkCollision() throws IOException {
        controller.checkCollision();
    }

    @Override
    public void findCollision() {
            timer.stop();
    }
}



