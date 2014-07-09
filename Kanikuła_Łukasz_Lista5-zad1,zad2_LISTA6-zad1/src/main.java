import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
/**
 * Created by Łukasz on 2014-05-21.
 */
public class main {
    public static void main(String[] args){

        Zad1 zadanie1 = new Zad1();
        Zad2 zadanie2 = new Zad2();
        zadanie1.test();

        System.out.println();
        System.out.println("------------------------------");
        System.out.println("------------------------------");

        ArrayList<Student> listaStudentow = zadanie2.tworzenieListyStudentow();

        zadanie2.wyswietlListeStudentow(listaStudentow);


        zadanie2.sortowanieBooble(listaStudentow, Student.porownajWiek);  // lub porownajWzrost, porownajIndeks
        zadanie2.sortowanieSelect(listaStudentow, Student.porownajWzrost);
        zadanie2.sortowanieInsert(listaStudentow, Student.porownajIndeks);


        Lista6Zad1 drukowanieWynikowZad1Lista6 = new Lista6Zad1();
        drukowanieWynikowZad1Lista6.zad1();






    }
}
