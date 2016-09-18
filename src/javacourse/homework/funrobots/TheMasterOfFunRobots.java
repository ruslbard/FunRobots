package javacourse.homework.funrobots;

import javacourse.homework.funrobots.core.FRManager;
import javacourse.homework.funrobots.core.FRobots;
import javacourse.homework.funrobots.ether.FREther;

/**
 * Created by ruslbard on 18.09.2016.
 */
public class TheMasterOfFunRobots {

    private FRobots teamrobot1;
    private FRobots teamrobot2;

    TheMasterOfFunRobots(){

        FREther.sendToFREther(this, "Declaring Himself The Master Of FunRobots!");
        FREther.sendToFREther(this, "I'm Great Omnipotent Father And I Will Rule Of FunRobots!");
        FREther.sendToFREther(this, "I Have Same Instruments In Static Context!");
    }

    public void autorule(){

        FREther.sendToFREther(this, "With Method \"provideNewFRobot\" In Static Context I Try To Get A New Walking FunRobot");
        teamrobot1 = FRManager.provideNewFRobot(FRobots.FROBOT_TYPE_WALKER);

        FREther.sendToFREther(this, "With Method \"provideNewFRobot\" In Static Context I Try To Get A New Flying FunRobot");
        teamrobot2 = FRManager.provideNewFRobot(FRobots.FROBOT_TYPE_FLYER);

        FREther.sendToFREther(this, "I Always Can To Know How Many Times I Try To Get Any New FunRobot");
        FREther.sendToFREther(this, "I Use My Funny Instruments In Static Context For That");
        FREther.sendToFREther(this, "For Example At The Moment I Try To Get Any FunRobots [" + String.valueOf(FRManager.getCountOfCallsToProvideNewFRobot()) + "] Times");

        FREther.sendToFREther(this, "And Now I Want To Replace My FunRobots To Other Place");

        FREther.sendToFREther(this, "I Want To Walker Move To 3, 5");
        FRManager.replaceFRobot(3, 5, teamrobot1);

        FREther.sendToFREther(this, "I Want To Flyer Move To 2, 7");
        FRManager.replaceFRobot(2, 7, teamrobot2);
    }
}
