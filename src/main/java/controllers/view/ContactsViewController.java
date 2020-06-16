package controllers.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * The Controller related to the contacts.fxml GUI.
 *
 */
public class ContactsViewController {

    @FXML
    private Button goBack;

    //Quando questo metodo viene chiamato ritorno al mainMenu
    public final void returnHome(final ActionEvent event) throws IOException {
        final Parent root = FXMLLoader.load(ClassLoader.getSystemResource("layouts/main.fxml"));
        final Scene scene = new Scene(root);

        //Prendo le informazioni dello Stage
        final Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        //Cambio scena con .setScene e mostro window
        window.setScene(scene);
        window.show();
    }
}
