package view;

import util.Pair;

public interface TubeView {

    void createRectangles();

    void setTubeUpPosition(double x, double y);

    void setTubeUpDimension(double width, double height);

    void setTubeDownPosition(double x, double y);

    void setTubeDownDimension(double width, double height);

    void seTubeUpImage(String image);

    void seTubeDownImage(String image);

    Pair getRectangles();

}
