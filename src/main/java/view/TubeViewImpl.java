package view;

import controllers.FlappyBirdController;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import model.Tube;



public class TubeViewImpl {

    //FlappyBirdView view;
    public Rectangle r = new Rectangle();
    public Image ico;
    private Tube tube;

    //StackPane imageContainer = new StackPane();
    //ImageView image = new ImageView(new Image(ClassLoader.getSystemResource("tube.png").toString()));
    //final ImageView tubo = new ImageView(new Image(ClassLoader.getSystemResource("tube.png").toString()));


    public TubeViewImpl(final Tube tube){
        this.tube = tube;
        this.ico = new Image(tube.getTubeImagePath());
        /*r.setX(tube.getPosX());
        r.setY(tube.getPosY());*/
        System.out.println("Lunghezza tubo: " + this.tube.getHeight());

        r.setWidth(this.tube.getWidth());
        r.setHeight(this.tube.getHeight());

        //System.out.println("Lunghezza tubo2: " + this.tube.getHeight());
        System.out.println("Lunghezza rettangolo: " + r.getHeight());


        r.setX(tube.getPosX());
        r.setY(tube.getPosY() - r.getHeight());
        r.setFill(new ImagePattern(ico));
        r.setStroke(Color.BLACK);

        //this.view.addChildren(r);

        //this.controller.addNode(tubo);

        //System.out.println("Diocane sono dentro la view di tube");

    }


    public Rectangle getTube(){
        return this.r;
    }

}
