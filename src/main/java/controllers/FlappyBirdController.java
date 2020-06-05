package controllers;

import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

import java.io.IOException;

public interface FlappyBirdController {

    void pressSpace();

    //void scrollTubes();

    //void addTube() throws Exception;

<<<<<<< HEAD
    void salta();

    void initialGame();
=======
    void flappyMovement(double n);
>>>>>>> 4540c5e9cfc6bcea5b06f52317ac1d1180c36f4c

    void checkCollision();

    void startGame();


    /**
     * Quits the game.
     */
    //void quit();

    /**
     * Updates score via model and pass it to view to be displayed.
     */
    //void updateScore();

    /**
     * Return main view node from view.
     * @return view's root node
     */
    //Pane getRoot();

    /**
     * Removes node from view's root node.
     * @param e node to be removed
     */
    void removeNode(Node e);

    /**
     * Adds node to view's root node.
     * @param n node to be added
     */
    void addNode(Node n);
}
