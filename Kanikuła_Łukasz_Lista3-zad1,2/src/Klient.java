import java.util.Random;


public class Klient {
    private int czasSprawy;
    private static Random losowanie = new Random() ;


    public Klient(){
        this.czasSprawy = 2 + losowanie.nextInt(18);

    }
    public int getCzasSprawy(){
        return this.czasSprawy;
    }


}
