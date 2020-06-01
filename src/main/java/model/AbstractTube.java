package model;

public abstract class AbstractTube {

    private double height = 175;
    private double width = 55;
    private final String tubeImagePath;
    private double PosX = 600;
    private double PosY;

    public AbstractTube(String tubeImagePath) {
        this.tubeImagePath = tubeImagePath;
    }


    public abstract AbstractTube copy();


    public double getPosX() {
        return this.PosX;
    }


    public double getPosY() {
        return this.PosY;
    }


    public double getWidth() {
        return width;
    }


    public double getHeight() {
        return height;
    }


    public String getTubeImagePath(){
        return tubeImagePath;
    }

    public void setPosY(double y){
        PosY = y;
    }




}
