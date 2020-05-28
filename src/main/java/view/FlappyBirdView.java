package view;

import javafx.scene.layout.Pane;
import model.FlappyImpl;

import java.awt.*;
import javafx.scene.Node;
import javafx.scene.shape.Rectangle;


public interface FlappyBirdView {


    void start();

    void quitBtn();
   // void setScore();

    Pane getRoot();

    void setObserver(FlappyGameViewObserver observer);

    /**
     * Sets new score in game view "score" label.
     * @param val New score.
     */
    //void setScore(int val);

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
   // void removeChildren(Node e);


}
