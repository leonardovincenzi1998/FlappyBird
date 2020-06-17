package controllers.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import util.IOName;

import java.io.IOException;

/**
 * Class that control endgamemenu.fxml.
 */
public class EndGameViewController {

    private final IOName ioName;

    public EndGameViewController() {
        ioName = new IOName();
    }

    @FXML
    private TextArea nameArea;

    /**
     * When user click the Submit button, the name insert by the user is saved and the scene switch to main.fxml.
     * @param event Action event of the button
     * @throws Exception Exception
     */
    @FXML
    public final void saveName(final ActionEvent event) throws Exception{
        String name = nameArea.getText();
        final Parent root = FXMLLoader.load(ClassLoader.getSystemResource("layouts/main.fxml"));
        final Scene scene = new Scene(root);
        final Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();
        printUserName(name);

    }

    /**
     * Call {@link IOName#writeName(String)}.
     * @param name The user's name
     */
    public final void printUserName(final String name) {
        ioName.writeName(name);
    }

}
