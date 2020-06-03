package controllers.utilities;

import javafx.scene.shape.Rectangle;
import util.Pair;

public interface TubeMap {

    void addToMap(Pair tubePair);

    Pair getLastValue();

    void scrollTubePair();

    void checkWindowEnd();

    boolean checkCollision(Rectangle flappy);
}
