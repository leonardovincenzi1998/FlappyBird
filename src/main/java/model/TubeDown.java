package model;

public class TubeDown extends AbstractTube{
    public TubeDown(String tubeImagePath) {
        super(tubeImagePath);
    }

    @Override
    public TubeDown copy() {

        return new TubeDown(this.getTubeImagePath());
    }

    public void setY(){
        setPosY(335 - getHeight());

    }

    public void getDownHeight(double upHeight){
         setHeight(335-upHeight-100);
    }
}
