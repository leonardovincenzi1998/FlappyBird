package controllers;


import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;

public class GameLoopImpl extends Application {
    private FlappyBirdController controller;

    public GameLoopImpl(FlappyBirdControllerImpl controller, Stage primaryStage) throws Exception {
        this.controller = controller;
        this.start(primaryStage);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        new AnimationTimer() {
            @Override
            public void handle(long now) {
                update();
            }
        }.start();
    }

    public void update(){
        this.controller.initialGame();
    }

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
