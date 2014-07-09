import java.io.*;
import java.util.ArrayList;

/**
 * Created by Łukasz on 2014-05-18.
 */
public class OblugaPomiaru {
    public void WypiszWgMiesiaca(int miesiac, int rok) {
        try {
            DataInputStream wejscie = new DataInputStream(new FileInputStream("plik.bin"));

            try {
                while (true) {
                    Pomiar pomiar = new Pomiar(wejscie.readDouble(), wejscie.readInt(), wejscie.readInt(), wejscie.readInt(), wejscie.readInt(), wejscie.readInt());
                    if(pomiar.getCzas().getRok()== rok && pomiar.getCzas().getMiesiac() == miesiac) {
                        System.out.println(pomiar);
                    }
                }
            } catch (EOFException ignored) {
                System.out.println();
                wejscie.close();

            }
            wejscie.close();
        }
        catch (IOException e){}

    }

    public void WypiszDniOcieplenia(int miesiac, int rok) {
        try {
            DataInputStream wejscie = new DataInputStream(new FileInputStream("plik.bin"));

            try {
                Pomiar tempPoprzedniegoDnia = new Pomiar(100, 0,0,0,0,0);
                while (true) {
                    Pomiar pomiar = new Pomiar(wejscie.readDouble(), wejscie.readInt(), wejscie.readInt(), wejscie.readInt(), wejscie.readInt(), wejscie.readInt());
                    if(pomiar.getCzas().getRok()== rok && pomiar.getCzas().getMiesiac() == miesiac) {
                        if(pomiar.getTemperatura()>tempPoprzedniegoDnia.getTemperatura() && pomiar.getCzas().getDzien() != tempPoprzedniegoDnia.getCzas().getDzien()) {
                            System.out.println(pomiar.getCzas().getDzien());
                        }
                    }

                    tempPoprzedniegoDnia = pomiar;
                }
            } catch (EOFException ignored) {
                System.out.println();
                wejscie.close();

            }
            wejscie.close();
        }
        catch (IOException e){}

    }


    public void zapisDoPliku(Pomiar pomiar){
        try{
            DataOutputStream zapisz = new DataOutputStream(new FileOutputStream("plik.bin", true));
            zapisz.writeDouble(pomiar.getTemperatura());

            for(int i:pomiar.argumenty()){
                zapisz.writeInt(i);
            }

            zapisz.close();
        }
        catch (IOException e){
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void zapisChronologiczny(Pomiar pomiar){
        ArrayList<Pomiar> listaPomiarow = this.OdczytDoListy();

        for(int i=0; i<listaPomiarow.size(); i++){
            if(pomiar.getCzas().compareTo(listaPomiarow.get(i).getCzas())==-1){
                listaPomiarow.add(i, pomiar);
                break;
            }
        }
        try{
            DataOutputStream zapisz = new DataOutputStream(new FileOutputStream("plik.bin"));

            for(Pomiar temp:listaPomiarow){
                zapisz.writeDouble(temp.getTemperatura());
                for(Integer temp2:temp.argumenty()){
                    zapisz.writeInt(temp2);
                }
            }
            zapisz.close();
        }
        catch (IOException e){
            System.err.println("Error: " + e.getMessage());
        }
    }

    public ArrayList<Pomiar> OdczytDoListy() {
        ArrayList<Pomiar> listaDanychZPliku = new ArrayList<Pomiar>();

        try {
            DataInputStream wejscie = new DataInputStream(new FileInputStream("plik.bin"));
            try {
                while (true) {
                    Pomiar pomiar = new Pomiar(wejscie.readDouble(), wejscie.readInt(), wejscie.readInt(), wejscie.readInt(), wejscie.readInt(), wejscie.readInt());
                    listaDanychZPliku.add(pomiar);
                }
            } catch (EOFException ignored) {
                System.out.println();
                wejscie.close();
            }
            wejscie.close();
        }
        catch (IOException e){}
        return listaDanychZPliku;
    }




}
