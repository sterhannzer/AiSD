import java.io.*;

/**
 * Created by Łukasz on 2014-05-19.
 */
public class CiagPomiarow implements Serializable {


    private Pomiar[] pomiary;
    private int ostatniElem;

    public CiagPomiarow(int rozmiar){
        pomiary = new Pomiar[rozmiar];
        this.ostatniElem= 0;


    }

    public Pomiar[] zwrocTab(){
        return this.pomiary;
    }

    public boolean dodawaniePomiaru(Pomiar pomiar){
        if(pomiary.length == ostatniElem+1){
            return false;
        }
        pomiary[ostatniElem] = pomiar;
        ostatniElem += 1;
        return true;

    }

    public boolean serializacja(String nazwaPliku){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(nazwaPliku + ".ser");
            oos = new ObjectOutputStream(fos);

            oos.writeObject(this);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
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
        return true;
    }
    public CiagPomiarow deserializacja(String nazwaPliku){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        CiagPomiarow temp = null;

        try {
            fis = new FileInputStream(nazwaPliku + ".ser");
            ois = new ObjectInputStream(fis);

            temp = (CiagPomiarow) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) ois.close();
            } catch (IOException e) {}
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {}
        }

        return temp;


    }

    @Override
    public String toString(){
        String temp = new String();
        for(int i=0; i<ostatniElem; i++){
            temp = temp + pomiary[i] + "   ";
        }
        return (temp);

    }



}
