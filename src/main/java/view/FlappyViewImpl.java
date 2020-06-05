package view;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class FlappyViewImpl implements FlappyView {

    Rectangle r = new Rectangle();

    public FlappyViewImpl() { }

    @Override
    public void setPosition(double x, double y) {
        r.setX(x);
        r.setY(y);
    }

    @Override
    public void setWidthHeight(int height, int width){
        r.setHeight(height);
        r.setWidth(width);
    }

    @Override
    public void setImage(String image){
        r.setFill(new ImagePattern( new Image(image)));
    }

    @Override
    public void updatePosition(double y) {
        r.setY(y);
    }

    @Override
    public Rectangle getFlappy(){
        return this.r;
    }

}
