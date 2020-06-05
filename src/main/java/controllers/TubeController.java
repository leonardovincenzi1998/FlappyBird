package controllers;

import controllers.utilities.TubeMap;
import util.Pair;

public interface TubeController {

    Pair createTubePair();

    void addTube();

    void scrollTubes();

    TubeMap getTubeMap();
}
