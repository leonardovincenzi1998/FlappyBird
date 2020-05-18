package controllers;

import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public interface FlappyBirdController {

    //SpongebobGame getModel();

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
    //void removeNode(Node e);

    /**
     * Adds node to view's root node.
     * @param n node to be added
     */
    void addNode(Node n);
}