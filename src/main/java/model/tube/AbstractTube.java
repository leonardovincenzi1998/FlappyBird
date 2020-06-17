package model.tube;

/**
 * This is the abstract class of the tubes that manage the same methods and variables they share
 * This class was created to implement the Prototype Pattern
 */
public abstract class AbstractTube {

    private final static double HEIGHT = 175;
    private final static double WIDTH = 55;
    private final String tubeImagePath;
    private final static double POS_X = 600;
    private double PosY;

    /**
     * This is the method constructor which initialize the image path of the object
     * @param tubeImagePath Image Path of the tube
     */
    public AbstractTube(String tubeImagePath) {
        this.tubeImagePath = tubeImagePath;
    }

    /**
     * Method created to implement the Prototype Pattern
     * @return a new Object which is only a copy of the first object created
     */
    public abstract AbstractTube copy();

    /**
     *
     * @return the initial coordinateX of the tube
     */
    public double getPosX() {
        return POS_X;
    }

    /**
     *
     * @return the initial coordinateY of the tube
     */
    public double getPosY() {
        return this.PosY;
    }

    /**
     *
     * @return the width of the tube
     */
    public double getWidth() {
        return WIDTH;
    }

    /**
     *
     * @return the height of the tube
     */
    public double getHeight() {
        return HEIGHT;
    }

    /**
     *
     * @return the image path of the tube
     */
    public String getTubeImagePath(){
        return tubeImagePath;
    }

    /**
     * Set the new coordinateY
     * @param y Y coordinate
     */
    public void setPosY(double y){
        PosY = y;
    }




}
