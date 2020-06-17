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

public class EndGameViewController {

    private final IOName ioName;

    public EndGameViewController() {
        ioName = new IOName();
    }

    private String name = "user";

    @FXML
    private TextArea nameArea;

    @FXML
    public final void saveName(final ActionEvent event) throws Exception{
        name = nameArea.getText();
        //System.out.println(name);

        final Parent root = FXMLLoader.load(ClassLoader.getSystemResource("layouts/main.fxml"));
        final Scene scene = new Scene(root);

        //Prendo le informazioni dello Stage
        final Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        //Cambio scena con .setScene e mostro window
        window.setScene(scene);
        window.show();
        printUserName(name);

    }

    public final void printUserName(final String name) throws IOException {
        ioName.writeName(name);
    }

}
