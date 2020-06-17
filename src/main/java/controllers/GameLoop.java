package controllers;

import java.io.IOException;

/**
 * Interface of the game loop
 */
public interface GameLoop {
    /**
     *
     */
    void userAction();

    void birdUpdateDown();

    void birdUpdateUp();

    void checkCollision() throws IOException;

    void findCollision();
}
