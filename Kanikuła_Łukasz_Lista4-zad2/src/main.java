/**
 * Created by Łukasz on 2014-05-19.
 */
public class main {
    public static void main(String[] args){
        Stos stos = new Stos();

        stos.dodajNaStos(1);
        stos.dodajNaStos(2);
        stos.dodajNaStos(3);
        stos.dodajNaStos(5);

        try {
            System.out.println(stos.pobierzZeStosu());
            System.out.println(stos.pobierzZeStosu());
            System.out.println(stos.pobierzZeStosu());
            System.out.println(stos.pobierzZeStosu());
            System.out.println(stos.pobierzZeStosu());
        }
        catch(StosPustyWyjatek e){
            System.out.println(e.getMessage());
        }
    }
}
