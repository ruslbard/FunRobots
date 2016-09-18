package javacourse.homework.funrobots.core;

import javacourse.homework.funrobots.ether.FREther;

/**
 * Created by ruslbard on 16.09.2016.
 */
public class FRFlyer extends FRobots {

    private static final int wingsMaxCount = 2;
    private static final int landinggearMaxCount = 3;

    private int wingsOfFRobot[];
    private int landinggearsOfFRobot[];
    private int flyEngine;

    private int getWingsCount(){

        int wingsCount = 0;

        for (int i = 0; i < wingsOfFRobot.length; i++) {
            if (wingsOfFRobot[i] == 1){
                wingsCount++;
            }
        }
        return wingsCount;
    }

    private int getLandingGearsCount(){

        int landinggearsCount = 0;

        for (int i = 0; i < landinggearsOfFRobot.length; i++) {
            if (landinggearsOfFRobot[i] == 1){
                landinggearsCount++;
            }
        }
        return landinggearsCount;
    }

    public FRFlyer() {

        FREther.sendToFREther(this, "Construct FRobot with flying options starting...");
        this.typeOfFRobot = FRobots.FROBOT_TYPE_FLYER;

        FREther.sendToFREther(this, "Adding [" + String.valueOf(this.wingsMaxCount) + "] wings...");

        this.wingsOfFRobot = new int[this.wingsMaxCount];
        for (int i = 0; i < this.wingsOfFRobot.length; i++) {
            this.wingsOfFRobot[i] = 1;
            FREther.sendToFREther(this, String.valueOf(this.getWingsCount()) + " wing done.");
        }

        FREther.sendToFREther(this, "Adding [" + String.valueOf(this.landinggearMaxCount) + "] landing gears...");

        this.landinggearsOfFRobot = new int[this.landinggearMaxCount];
        for (int i = 0; i < this.landinggearsOfFRobot.length; i++) {
            this.landinggearsOfFRobot[i] = 1;
            FREther.sendToFREther(this, String.valueOf(this.getLandingGearsCount()) + " landing gear done.");
        }

        FREther.sendToFREther(this, "Adding fly-engine...");
        this.flyEngine = 1;
        FREther.sendToFREther(this, "Done.");


        FREther.sendToFREther(this, "Viva, My Master! I was created and ready to fly for You!");
    }

    public void startFlyEngine(){

        this.flyEngine = 2;
        FREther.sendToFREther(this, "My fly engine is started. Ready to move.");
    }

    @Override
    public void replaceFRobot (int newXCoordinate, int newYCoordinate){

        FREther.sendToFREther(this, "Obey, my Lord! Have to move a new coordinates...");
        FREther.sendToFREther(this, "Yahoooo! I can fly...");

        this.currentXCoordinate = newXCoordinate;
        this.currentYCoordinate = newYCoordinate;

        FREther.sendToFREther(this, tellCurrentCoordinates());
    }
}
