package view;

import java.io.IOException;

public interface FlappyGameViewObserver {

    void pressSpace();

    void quit() throws IOException;

}
