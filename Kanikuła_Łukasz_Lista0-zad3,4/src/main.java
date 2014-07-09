import java.io.FileNotFoundException;
import java.io.*;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        //ZAD3
        Pomiar pomiar1 = new Pomiar(7.0, 2013,10,26,10,00);
        Pomiar pomiar2 = new Pomiar(15.0, 2013,10,27,20,00);
        Pomiar pomiar3 = new Pomiar(20.0, 2013,10,28,20,00);
        Pomiar pomiar4 = new Pomiar(40.0, 2013,10,24,10,00);
        Pomiar pomiar5 = new Pomiar(40.0, 2013,9,26,20,00);


        OblugaPomiaru obsluga = new OblugaPomiaru();
        obsluga.zapisDoPliku(pomiar2);
        obsluga.zapisChronologiczny(pomiar1);
        obsluga.zapisChronologiczny(pomiar5);

        System.out.println(obsluga.OdczytDoListy());

        //ZAD4

        CiagPomiarow ciag = new CiagPomiarow(4);
        ciag.dodawaniePomiaru(pomiar1);
        ciag.dodawaniePomiaru(pomiar2);
        ciag.dodawaniePomiaru(pomiar3);

        ciag.serializacja("pomiar1");
        CiagPomiarow temp = ciag.deserializacja("pomiar1");
        System.out.println(temp);

    }
}