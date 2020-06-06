package view;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import util.Pair;

public class TubeViewImpl implements TubeView{

    Rectangle r;
    Rectangle r2;

    public TubeViewImpl(){ }


    @Override
    public void createRectangles() {

        r = new Rectangle();
        r2 = new Rectangle();
    }

    @Override
    public void setTubeUpPosition(double x, double y) {
        r.setX(x);
        r.setY(y);
    }

    @Override
    public void setTubeUpDimension(double width, double height) {
        r.setWidth(width);
        r.setHeight(height);
    }

    @Override
    public void setTubeDownPosition(double x, double y) {
        r2.setX(x);
        r2.setY(y);
    }

    @Override
    public void setTubeDownDimension(double width, double height) {
        r2.setWidth(width);
        r2.setHeight(height);
    }

    @Override
    public void seTubeUpImage(String image) {
        r.setFill(new ImagePattern(new Image(image)));
    }

    @Override
    public void seTubeDownImage(String image) {
        r2.setFill(new ImagePattern(new Image(image)));
    }

    @Override
    public Pair getRectangles() {
        return new Pair(r,r2);
    }
}
