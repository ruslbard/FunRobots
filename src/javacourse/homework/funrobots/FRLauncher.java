package javacourse.homework.funrobots;

/**
 * Created by ruslbard on 16.09.2016.
 */
public class FRLauncher {

    private static final TheMasterOfFunRobots master;

    static{
        master = new TheMasterOfFunRobots();
    }

    public static void main(String[] args){

        master.autorule();


    }


}
