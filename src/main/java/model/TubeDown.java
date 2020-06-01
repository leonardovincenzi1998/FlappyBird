package model;

public class TubeDown extends AbstractTube{
    public TubeDown(String tubeImagePath) {
        super(tubeImagePath);
    }

    @Override
    public TubeDown copy() {

        return new TubeDown(this.getTubeImagePath());
    }

    public void setY(double y){
        setPosY(y+105);

    }

}
