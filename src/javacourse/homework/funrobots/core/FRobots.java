package javacourse.homework.funrobots.core;

import javacourse.homework.funrobots.ether.FREther;

/**
 * Created by ruslbard on 16.09.2016.
 */
public class FRobots {

    public static final byte FROBOT_TYPE_WALKER = 0;
    public static final byte FROBOT_TYPE_FLYER = 1;

    protected byte typeOfFRobot;

    protected int currentXCoordinate;
    protected int currentYCoordinate;

    protected String tellCurrentCoordinates(){

        return "I have a new coordinates X: [" + String.valueOf(currentXCoordinate) + "], Y: [" + String.valueOf(currentYCoordinate) + "]";
    }

    public void replaceFRobot(int newXCoordinate, int newYCoordinate){

        FREther.sendToFREther(this, "I can't moving with parent class method. You must override it.");
    }

}
