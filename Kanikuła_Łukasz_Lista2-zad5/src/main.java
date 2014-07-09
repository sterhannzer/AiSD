import java.io.*;

/**
 * Created by Łukasz on 2014-05-14.
 */
public class main {
    public static void main(String[] args) {

        Lista<Integer> lista = new Lista<Integer>();

        lista.tworzenieListy(41);
        lista.usuwanieCoKtorys(3);
        lista.zapiszDoPliku();
        System.out.println(lista.odczytZPliku());

    }


}
