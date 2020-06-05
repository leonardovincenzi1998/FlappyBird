package controllers;

import java.io.IOException;

public interface GameLoop {

    void userAction();

    void birdUpdateDown();

    void birdUpdateUp();

    void checkCollision() throws IOException;

    void findCollision();
}
