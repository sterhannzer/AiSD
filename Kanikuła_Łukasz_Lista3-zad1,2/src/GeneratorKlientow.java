import java.util.Random;


public class GeneratorKlientow {

    private static Random generator = new Random();

    public GeneratorKlientow(){};

    public boolean generowanieKlientow(Kolejka<Klient> kolejka){
        int temp =  generator.nextInt(10);
        if (temp % 5 == 0){
            try {
                kolejka.dodajDoKolejki(new Klient());
            }
            catch (ExceptionPelnaKolejka e){
                return false;
            }

        }
        return true;
    }

}
