
public class Urzednik {
    private int czasPodjeciaKlienta;
    private int czasZwolnieniaKlienta;
    private boolean wolny;
    private char Nazwa;

    public Urzednik (int numer){
        this.wolny = true;
        this.Nazwa = "ABCDEFGHIJKLMNOPRSTUW".charAt(numer-1);
    }

    public boolean podejmijKlienta(Kolejka<Klient> kolejka, int czas){
       if (this.wolny){
           this.wolny = false;
           this.czasPodjeciaKlienta = czas;
           try {
               this.czasZwolnieniaKlienta = this.czasPodjeciaKlienta + kolejka.pobierzZKolejki().getCzasSprawy();
           }
           catch (ExceptionPustaKolejka e){
               System.out.println("To sie nie powinno zdarzyć");
           }
           return true;
       }
       else{
           return false;
       }
    }

    public void aktualizacja(int czas){
        if (!wolny){
            if (czas == czasZwolnieniaKlienta){
                wolny = true;
            }
        }
    }

    @Override
    public String toString(){
        if (!this.wolny) {
            return String.format("Urzednik %s aktualnie przyjmuje Klienta skonczy o : %d ", this.Nazwa, this.czasZwolnieniaKlienta);
        }
        else{
            return String.format("Urzednik %s jest wolny", this.Nazwa);
        }
    }
}
