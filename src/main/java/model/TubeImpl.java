package model;

public class TubeImpl implements Tube{

    private final static double INITIAL_POSX = 545;
    private final static double INITIAL_POSY = 335;
    private final static double WIDTH = 55;
    //private static final int SCENE_WIDTH = 600;
    //private static final int SCENE_HEIGHT = 335;
    private double PosX;
    private double PosY;
    //private double screenHeight;
    private double tubeHeight = 50 + (Math.random() * 141);;
    private final String tubeImagePath;


    public TubeImpl(/*double height*/) {
        this.PosX = INITIAL_POSX;
        this.PosY = INITIAL_POSY;
        //this.screenHeight = height;
        tubeImagePath = ("tube.png");
        /*System.out.println("Lunghezza tubo: " + this.getHeight());
        System.out.println("Y tubo: " + this.PosY);*/
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
        return tubeHeight;
    }

    @Override
    public String getTubeImagePath(){
        return tubeImagePath;
    }


}
