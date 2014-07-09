import com.sun.xml.internal.messaging.saaj.soap.impl.TreeException;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Łukasz on 2014-05-30.
 */
public class main {
    public static void main(String[] args){

        Drzewo drzewo = new Drzewo();

        drzewo.dodawanieDoDrzewa(5);
        drzewo.dodawanieDoDrzewa(4);
        drzewo.dodawanieDoDrzewa(6);
        drzewo.dodawanieDoDrzewa(2);
        drzewo.dodawanieDoDrzewa(3);
        drzewo.dodawanieDoDrzewa(7);

        WypisywanieDrzewa wypisz = new WypisywanieDrzewa();
        wypisz.drukowanieWierzcholkow(drzewo);




        //drzewo.remove(3);
        //System.out.println(drzewo.getPierwszy().getLewy().getWartosc());
        //drzewo.postOrder(drzewo.getPierwszy());

    }

}

