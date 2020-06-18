package view;

import java.io.IOException;

import javafx.scene.control.Button;

public interface EndGame {

    /**
     * Create and show the quit button that send the user to the FXML endgame menu.
     * @throws IOException 
     */
    void quitBtn() throws IOException;

    /**
     * 
     * @return quitBtn 
     */
    Button getButton();
}
