package controllers;

import controllers.utilities.TubeMap;
import util.Pair;

/**
 * This interfaces initializes and controls the TubeRectangles of the view
 */
public interface TubeController {

    /**
     *Call {@link TubeMap} methods that add the new Pair of tubes' rectangles to the treeMap and print them in the view
     */
    void addTube();

    /**
     * Call {@link TubeMap} method that scroll all the tubes' rectangles in the screen
     */
    void scrollTubes();

    /**
     *
     * @return the class that manage all the tube's rectangle in the screen
     */
    TubeMap getTubeMap();
}
