/**
 * Created by Łukasz on 2014-05-14.
 */
public class Lista<Integer> {
    private Elem<Integer> pierwszy;
    private Elem<Integer> ostatni;

    public Lista(){
        this.pierwszy=null;
        this.ostatni=null;
    }

    private void usuwanieElem(Elem<Integer> poprzedni, Elem<Integer> doUsuniecia){
        poprzedni.setNastElem(doUsuniecia.getNastElem());
    }

    public void usuwanieCoKtorys(int coKtoryUsuwa){
        int licznik = 1;
        Elem<Integer> aktualny = pierwszy;
        Elem<Integer> poprzedni = null;
        while(aktualny.getNastElem().getNastElem()!=aktualny){
            if(licznik % coKtoryUsuwa == 0){
                System.out.println(aktualny.getWartosc());
                usuwanieElem(poprzedni, aktualny);


            }
            poprzedni = aktualny;
            aktualny = aktualny.getNastElem();
            licznik += 1;
        }
        System.out.println();
        System.out.println(aktualny.getWartosc());
        System.out.println(aktualny.getNastElem().getWartosc());
    }

    public void tworzenieListy(int iloscElementow){
        for(int i=1; i<=iloscElementow; i++){
            dodawanieElem((Integer) java.lang.Integer.valueOf(i));
        }

    }

    public void dodawanieElem(Integer wartosc){
        Elem<Integer> temp = new Elem<Integer>(wartosc);
        if (pierwszy == null){
            pierwszy = temp;
            ostatni = temp;
            ostatni.setNastElem(pierwszy);
        }
        else{
            ostatni.setNastElem(temp);
            temp.setNastElem(pierwszy);
            ostatni=temp;
        }
    }

    @Override
    public String toString(){
        String temp = new String();
        Elem<Integer> aktualny= pierwszy;
        Elem<Integer> ostatni = pierwszy;

        while(true){
            temp = temp + " " + aktualny.getWartosc().toString();
            if (aktualny.getNastElem() == ostatni){
                return temp;
            }
            try{
                aktualny = aktualny.getNastElem();
            }
            catch (NullPointerException wyjatek){
                System.out.println("wyjatek");
            }
        }
    }

    public void pokazOstatniIPierwszy() {
        System.out.print(pierwszy.getWartosc());
        System.out.print(ostatni.getWartosc());
    }

}
