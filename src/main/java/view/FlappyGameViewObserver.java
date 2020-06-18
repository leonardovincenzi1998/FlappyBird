package view;

/**
 * FlappyGameViewObserver implemented by FlappyBirdControllerImpl allows view-controller communication.
 */
public interface FlappyGameViewObserver {
    /**
<<<<<<< HEAD
     * Add to view the flappy and the first pair of tube.
=======
     * Add to view the bird and the first pair of tube.
>>>>>>> e1e70d04a17c6b6808d3feb2a5c40e15cf923ab9
     */
    void startGame();

    /**
     * View intercepts user input and inform controller about that.
     */
    void pressSpace();

}
