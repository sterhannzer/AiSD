/**
 * Created by Łukasz on 2014-05-14.
 */
import java.io.Serializable;

public class Elem<Integer> implements Serializable{
    private Integer wartosc;
    private Elem<Integer> nastElem;

    public Elem(Integer wartosc){
        this.wartosc = wartosc;
        this.nastElem = null;
    }

    public Integer getWartosc() {
        return wartosc;
    }

    public void setWartosc(Integer wartosc) {
        this.wartosc = wartosc;
    }

    public Elem<Integer> getNastElem() {
        return nastElem;
    }

    public void setNastElem(Elem<Integer> nastElem) {
        this.nastElem = nastElem;
    }



}
