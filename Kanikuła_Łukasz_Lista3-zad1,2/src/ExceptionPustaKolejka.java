
public class ExceptionPustaKolejka extends Exception {
    public ExceptionPustaKolejka(){}

    @Override
    public String getMessage(){
        return "Kolejka Jest Pusta";
    }
}
