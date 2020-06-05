package view;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class FlappyViewImpl {

    Rectangle r = new Rectangle();

    public FlappyViewImpl() {

    }

    public void setPosition(double x, double y) {
        r.setX(x);
        r.setY(y);
    }

    public void setWidthHeight(int height, int width){
        r.setHeight(height);
        r.setWidth(width);
    }

    public void setImage(String image){
        r.setFill(new ImagePattern( new Image(image)));
    }

    public Rectangle getFlappy(){
        return this.r;
    }

    /*public setPosition(double x, double y){
        r.setX(x);
        r.setY(y);
    }*/
}
