package controllers.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import util.User;

import java.io.*;
import java.net.URL;
import java.util.*;

/**
 * The Controller related to the scoreboard.fxml GUI.
 *
 */
public class ScoreBoardViewController implements Initializable {

    private static  final String FILE_NAME = "input-output/Scores.txt";
    private int oddLine;
    private int evenLine;
    private final List<User> list = new ArrayList<>();
    private final long lineCount;

    @FXML
    private TableView<User> table;

    /**
     * This is the constructor method that initialized all useful variables.
     */
    public ScoreBoardViewController() {
        lineCount = getCountLine();
    }

    @SuppressWarnings("unchecked")
    @Override
    public final void initialize(final URL location, final ResourceBundle resources) {
        final TableColumn<User, String> name = new TableColumn<>("UserName");
        final TableColumn<User, String> score = new TableColumn<>("Score");

        table.getColumns().addAll(name, score);

        for (int i = 0; i < lineCount / 2; i++) {
            list.add(new User(readName(), readScore()));
        }

        final ObservableList<User> data = FXCollections.observableArrayList(list);

        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        score.setCellValueFactory(new PropertyValueFactory<>("score"));

        Collections.reverse(data);
        table.setItems(data);
    }

    private String readName() {

        InputStreamReader in = new InputStreamReader(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream(FILE_NAME)));
        try (BufferedReader bf = new BufferedReader(in)) {
            String readLine;
            int i = 0;
            while((readLine = bf.readLine()) != null){
                if (i == oddLine) {
                    if (oddLine % 2 != 0) {
                        oddLine++;
                        return readLine;
                    }
                    oddLine++;
                }
                i++;
            }
        } catch (IOException e) {
                    e.printStackTrace();
                }
                return "No more player";
    }


    private String readScore() {
        InputStreamReader in = new InputStreamReader(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream(FILE_NAME)));
        try (BufferedReader bf = new BufferedReader(in)) {
            String readLine;
            int i = 0;
            while((readLine = bf.readLine()) != null){
                if (i == evenLine) {
                    if (evenLine % 2 == 0) {
                        evenLine++;
                        return readLine;
                    }
                    evenLine++;
                }
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "0";
    }

    private int getCountLine(){
        int i = 0;
        InputStreamReader in = new InputStreamReader(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream(FILE_NAME)));
        try (BufferedReader bf = new BufferedReader(in)) {

            while(bf.readLine() != null){
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return i;
    }


    /**
     * When user click the Return to the home button the scene switch to main.fxml.
     * @param event Action event of the button
     * @throws IOException IO exception
     */
    public final void returnHome(final ActionEvent event) throws IOException {
        final Parent root = FXMLLoader.load(ClassLoader.getSystemResource("layouts/main.fxml"));
        final Scene scene = new Scene(root);
        final Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();
    }
}
