/**
 * Created by Łukasz on 2014-05-30.
 */
public class Wierzcholek{
    Wierzcholek lewy = null;
    Wierzcholek prawy = null;
    Wierzcholek ojciec = null;

    int wartosc;

    public Wierzcholek(Wierzcholek lewy, Wierzcholek prawy, Wierzcholek ojciec, int wartosc) {
        this.lewy = lewy;
        this.prawy = prawy;
        this.ojciec = ojciec;
        this.wartosc = wartosc;
    }

    public Wierzcholek getOjciec() {
        return ojciec;
    }

    public void setOjciec(Wierzcholek ojciec) {
        this.ojciec = ojciec;
    }

    public Wierzcholek getLewy() {
        return lewy;

    }

    public void setLewy(Wierzcholek lewy) {
        this.lewy = lewy;
    }

    public Wierzcholek getPrawy() {
        return prawy;
    }

    public void setPrawy(Wierzcholek prawy) {
        this.prawy = prawy;
    }


    public int getWartosc() {
        return wartosc;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }

    public boolean remove(int value, Wierzcholek parent) {
        if (value < this.wartosc) {
            if (lewy != null)
                return lewy.remove(value, this);
            else
                return false;
        } else if (value > this.wartosc) {
            if (prawy != null)
                return prawy.remove(value, this);
            else
                return false;
        } else {
            if (lewy != null && prawy != null) {
                this.wartosc = prawy.minValue();
                prawy.remove(this.wartosc, this);
            } else if (parent.lewy == this) {
                parent.lewy = (lewy != null) ? lewy : prawy;
            } else if (parent.prawy == this) {
                parent.prawy = (lewy != null) ? lewy : prawy;
            }
            return true;
        }
    }

    public int minValue() {
        if (lewy == null)
            return getWartosc();
        else
            return lewy.minValue();
    }
}

