/**
 * Created by Łukasz on 2014-05-19.
 */
import  java.io.*;
public class Main {

    public static void main(String[] args) {

        //Test do zad 3
    /*{
        Stos stos = new Stos();
        for (int i = 0; i < 14; i++){
            stos.dodajDoStosu("i");
            stos.wypiszWielkoscStosu();
        }
        for (int i = 0; i < 14; i++){
            try{
                stos.pobierzZeStosu();
                stos.wypiszWielkoscStosu();
            }
            catch (PustyStosWyjatek e){
                System.out.println(e);
            }
        }
    }*/

        //zad 4
        Stos stos = new Stos();
        while (true) {
            System.out.println("Podaj napis do odwrócenia (Puste konczy program)");
            String napis = new String();
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                napis = br.readLine();
                System.out.println(napis);
            }
            catch (IOException e){
                e.printStackTrace();
            }
                if (napis.isEmpty()) {break;}
            for (String litera : napis.split("")) {
                stos.dodajDoStosu(litera);
            }
            String napisDoWypisania = "";
            while (true){
                try{

                    napisDoWypisania += stos.pobierzZeStosu();
                }
                catch (PustyStosWyjatek e){
                    break;
                }
            }
            System.out.println(napisDoWypisania);
        }

    }
}