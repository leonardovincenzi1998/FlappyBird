package model;

public class TubeUp extends AbstractTube{
    public TubeUp(String tubeImagePath) {
        super(tubeImagePath);
    }


    @Override
    public TubeUp copy() {

        return new TubeUp(this.getTubeImagePath());
    }

    public void setY(){
        setPosY(getHeight());
    }
}
