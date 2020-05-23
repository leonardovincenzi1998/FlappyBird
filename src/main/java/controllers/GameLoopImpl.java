package controllers;

public class GameLoopImpl {/*

    private double previus = System.currentTimeMillis();
    private double lag = 0.0;
    private final static double MS_PER_UPDATE = 16.66666667;
    private TubeControllerImpl tubeController;
    private FlappyControllerImpl flappyController;


    public GameLoopImpl(TubeControllerImpl tubeController, FlappyControllerImpl flappyController) {
        this.tubeController = tubeController;
        this.flappyController = flappyController;
        this.loop();
    }

    public void loop() {
        while (true) {
            double current = System.currentTimeMillis();
            double elapsed = current - previus;
            previus = current;
            lag += elapsed;
            System.out.println(this.flappyController.getFlappyModel().getPosY());
            if ((this.flappyController.getFlappyModel().getPosY())== 335) {
                break;
            }
            while (lag >= MS_PER_UPDATE) {
                update();
                lag -= MS_PER_UPDATE;
            }
            //render(lag/MS_PER_UPDATE);

        }
    }

    public void update() {
        this.flappyController.getFlappyModel().gravity();

    }*/
}
