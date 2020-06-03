package controllers;


import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class GameLoopImpl extends Application {
    private FlappyBirdController controller;

    private AnimationTimer timer;
    private int cont = 0;
    private int cont2=0;

    private boolean gravity = true;

    public GameLoopImpl(FlappyBirdControllerImpl controller, Stage primaryStage) throws Exception {
        this.controller = controller;
        this.start(primaryStage);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                try {
                    borderCollision();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                controller.scrollTubes();
                cont2++;
                if (cont2 == 125) {
                    cont2 = 0;
                    try {
                        controller.addTube();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        };
        timer.start();
    }


    public void borderCollision() throws IOException {
        controller.checkBorderCollision();
    }

    public void collision() {
        timer.stop();
        }
    }



