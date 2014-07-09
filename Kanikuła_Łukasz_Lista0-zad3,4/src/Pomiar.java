import java.awt.*;
import java.io.*;
import java.util.ArrayList;

/**
 * Created by Łukasz on 2014-05-17.
 */
public class Pomiar implements Serializable {
    private double temperatura;
    private Czas czas;

    public Pomiar(double temperatura, int rok, int miesiac, int dzien, int godzina, int minuta) {
        this.temperatura = temperatura;
        this.czas = new Czas(rok, miesiac, dzien, godzina, minuta);
    }



    public double getTemperatura() {
        return temperatura;
    }

    public Czas getCzas() {
        return czas;
    }


    public ArrayList<Integer> argumenty(){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(this.czas.getRok());
        lista.add(this.czas.getMiesiac());
        lista.add(this.czas.getDzien());
        lista.add(this.czas.getGodzina());
        lista.add(this.czas.getMinuta());
        return lista;
    }
    public void zapiszNaKoncu(){
        try {
            DataOutputStream out1 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(".bin", true)));

            ArrayList<Integer> lista = this.argumenty();
            for( Integer value : lista){
                out1.writeInt(value);
            }

            out1.writeUTF(" ");
            out1.close();
        } catch(IOException exc) {
            exc.printStackTrace();
        }
    }
    @Override
    public String toString(){
        return String.format("temperatura %.2f %s", temperatura, czas);
    }
}
