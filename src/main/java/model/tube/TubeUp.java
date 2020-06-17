package model.tube;

public class TubeUp extends AbstractTube{

    private final static int MAX = 175; //Max height of the tubes
    private final static int MIN = 60; //Min height of the tubes

    public TubeUp(String tubeImagePath) {
        super(tubeImagePath);
    }


    @Override
    public TubeUp copy() {

        return new TubeUp(this.getTubeImagePath());
    }

    /**
     * Set the random coordinateY of the top tube
     */
    public void setY(){
        setPosY(Math.random() * (MAX-MIN) + MIN);
    }
}
