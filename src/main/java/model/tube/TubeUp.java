package model.tube;

public class TubeUp extends AbstractTube{
    public TubeUp(String tubeImagePath) {
        super(tubeImagePath);
    }


    @Override
    public TubeUp copy() {

        return new TubeUp(this.getTubeImagePath());
    }

    public void setY(){
        setPosY(Math.random() * (175-60) + 60);
    }
}