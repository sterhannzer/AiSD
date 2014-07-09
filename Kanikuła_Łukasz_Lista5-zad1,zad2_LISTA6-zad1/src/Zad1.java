import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Łukasz on 2014-05-28.
 */
public class Zad1 {
    public void test(){

        Random generator = new Random();
        Sortowanie s = new Sortowanie();
        Sortowanie s2 = new Sortowanie();
        Sortowanie s3 = new Sortowanie();
        Lista generatorList = new Lista();

        ArrayList<Integer> listaLosowa = generatorList.generowanieLosowej(10);
        ArrayList<Integer> listaMalejaca = generatorList.generowanieMalejacej(10);
        ArrayList<Integer> listaRosnaca = generatorList.generowanieRosnacej(10);

        System.out.println("Lista losowa"+ listaLosowa);
        System.out.println("Lista malejąca"+ listaMalejaca);
        System.out.println("Lista rosnąca"+ listaRosnaca);

        System.out.println();
        System.out.println("                              Przypadek losowy      Przypadek optymistyczny     Przypadek pesymistyczny");
        System.out.print("Bubble sort :          ");
        s.boobleSort(listaLosowa);
        s.boobleSort(listaRosnaca);
        s.boobleSort(listaMalejaca);
        System.out.println();

        listaLosowa = generatorList.generowanieLosowej(10);
        listaMalejaca = generatorList.generowanieMalejacej(10);
        listaRosnaca = generatorList.generowanieRosnacej(10);


        System.out.print("Select sort :          ");
        s.selectSort(listaLosowa);
        s.selectSort(listaRosnaca);
        s.selectSort(listaMalejaca);
        System.out.println();

        listaLosowa = generatorList.generowanieLosowej(10);
        listaMalejaca = generatorList.generowanieMalejacej(10);
        listaRosnaca = generatorList.generowanieRosnacej(10);

        System.out.print("Insert sort :           ");
        s.insertSort(listaLosowa);
        System.out.print(String.format("       Porówn.%d Przest.%d", s.liczbaPorownan, s.liczbaPrzestawien));
        s2.insertSort(listaRosnaca);
        System.out.print(String.format("       Porówn.%d Przest.%d", s2.liczbaPorownan, s2.liczbaPrzestawien));
        s3.insertSort(listaMalejaca);
        System.out.print(String.format("      Porówn.%d Przest.%d", s3.liczbaPorownan, s3.liczbaPrzestawien));

    }
}
