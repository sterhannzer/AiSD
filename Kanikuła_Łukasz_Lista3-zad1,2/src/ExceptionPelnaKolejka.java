
public class ExceptionPelnaKolejka extends Exception {
    public ExceptionPelnaKolejka(){}

    @Override
    public String getMessage(){
        return "Kolejka Jest Pełna";
    }
}
