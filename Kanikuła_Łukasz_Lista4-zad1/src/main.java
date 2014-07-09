/**
 * Created by Łukasz on 2014-05-19.
 */
public class main {
    public static void main(String[] args){
        Stos stos = new Stos(5);

        try {
            stos.dodajNaStos(5);
            stos.dodajNaStos(5);
            stos.dodajNaStos(5);
            stos.dodajNaStos(5);
            stos.dodajNaStos(5);
            stos.dodajNaStos(5);
        }
        catch (StosPelny e){
            System.out.println("Stos jest pełny");
        }
        try {
            System.out.print(stos.pobierzZeStosu());
        }
        catch(PustyStos e){
            System.out.println("Stos jest pusty");
        }

    }
}
