package view;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class FlappyGameViewImpl implements FlappyGameView {

    private final Pane pane;
    private final ImageView background;

    public FlappyGameViewImpl(Pane pane, ImageView background) {
        this.pane = pane;
        this.background = background;
    }

    @Override
    public void start() {
        this.background.fitWidthProperty().bind(this.pane.widthProperty());
        this.background.fitHeightProperty().bind(this.pane.heightProperty());
    }

    /*@Override
    public void setScore () {

    }*/
}

