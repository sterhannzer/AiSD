import java.io.*;
 
import java.util.Random;
// Nazwisko_Imie_ListaX_Z1_Z2_Z3
class Zad1 {
   
    Random generator = new Random();
    int[][] tablica;
    int kolumny;
    int wiersze;
           
   
    Zad1(int kolumny, int wiersze){
        this.kolumny = kolumny;
        this.wiersze = wiersze;
               
        int[][] tablica1 = new int[kolumny][wiersze];
        tablica = tablica1;
    }
    public void Generuj(){
        for(int i = 0; i < tablica.length; i++){
            for(int j = 0; j < tablica[i].length; j++){
                tablica[i][j] = generator.nextInt();
            }
        }
    }
    public void Zapisz() throws IOException{
        try {
            FileWriter plik = new FileWriter("plik.txt");
            BufferedWriter wyjscie = new BufferedWriter(plik);
           
            wyjscie.write("MACIERZ");
            wyjscie.newLine();
            wyjscie.write("Liczba kolumn " + String.valueOf(kolumny));
            wyjscie.newLine();
            wyjscie.write("Liczba wierszy " + String.valueOf(wiersze));
           
           
            for(int i = 0; i < tablica.length; i++){
                wyjscie.newLine();
                for(int j = 0; j < tablica[i].length; j++){
                   
                    wyjscie.write(String.valueOf(tablica[i][j]) + "   ");
                   
                }
           
            }
            wyjscie.close();
           
        }
        catch (IOException e){
                System.err.println("Error: " + e.getMessage());
        }
  }
   
   
  public void Odczytaj() throws IOException{
      FileReader odczyt_plik = null;
      String linia;
     
      try {
          odczyt_plik = new FileReader("plik.txt");
      }
      catch (FileNotFoundException e) {
            System.out.println("BLAD PRZY OTWIERANIU PLIKU!");
            System.exit(1);
        }
     
      BufferedReader odczyt = new BufferedReader(odczyt_plik);
     
      try {
            while((linia = odczyt.readLine()) != null){
                    System.out.println(linia);
            }
      }
      catch (IOException e) {
        System.out.println("BLAD ODCZYTU Z PLIKU!");
        System.exit(2);
        }
      odczyt_plik.close();
   
    }
}
