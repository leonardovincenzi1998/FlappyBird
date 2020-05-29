package controllers;

<<<<<<< HEAD

=======
import javafx.animation.Animation;
>>>>>>> be1bf76344845f50f09ab0a0f40d1840992607d3
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class GameLoopImpl extends Application {
    private FlappyBirdController controller;
<<<<<<< HEAD
    private AnimationTimer timer;
    private int cont=0;
=======
    private boolean gravity = true;
    private int cont = 0;
>>>>>>> be1bf76344845f50f09ab0a0f40d1840992607d3

    public GameLoopImpl(FlappyBirdControllerImpl controller, Stage primaryStage) throws Exception {
        this.controller = controller;
        this.start(primaryStage);
    }
    @Override
<<<<<<< HEAD
    public void start(Stage primaryStage) throws Exception {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                controller.scrollTubes();
                cont++;
                if(cont == 250){
                    cont=0;
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


    /*public void updateDown(){
        this.controller.initialGame();
    }*/

    /*public void updateUp() throws Exception {
        timer.stop();
        AnimationTimer timer1 = new AnimationTimer() {
            @Override
            public void handle(long now) {
                jump();
            }
        };
        timer1.start();
    }*/

    /*public void jump(){
        this.controller.flappyJump();
    }*/
=======
    public void start(Stage primaryStage) {
        new AnimationTimer() {
            @Override
            public void handle(long now) {
                    try {
                        quitLoop();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (gravity) {
                        flappyUpdateDown();
                    } else {
                        flappyUpdateJump();
                        cont++;
                        if (cont == 20) {
                            gravity = true;
                            cont = 0;
                        } else {
                            spazioPremuto();
                        }
                    }

                }


        }.start();
    }

    public void spazioPremuto() {
        gravity=false;
        //System.out.println(flag);
    }

    public void flappyUpdateDown(){
        double n = 2.75;
        this.controller.initialGame(n);
    }

    public void flappyUpdateJump() {
        double n = -2.75;
        this.controller.initialGame(n);

    }
    public void quitLoop() throws IOException {
        this.controller.quit();
    }
>>>>>>> be1bf76344845f50f09ab0a0f40d1840992607d3

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

        }
    }

    public void update() {
        this.flappyController.getFlappyModel().gravity(this.flappyController.getFlappyView().getFlappy());

<<<<<<< HEAD
=======
    }

    public void render(double n){
        //this.flappyController.getFlappyModel().gravity(this.flappyController.getFlappyView().getFlappy());
        //this.flappyController.ge
        //this.flappyController.getFlappyView();
>>>>>>> e8750f17183241ad9a57d3182128728f3627100a
    }*/
}
