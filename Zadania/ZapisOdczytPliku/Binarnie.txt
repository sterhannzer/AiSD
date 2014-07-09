import java.util.Random;
import java.io.*;


class zad2 {
   
    Random generuj = new Random();
    int[][] tablica;
    int kolumny;
    int wiersze;
           
   
    zad2(int kolumny, int wiersze){
        this.kolumny = kolumny;
        this.wiersze = wiersze;
               
        int[][] tablica1 = new int[kolumny][wiersze];
        tablica = tablica1;
    }
    public void Generuj(){
        for(int i = 0; i < tablica.length; i++){
            for(int j = 0; j < tablica[i].length; j++){
                tablica[i][j] = generuj.nextInt();
            }
        }
    }
    public void ZapisBin(){
       
        try{
        DataOutputStream zapisz = new DataOutputStream(new FileOutputStream("plik.dat"));
        zapisz.writeInt(kolumny);
        zapisz.writeInt(wiersze);
       
         for(int i = 0; i < tablica.length; i++){
                for(int j = 0; j < tablica[i].length; j++){
                   
                    zapisz.writeDouble(tablica[i][j]);
                   
                }
            }
            zapisz.close();
       
        }
         catch (IOException e){
                System.err.println("Error: " + e.getMessage());
        }
    }
   
    public void OdczytBin() throws FileNotFoundException, IOException{
       
        DataInputStream wejscie = new DataInputStream(new FileInputStream("plik.dat"));
        int licznik_wiersze = 0;
       
        try {
            System.out.println("Kolumny: " + wejscie.readInt());
            System.out.println("Wiersze: " + wejscie.readInt());
        while (true){
           
            if(licznik_wiersze == wiersze){
                System.out.println();
                licznik_wiersze = 0;
            }
            System.out.print(wejscie.readDouble() + " ");
            licznik_wiersze++;
        }
       
        }
        catch (EOFException ignored) {
            System.out.println();
            wejscie.close();
        }
            wejscie.close();
    }
   
   
}
 
    
