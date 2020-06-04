package model;

import javafx.scene.shape.Rectangle;

public class FlappyImpl implements Flappy{

    private static final double HEIGHT = 335  ;
    private double posX;
    private double posY;
    double inc = 1.0;
    private final String flappyImagePath;
    private FlappySetState state= new FlappySetState();


    public FlappyImpl() {
        posX = 50;
        posY = 50;
        flappyImagePath = ("bird.png");
    }

    @Override
    public void flappyUpdate(Rectangle r, double n) {
        r.setY(r.getY()+n);
        System.out.println(r.getY());
    }

    public void getJump(Rectangle r){
        state.setStateJump(r);
    }

    public void getDown(Rectangle r){
        state.setStateDown(r);
    }

    public String getFlappyImagePath() {
        return flappyImagePath;
    }

    @Override
    public int getWidthBird() {
        return 45;
    }

    @Override
    public int getHeightBird() {
        return 32;
    }

    @Override
    public double getPosX() {
        return posX;
    }

    @Override
    public void setPosX(double posX) {
        this.posX = posX;
    }

    @Override
    public double getPosY() {
        return posY;
    }

    @Override
    public void setPosY(double posY) {
        this.posY = posY;
    }


}
