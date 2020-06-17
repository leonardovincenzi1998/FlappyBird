package model.bird;

import javafx.scene.shape.Rectangle;
import view.BirdViewImpl;

/**
 * Model's interface of bird.
 */
public interface Bird {
    /**
     * Update the position of the bird.
     * @param r Rectangle initialize in {@link BirdViewImpl#BirdViewImpl()} constructor.
     * @param n Constant defined in {@link controllers.GameLoopImpl}, set the increase of pixel at each loop.
     */
    void birdUpdate(Rectangle r, double n);

    /**
     * Get the bird's image path.
     * @return Bird's Image Path
     */
    String getBirdImagePath();

    /**
     * Get Bird's width.
     * @return constant WIDTH_BIRD
     */
    int getWidthBird();

    /**
     * Get Bird's height.
     * @return constant HEIGHT_BIRD
     */
    int getHeightBird();

    /**
     * Get Bird's X position.
     * @return coordinate X
     */
    double getPosX();

    /**
     * Get Bird's Y position.
     * @return coordinate Y
     */
    double getPosY();

    /**
     * Set Bird's Y position.
     * @param posY coordinate Y
     */
    void setPosY(double posY);

    /**
     * Set bird_instance = null, for create a new Bird instance.
     */
    void setBirdInstance();

}
