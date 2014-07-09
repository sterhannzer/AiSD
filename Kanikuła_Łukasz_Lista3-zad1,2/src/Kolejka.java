
public class Kolejka<T>
{
    private T[] buff;
    private int indeksKonca;
    private int indeksPoczatku;
    private int rozmiar;
    private boolean czyPusta;

    public Kolejka(int rozmiar)
    {
        this.rozmiar = rozmiar;
        this.buff = (T[]) new Object[rozmiar];
        this.indeksPoczatku = 0;
        this.indeksKonca = 0;
        this.czyPusta = true;
    }
    public boolean czyPusta(){
        return czyPusta;
    }

    public void dodajDoKolejki(T Elem) throws ExceptionPelnaKolejka
    {
        if (indeksKonca != indeksPoczatku)
        {
            buff[indeksKonca] = Elem;
            indeksKonca = (indeksKonca + 1) % rozmiar;
        }
        else if ((indeksKonca == indeksPoczatku) && czyPusta)
        {
            buff[indeksKonca] = Elem;
            indeksKonca = (indeksKonca + 1) % rozmiar;
            czyPusta = false;
        }
        else
        {
            throw new ExceptionPelnaKolejka();

        }

    }

    public T pobierzZKolejki() throws  ExceptionPustaKolejka
    {

        if (indeksKonca == indeksPoczatku && czyPusta)
        {
            throw new ExceptionPustaKolejka();
        }
        else
        {
            T wartosc = buff[indeksPoczatku];
            indeksPoczatku = (indeksPoczatku+1) % rozmiar;

            if (indeksPoczatku == indeksKonca)
            {
                czyPusta = true;
            }
            return wartosc;
        }

    }

// FIFO na górze LIFO na dole  trzeba odkomentować

/*

    public T pobierzZKolejki() throws  ExceptionPustaKolejka
    {

        if (indeksKonca == indeksPoczatku && czyPusta)
        {
            throw new ExceptionPustaKolejka();
        }
        else
        {
            T wartosc;
            if (indeksKonca == indeksPoczatku && !czyPusta){
                wartosc = buff[rozmiar - 1];
                indeksKonca = rozmiar - 1;
            }
            else {
                wartosc = buff[indeksKonca];
                indeksKonca = indeksKonca - 1;
            }
            if (indeksPoczatku == indeksKonca)
            {
                czyPusta = true;
            }
            return wartosc;
        }

    }
*/


}
