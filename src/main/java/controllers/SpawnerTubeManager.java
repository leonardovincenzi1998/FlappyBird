package controllers;

public class SpawnerTubeManager extends Thread{

    private static SpawnerTubeManager singleton = null;
    private final FlappyBirdController controller;

    private SpawnerTubeManager(final FlappyBirdController controller) {
        super();
        this.controller = controller;
    }

    public static synchronized SpawnerTubeManager getPlanktonSpawner(final FlappyBirdController controller) {
        if (singleton == null) {
            singleton = new SpawnerTubeManager(controller);
        }
        return singleton;
    }


}
