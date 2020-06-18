package controllers;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;
import javax.swing.Timer;

/**
 * This class implement a GameLoop that moves all the view's objects.
 */
public class GameLoopImpl extends Application implements GameLoop {

    static final double PIXEL_MOVEMENT = 2.75;
    static final double SPAWN_FLAG = 125; 
    private final FlappyBirdController controller;
    private AnimationTimer gravityTimer;
    private int cont = 0;
    private final Timer jumpTimer = new Timer(200, (elem) ->  gravity = true);
    private boolean gravity = true;

    /**
     * This is constructor method that initialized the controller and give to the method {@link GameLoopImpl#start(Stage)} the primaryStage.
     * @param controller FlappyBirdController
     * @param primaryStage primaryStage is the window
     */
    public GameLoopImpl(final FlappyBirdControllerImpl controller, final Stage primaryStage) {
        this.controller = controller;
        this.start(primaryStage);
    }
    @Override
    public final void start(final Stage primaryStage) {
        gravityTimer = new AnimationTimer() {
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
                cont++;
                if (cont == SPAWN_FLAG) {
                    cont = 0;
                    try {
                        controller.getTubeController().addTube();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        };
        gravityTimer.start();
    }

    @Override
    public void userAction() {
        jumpTimer.stop();
        gravity = false;
        jumpTimer.start();
    }

    @Override
    public void birdUpdateDown() {
        final double n = PIXEL_MOVEMENT;
        this.controller.getBirdController().birdMovement(n);
    }

    @Override
    public void birdUpdateUp() {
        final double n = -PIXEL_MOVEMENT;
        this.controller.getBirdController().birdMovement(n);
    }

    @Override
    public void checkCollision() {
        controller.checkCollision();
    }

    @Override
    public void findCollision() {
            gravityTimer.stop();
    }
}



