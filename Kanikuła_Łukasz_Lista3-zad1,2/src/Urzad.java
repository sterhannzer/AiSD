import java.util.ArrayList;
import java.util.TimerTask;


public class Urzad extends TimerTask{
    private int czas = 0;
    private Kolejka<Klient> kolejka;
    private int liczbaNiebsluzonychKlientow;
    private ArrayList<Urzednik> listaUrzednikow;
    private GeneratorKlientow generatorKlientow;

    public Urzad (int wielkoscKolejki, int iloscUrzednikow){
        this.kolejka = new Kolejka<Klient>(wielkoscKolejki);
        this.liczbaNiebsluzonychKlientow = 0;
        this.listaUrzednikow = new ArrayList<Urzednik>();
        for (int i = 1; i <= iloscUrzednikow; i++){
            this.listaUrzednikow.add(new Urzednik(i));
        }
        this.generatorKlientow = new GeneratorKlientow();
    }

    public void run(){

        System.out.println(String.format("\n\n\nCzas: %d \nLiczba nieobsłużonych klientów: %d \nUrzędnicy:", this.czas, this.liczbaNiebsluzonychKlientow));
        if (!generatorKlientow.generowanieKlientow(kolejka)){
            liczbaNiebsluzonychKlientow += 1;
        }
        for(Urzednik urzednik : listaUrzednikow){
            urzednik.aktualizacja(this.czas);
            if (!kolejka.czyPusta()){
                urzednik.podejmijKlienta(kolejka, czas);
            }
            System.out.println(urzednik);

        }
        this.czas += 1;

    }
}
