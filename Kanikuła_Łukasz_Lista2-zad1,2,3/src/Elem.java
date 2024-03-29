/**
 * Created by Łukasz on 2014-05-13.
 */
public class Elem<T> implements Comparable<Elem<T>> {
    private T wartosc;
    private Elem<T> nastElem;
    private Elem<T> poprzedniElem;

    public Elem(T wartosc) {
        this.nastElem = null;
        this.poprzedniElem = null;
        this.wartosc = wartosc;
    }

    public Elem<T> getNastElem() {
        return nastElem;
    }

    public void setNastElem(Elem<T> nastElem) {
        this.nastElem = nastElem;
    }

    public T getWartosc() {
        return wartosc;
    }

    public Elem<T> getPoprzedniElem() {
        return poprzedniElem;
    }

    public void setPoprzedniElem(Elem<T> poprzedniElem) {
        this.poprzedniElem = poprzedniElem;
    }

    @Override
    public int compareTo(Elem<T> o) {
       if (Integer.parseInt(wartosc.toString()) - Integer.parseInt(o.getWartosc().toString()) < 0){
           return -1;
       }
        else{
           return 1;
       }
    }
}