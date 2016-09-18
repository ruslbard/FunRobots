package javacourse.homework.funrobots.ether;

/**
 * Created by ruslbard on 18.09.2016.
 */
public class FREther {

    public static final int SENDMESSAGE_ERROR = -1;
    public static final int SENDMESSAGE_OK = 0;

    private static final String messageDelimiter = ": ";
    private static final String senderStartWith = "[";
    private static final String senderEndWith = "]";

    public static int sendToFREther(Object sender, String message){

        String completeMessage;

        if (sender == null){
            return SENDMESSAGE_ERROR;
        }
        else{
            completeMessage = senderStartWith + sender.getClass().getSimpleName() + senderEndWith + messageDelimiter + message;
        }

        System.out.println(completeMessage);

        return SENDMESSAGE_OK;
    }
}
