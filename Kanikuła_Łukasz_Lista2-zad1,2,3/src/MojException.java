import org.omg.CORBA.SystemException;

/**
 * Created by Łukasz on 2014-05-14.
 */
public class MojException extends Exception {
    public MojException(){

    }
    @Override
    public String getMessage(){
        return String.format("Ta lista nie posiada tylu elementów");
    }
}
