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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

/**
 * The Controller related to the leaderboard.fxml GUI.
 *
 */
public class LeaderboardViewController implements Initializable {

    private int line = 0;
    private int line2 = 0;
    private final File file = new File("src/main/resources/input-output/Scores.txt");
    private final Path filePath = Paths.get(String.valueOf(file));
    private final List<User> list = new ArrayList<>();

    private final Path path = Paths.get(String.valueOf(filePath));
    private final long lineCount = Files.lines(path).count();

    @FXML
    private TableView<User> table;

    public LeaderboardViewController() throws IOException {
    }


    @SuppressWarnings("unchecked")
    @Override
    public final void initialize(final URL location, final ResourceBundle resources) {
        TableColumn<User, String> name = new TableColumn<>("UserName");
        TableColumn<User, String> score = new TableColumn<>("Score");

        table.getColumns().addAll(name, score);

        for (int i = 0; i < lineCount / 2; i++) {
            list.add(new User(readName(), readScore()));
        }

        ObservableList<User> data = FXCollections.observableArrayList(list);

        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        score.setCellValueFactory(new PropertyValueFactory<>("score"));

        Collections.reverse(data);
        table.setItems(data);
    }

    /**
     *
     * @return the string with the name of the user read on the text file
     */
    private String readName() {

        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            String readLine;

            for (int i = 0; i < lineCount; i++)  {
                readLine = bf.readLine();
                if (i == line) {
                    if (line % 2 != 0) {
                        line++;
                        return readLine;
                    }
                    line++;
                }
            }

        } catch (IOException e) {
                    e.printStackTrace();
                }
                return "No more player";
    }

    /**
     *
     * @return the string with the user's score read on the text file
     */
    private String readScore() {
        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            String readLine;
            //
            for (int i = 0; i < lineCount; i++) {
                readLine = bf.readLine();
                if (i == line2) {
                    if (line2 % 2 == 0) {
                        line2++;
                        return readLine;
                    }
                    line2++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "0";
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
