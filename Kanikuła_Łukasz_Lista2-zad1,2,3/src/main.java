/**
 * Created by Łukasz on 2014-05-13.
 */
public class main {
    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<Integer>();
        Lista<Integer> lista2 = new Lista<Integer>();
        Lista<Integer> lista3 = new Lista<Integer>();
        Lista<Integer> lista4= new Lista<Integer>();
        Lista<Integer> lista5 = new Lista<Integer>();
        Lista<Integer> lista6= new Lista<Integer>();


        lista.dodawanieElem(5);
        lista.dodawanieElem(7);
        lista.dodawanieElem(8);
        lista.dodawanieElem(9);

        lista2.dodawanieElem(4);
        lista2.dodawanieElem(6);
        lista2.dodawanieElem(10);
        lista2.dodawanieElem(11);

        lista.dodawanieListyPoIndeksie(lista2, 2);
        System.out.println(lista);




        lista3.dodawanieElem(5);
        lista3.dodawanieElem(7);
        lista3.dodawanieElem(8);
        lista3.dodawanieElem(9);

        lista4.dodawanieElem(4);
        lista4.dodawanieElem(6);
        lista4.dodawanieElem(10);
        lista4.dodawanieElem(11);

        lista3.dodawanieListyPoWartosci(lista4, 8);
        System.out.println(lista);




        lista5.dodawanieElem(5);
        lista5.dodawanieElem(7);
        lista5.dodawanieElem(8);
        lista5.dodawanieElem(9);

        lista6.dodawanieElem(4);
        lista6.dodawanieElem(6);
        lista6.dodawanieElem(10);
        lista6.dodawanieElem(11);

        lista5.zadanie3( lista6);
        System.out.println(lista5);

    }
}