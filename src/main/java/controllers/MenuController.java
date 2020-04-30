package controllers;

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
 * The Controller related to the main.fxml GUI.
 *
 */
public final class MenuController {

    @FXML
    public Button leaderboardBtn;
    public Button contactBtn;
    public Button playBtn;

    //funzione che associa al click del bottone "contactBtn" un evento
    @FXML
    public void clickContacts(ActionEvent event) throws IOException {

        final Parent contacts = FXMLLoader.load(ClassLoader.getSystemResource("layouts/contacts.fxml"));
        final Scene contactsScene = new Scene(contacts);

        //Prendo le informazioni dello Stage
        final Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        //Cambio scena con .setScene e mostro window
        window.setScene(contactsScene);
        window.show();

    }
    //funzione che associa al click del bottone "leaderboardBtn" un evento
    public void clickLeaderboard(ActionEvent event) throws IOException {

        final Parent leaderboard = FXMLLoader.load(ClassLoader.getSystemResource("layouts/leaderboard.fxml"));
        final Scene leaderboardScene = new Scene(leaderboard);

        //Prendo le informazioni dello Stage
        final Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        //Cambio scena con .setScene e mostro window
        window.setScene(leaderboardScene);
        window.show();

    }


    public Button getPlayBtn() {
        return playBtn;
    }

    public void setPlayBtn(Button playBtn) {
        this.playBtn = playBtn;
    }
}



