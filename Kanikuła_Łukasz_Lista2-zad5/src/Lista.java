/**
 * Created by Łukasz on 2014-05-14.
 */
import java.io.*;

public class Lista<Integer> implements Serializable {
    public Elem<Integer> pierwszy;
    public Elem<Integer> ostatni;

    public Lista(){
        this.pierwszy=null;
        this.ostatni=null;
    }

    private void usuwanieElem(Elem<Integer> poprzedni, Elem<Integer> doUsuniecia){
        if (pierwszy == doUsuniecia){
            pierwszy = doUsuniecia.getNastElem();
        }
        if (ostatni == doUsuniecia){
            ostatni = doUsuniecia.getNastElem();
        }
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
            temp = temp + aktualny.getWartosc().toString() + " ";
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

    public void zapiszDoPliku() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("D:\\test.ser");
            oos = new ObjectOutputStream(fos);

            oos.writeObject(this);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) oos.close();
            } catch (IOException e) {
            }
            try {
                if (fos != null) fos.close();
            } catch (IOException e) {
            }
        }
    }

    public Lista<Integer> odczytZPliku(){
        Lista<Integer> lista = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("D:\\test.ser"); //utworzenie strumienia wejściowego
            ois = new ObjectInputStream(fis); //utworzenie obiektu odczytującego obiekty ze strumienia

            lista = (Lista<Integer>) ois.readObject(); //deserializacja obiektu

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // zasoby zwalniamy w finally
            try {
                if (ois != null) ois.close();
            } catch (IOException e) {}
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {}
        }
        return lista;
    }
}
