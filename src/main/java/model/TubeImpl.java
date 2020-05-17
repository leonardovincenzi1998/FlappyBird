package model;

public class TubeImpl implements Tube{

    private final static double INITIAL_POSX = 600;
    private final static double INITIAL_POSY = 0;
    private final static double WIDTH = 55;
    //private static final int SCENE_WIDTH = 600;
    //private static final int SCENE_HEIGHT = 335;
    private double PosX;
    private double PosY;
    //private double screenHeight;
    private double tubeHeight;
    private final String tubeImagePath;


    public TubeImpl(/*double height*/) {
        this.PosX = INITIAL_POSX;
        this.PosY = INITIAL_POSY;
        //this.screenHeight = height;
        tubeImagePath = ("tube.png");
        //System.out.println("Costruttore tubo ok");
        //System.out.println(getHeight());
    }

    @Override
    public double getPosX() {
        return this.PosX;
    }

    @Override
    public double getPosY() {
        return this.PosY;
    }

    @Override
    public double getWidth() {
        return WIDTH;
    }

    @Override
    public double getHeight() {
        return randomHeight();
    }

    @Override
    public double randomHeight() {
        return (tubeHeight = 50 + (Math.random() * 141));
    }
    @Override
    public String getTubeImagePath(){
        return tubeImagePath;
    }


}
