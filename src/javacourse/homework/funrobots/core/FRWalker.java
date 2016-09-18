package javacourse.homework.funrobots.core;

import javacourse.homework.funrobots.ether.FREther;

/**
 * Created by ruslbard on 16.09.2016.
 */
public class FRWalker extends FRobots {

    private static final int legsMaxCount = 2;

    private int legsOfFRobot[];
    private int stepEngine;

    private int getLegsCount(){

        int legsCount = 0;

        for (int i = 0; i < legsOfFRobot.length; i++) {
            if (legsOfFRobot[i] == 1){
                legsCount++;
            }
        }
        return legsCount;
    }


    public FRWalker(){


        FREther.sendToFREther(this, "Construct FRobot with walking options starting...");
        this.typeOfFRobot = FRobots.FROBOT_TYPE_WALKER;

        FREther.sendToFREther(this, "Adding [" + String.valueOf(this.legsMaxCount) + "] legs...");

        this.legsOfFRobot = new int[this.legsMaxCount];
        for (int i = 0; i < this.legsOfFRobot.length; i++) {
            this.legsOfFRobot[i] = 1;
            FREther.sendToFREther(this, String.valueOf(this.getLegsCount()) + " leg done.");
        }

        FREther.sendToFREther(this, "Adding step-engine...");
        stepEngine = 1;
        FREther.sendToFREther(this, "Done.");


        FREther.sendToFREther(this, "Viva, My Master! I was created and ready to walk for You!");
    }

    public void startStepEngine(){

        this.stepEngine = 2;
        FREther.sendToFREther(this, "My step engine is started. Ready to move.");
    }
    @Override
    public void replaceFRobot (int newXCoordinate, int newYCoordinate){

        FREther.sendToFREther(this, "Obey, my Lord! Have to move a new coordinates...");
        FREther.sendToFREther(this, "But I'm only walker...");


        for (int deltaX = this.currentXCoordinate; deltaX <= newXCoordinate; deltaX++) {
            for (int legs = 0; legs < legsOfFRobot.length; legs++) {

                FREther.sendToFREther(this, "Step [" + String.valueOf(legs + 1) + "] leg to X: [" + String.valueOf(deltaX) + "]");
            }
            this.currentXCoordinate = deltaX;
        }
        for (int deltaY = this.currentYCoordinate; deltaY <= newYCoordinate; deltaY++) {
            for (int legs = 0; legs < legsOfFRobot.length; legs++) {

                FREther.sendToFREther(this, "Step [" + String.valueOf(legs + 1) + "] leg to Y: [" + String.valueOf(deltaY) + "]");
            }
            this.currentYCoordinate = deltaY;
        }
        FREther.sendToFREther(this, tellCurrentCoordinates());
    }

}
