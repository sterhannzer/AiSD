import java.awt.*;
/**
 * Created by Łukasz on 2014-05-13.
 */
public class Lista<T> {
    private Elem<T> pierwszy;
    private Elem<T> ostatni;

    public Lista() {
        this.pierwszy = null;
        this.ostatni = null;
    }

    public void dodawanieElem(T wartosc){
        Elem<T> temp = new Elem<T>(wartosc);
        if (pierwszy == null){
            pierwszy = temp;
            ostatni = temp;
        }
        else{
            ostatni.setNastElem(temp);
            temp.setPoprzedniElem(ostatni);
            ostatni = temp;
        }
    }

    public void dodawanieListyPoIndeksie( Lista<T> listaDodawana, int nrElem){
            try {
                if(nrElem == 1){
                    listaDodawana.getOstatni().setNastElem(pierwszy);
                    pierwszy.setPoprzedniElem(listaDodawana.getOstatni());
                    pierwszy = listaDodawana.getPierwszy();
                   
                }
                else{
                    Elem<T> element = zwrocElem(nrElem);
                    listaDodawana.getPierwszy().setPoprzedniElem(element.getPoprzedniElem());
                    element.getPoprzedniElem().setNastElem(listaDodawana.getPierwszy());
                    element.setPoprzedniElem(listaDodawana.getOstatni());
                    element.getPoprzedniElem().setNastElem(element);
                }
            }
            catch (MojException dupa){
                System.out.print(dupa.getMessage());
            }
    }

    public void dodawanieListyPoWartosci ( Lista<T> listaDodawana, T wartosc){
        try {
            dodawanieListyPoIndeksie(listaDodawana, zamianaNaIndeks(wartosc));
        }
        catch (MojException wyjatek) {
            System.out.print("Ta lista nie posiada takiej wartosci");
        }
    }

    public void dodawanieListyNaKoncu (Lista<T> listaDodawana){
        ostatni.setNastElem(listaDodawana.getPierwszy());
        listaDodawana.getPierwszy().setPoprzedniElem(ostatni);
        ostatni = listaDodawana.getOstatni();
    }


    private int zamianaNaIndeks(T wartosc) throws MojException{
        Elem<T> aktualnyElem = pierwszy;
        int licznik = 1;
        while(true) {
            if (wartosc.equals(aktualnyElem.getWartosc())) {
                return licznik;
            }
            if (aktualnyElem.getNastElem() == null) {
                throw new MojException();
            }
            aktualnyElem = aktualnyElem.getNastElem();
            licznik += 1;
        }
    }

    private Elem<T> zwrocElem(int nrElem) throws MojException{
        int licznikElementow = 1;
        Elem<T> aktualnyElem = pierwszy;
        while(true){
            if(nrElem == licznikElementow){
                return aktualnyElem;
            }
            if (aktualnyElem == null){
                throw new MojException();
            }
            aktualnyElem = aktualnyElem.getNastElem();
            licznikElementow += 1;
        }
    }

    @Override
    public String toString(){
        String temp = new String();
        Elem<T> aktualny= pierwszy;

        while(true){
            temp = temp + " " + aktualny.getWartosc().toString();
            if (aktualny.getNastElem() == null){
                return temp;
            }
            aktualny = aktualny.getNastElem();
        }
    }

    public void pokazOstatniIPierwszy(){
        System.out.print(pierwszy.getWartosc());
        System.out.print(ostatni.getWartosc());
    }

    public Elem<T> getOstatni() {
        return ostatni;
    }

    public Elem<T> getPierwszy(){
        return pierwszy;
    }

    public void zadanie3(Lista<T> listaDodawana){
        Elem<T> pierwszyListy1 = pierwszy;
        Elem<T> pierwszyListy2 = listaDodawana.getPierwszy();
        Elem<T> aktualny;
        if (pierwszyListy1.compareTo(pierwszyListy2) < 0) {
            pierwszy = pierwszyListy1;
            aktualny = pierwszyListy1;
            pierwszyListy1 = pierwszyListy1.getNastElem();
        }
        else{
            pierwszy = pierwszyListy2;
            aktualny = pierwszyListy2;
            pierwszyListy2 = pierwszyListy2.getNastElem();
        }
        while (true) {
            if (pierwszyListy1 == null) {
                aktualny.setNastElem(pierwszyListy2);
                return;
            }
            else if (pierwszyListy2 == null) {
                aktualny.setNastElem((pierwszyListy1));
                return;
            }
            if (pierwszyListy1.compareTo(pierwszyListy2) < 0) {
                aktualny.setNastElem(pierwszyListy1);
                aktualny = pierwszyListy1;
                pierwszyListy1 = pierwszyListy1.getNastElem();
            }
            else {
                aktualny.setNastElem(pierwszyListy2);
                aktualny = pierwszyListy2;
                pierwszyListy2 = pierwszyListy2.getNastElem();
            }
        }
    }
}
