/**
 * Created by Łukasz on 2014-05-19.
 */
public class Stos {

    private ListaPojWiaz stos;

    public Stos() {
        this.stos = new ListaPojWiaz();
    }

    public int pobierzZeStosu() throws StosPustyWyjatek{
        try {
            return stos.usuwanieZPoczatek();
        }
        catch (ListaPustaWyjatek e){
            throw new StosPustyWyjatek();
        }

    }

    public void dodajNaStos(int nowyElement){
        stos.dodajNaPocz(nowyElement);
    }
}
