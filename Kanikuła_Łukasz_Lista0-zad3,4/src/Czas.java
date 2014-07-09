import java.io.Serializable;

/**
 * Created by Łukasz on 2014-05-17.
 */
public class Czas implements Serializable, Comparable<Czas> {
    private int rok, miesiac, dzien, godzina, minuta;

    public Czas(int rok, int miesiac, int dzien, int godzina, int minuta) {
        this.rok = rok;
        this.miesiac = miesiac;
        this.dzien = dzien;
        this.godzina = godzina;
        this.minuta = minuta;
    }

    public int getRok() {
        return rok;
    }

    public int getMiesiac() {
        return miesiac;
    }

    public int getDzien() {
        return dzien;
    }

    public int getGodzina() {
        return godzina;
    }

    public int getMinuta() {
        return minuta;
    }
    @Override
    public String toString(){
        return String.format("%d-%d-%d %d:%d", rok, miesiac, dzien, godzina, minuta);

    }

    public int compareTo(Czas obiektCzasu){
        if(this.rok > obiektCzasu.getRok()) {
            return 1;
        }
        else if(this.rok == obiektCzasu.getRok()){
            if (this.miesiac > obiektCzasu.getMiesiac()) {
                return 1;
            }
            else if(this.miesiac == obiektCzasu.getMiesiac()) {
                if(this.dzien > obiektCzasu.getDzien()) {
                    return 1;
                }
                else if(this.dzien == obiektCzasu.getDzien()) {
                    if (this.godzina > obiektCzasu.getGodzina()) {
                        return 1;
                    }
                    else if(this.godzina == obiektCzasu.getGodzina()){
                        if (this.minuta > obiektCzasu.getMinuta()) {
                            return 1;
                        }
                        else if(this.minuta == obiektCzasu.getMinuta()){
                            return 0;
                        }
                    }
                }
            }
        }
        return -1;

    }

}
