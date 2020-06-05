package controllers;


import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;


public class GameLoopImpl extends Application {

    private FlappyBirdController controller;
    private TubeControllerImpl tubeController;
    private AnimationTimer timer;
    private int cont = 0;
    private int cont2=0;
    final Timer timer2 = new Timer(200, (elem) ->  gravity=true);

    private boolean gravity = true;

<<<<<<< HEAD
    public GameLoopImpl(FlappyBirdControllerImpl controller, Stage primaryStage) throws Exception {
=======

    public GameLoopImpl(FlappyBirdControllerImpl controller, Stage primaryStage, TubeControllerImpl tubeController) throws Exception {
>>>>>>> 4540c5e9cfc6bcea5b06f52317ac1d1180c36f4c
        this.controller = controller;
        this.start(primaryStage);
        this.tubeController = tubeController;
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
<<<<<<< HEAD
                    flappyUpdateJump();
                    cont++;
                    if (cont == 20) {
                        System.out.println("ciao");
                        gravity = true;
                        cont = 0;
                    } else {
                        spazioPremuto();
                    }
=======
                    flappyUpdateUp();
>>>>>>> 4540c5e9cfc6bcea5b06f52317ac1d1180c36f4c
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

<<<<<<< HEAD
    public void spazioPremuto() {
        gravity = false;
        //System.out.println(flag);
    }

    public void flappyUpdateJump() {
        this.controller.salta();
    }

    public void flappyUpdateDown() {
        this.controller.initialGame();
=======

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
        this.controller.flappyMovement(n);
    }

    public void flappyUpdateUp() {
        double n = -2.75;
        this.controller.flappyMovement(n);
    }
>>>>>>> 4540c5e9cfc6bcea5b06f52317ac1d1180c36f4c

    }

    public void checkCollision() throws IOException {
        controller.checkCollision();

    }

    public void collision() {
            timer.stop();
    }
}


<<<<<<< HEAD
    /*private double previous = System.currentTimeMillis();
    private double lag;
    private final static double MS_PER_UPDATE = 16.666666;
>>>>>>> e8750f17183241ad9a57d3182128728f3627100a
    private TubeControllerImpl tubeController;
    private FlappyControllerImpl flappyController;
    private int cont = 0;
    private int contDentro = 0;
    private double current;
    private double elapsed;


    public GameLoopImpl(TubeControllerImpl tubeController, FlappyControllerImpl flappyController) {
        this.tubeController = tubeController;
        this.flappyController = flappyController;
        //System.out.println(previous);
        this.loop();
    }

    public void loop() {
        while (true) {
            current = System.currentTimeMillis();
            elapsed = current - previous;
            //System.out.println(elapsed);
            previous = current;
            lag += elapsed;
            //System.out.println(this.flappyController.getFlappyModel().getPosY());
            System.out.println(this.flappyController.getFlappyView().getFlappy().getY());
            /*if ((this.flappyController.getFlappyModel().getPosY())== 100) {
                break;
            }*/
            /*if(cont == 100000){
                System.out.println(this.flappyController.getFlappyView().getFlappy().getY());
                break;
            }
            cont++;
            /*System.out.println("Previous " + previous);
            System.out.println("Current " + current);
            System.out.println("Elapsed " + elapsed);
            System.out.println("Lag " + lag);
            System.out.println("Giro " + cont);*/
           /* update();
            while (this.lag >= MS_PER_UPDATE) {
                //contDentro++;
                update();
                this.lag -= MS_PER_UPDATE;
                //System.out.println("GiroDentro " + contDentro);
            }
            //render(lag/MS_PER_UPDATE);

>>>>>>> 1b3154916649ddcf2b1297f940158704824edce2
        }
    }
*/

=======
>>>>>>> 4540c5e9cfc6bcea5b06f52317ac1d1180c36f4c

