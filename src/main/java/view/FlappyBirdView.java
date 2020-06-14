package view;

import javafx.scene.Node;

import java.io.IOException;

public interface FlappyBirdView {


    void start();

    void endGame(int score) throws IOException;

    void setObserver(FlappyGameViewObserver observer);

    /**
     * Sets new score in game view "score" label.
     * @param n New score.
     */
    void setScore(int n);

    /**
     * Returns main view node.
     * @return view's root node
     */
   // Pane getRoot();

    /**
     * Adds children node to root node.
     * @param e node to be added
     */
    void addChildren(Node e);

    /**
     * Removes children node e from root node.
     * @param e node to be removed
     */
    void removeChildren(Node e);



}
