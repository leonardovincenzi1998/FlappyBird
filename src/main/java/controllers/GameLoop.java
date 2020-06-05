package controllers;

import java.io.IOException;

public interface GameLoop {

    void userAction();

    void flappyUpdateDown();

    void flappyUpdateUp();

    void checkCollision() throws IOException;

    void findCollision();
}
