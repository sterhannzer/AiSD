/**
 * Created by Łukasz on 2014-05-19.
 */
public class ListaPojWiaz {
    private Elem pierwszy;
    private Elem ostatni;

    public ListaPojWiaz(){
       this.pierwszy = null;
       this.ostatni = null;
    }

    public void dodajNaPocz(int wartosc){
        Elem nowyElement = new Elem(wartosc);
        if(this.pierwszy == null){
            this.pierwszy = nowyElement;
            this.ostatni = nowyElement;
        }
        else{
            nowyElement.setNastepnyElem(pierwszy);
            this.pierwszy = nowyElement;
        }

    }
    public int usuwanieZPoczatek() throws ListaPustaWyjatek{
        if(pierwszy == null){
            throw new ListaPustaWyjatek();
        }
        else {
            Elem element = pierwszy;
            pierwszy = pierwszy.getNastepnyElem();
            return element.getWartosc();
        }
    }
}
