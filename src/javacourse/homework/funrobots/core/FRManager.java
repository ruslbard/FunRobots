package javacourse.homework.funrobots.core;

/**
 * Created by ruslbard on 16.09.2016.
 */
public class FRManager {



    private static int CountOfCallsToProvideNewFRobot;

    public static int getCountOfCallsToProvideNewFRobot() {

        return CountOfCallsToProvideNewFRobot;
    }


    public static FRobots provideNewFRobot(byte newFRobotType){

        FRobots newFRobot = null;

        if (newFRobotType == FRobots.FROBOT_TYPE_FLYER){

            newFRobot = new FRFlyer();
            newFRobot.replaceFRobot(0, 0);

        }

        if (newFRobotType == FRobots.FROBOT_TYPE_WALKER){
            newFRobot = new FRWalker();
            newFRobot.replaceFRobot(1, 1);

        }

        CountOfCallsToProvideNewFRobot++;
        return newFRobot;
    }

    public static int replaceFRobot(int newXCoordinate, int newYCoordinate, FRobots funrobotForReplace){

        if (funrobotForReplace == null){
            return -1;
        }
        else{
            int a = funrobotForReplace.typeOfFRobot; //Не понял почему я могу получить отсюда доступ к protected свойству класса

            if (funrobotForReplace instanceof FRWalker){
                ((FRWalker) funrobotForReplace).startStepEngine();
                funrobotForReplace.replaceFRobot(newXCoordinate, newYCoordinate);
            }
            else if (funrobotForReplace instanceof FRFlyer){

                ((FRFlyer) funrobotForReplace).startFlyEngine();
                funrobotForReplace.replaceFRobot(newXCoordinate, newYCoordinate);
            }
        }

        return 0;
    }

}
