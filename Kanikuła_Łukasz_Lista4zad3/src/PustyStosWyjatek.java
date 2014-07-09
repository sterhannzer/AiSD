/**
 * Created by Łukasz on 2014-05-19.
 */
public class PustyStosWyjatek extends  Exception {
    @Override
    public String getMessage(){
        return "Stos jest pusty";
    }
}
