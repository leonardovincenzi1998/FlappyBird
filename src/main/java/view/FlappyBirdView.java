package view;

<<<<<<< HEAD
import model.FlappyImpl;

import java.awt.*;
=======
import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
>>>>>>> 85a138a34cf214c14af3b4c961378f9d12c289ea

public interface FlappyBirdView {

    void printBird();

    void start();
<<<<<<< HEAD
   // void setScore();
=======


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
>>>>>>> 85a138a34cf214c14af3b4c961378f9d12c289ea

}
