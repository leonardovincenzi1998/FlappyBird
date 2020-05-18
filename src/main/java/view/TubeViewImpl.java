package view;

import controllers.FlappyBirdController;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import model.Tube;



public class TubeViewImpl {

    //FlappyBirdView view;
    Rectangle r = new Rectangle();
    Image ico;
    public FlappyBirdController controller;
    //StackPane imageContainer = new StackPane();
    //ImageView image = new ImageView(new Image(ClassLoader.getSystemResource("tube.png").toString()));
    //final ImageView tubo = new ImageView(new Image(ClassLoader.getSystemResource("tube.png").toString()));


    public TubeViewImpl(final Tube tube, FlappyBirdController controller){
        this.controller = controller;
        this.ico = new Image(tube.getTubeImagePath());
        r.setX(tube.getPosX());
        r.setY(tube.getPosY());
        r.setWidth(tube.getWidth());
        r.setHeight(tube.getHeight());
        r.setFill(new ImagePattern(ico));
        //imageContainer.getChildren().addAll(r);
        //this.controller.addNode(imageContainer);
        //r.setFill(new ImagePattern(ico));
        //this.view = view;
        //view.addChildren(r);

        System.out.println(r);
        //this.view.addChildren(r);

        //this.controller.addNode(tubo);

        System.out.println("Diocane sono dentro la view di tube");


    }

}
