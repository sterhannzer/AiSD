import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read {

 public static void main(String[] args) {
 
   FileReader fr = null;
   String linia = "";

   // OTWIERANIE PLIKU:
   try {
     fr = new FileReader("plik.txt");
   } catch (FileNotFoundException e) {
       System.out.println("BLAD PRZY OTWIERANIU PLIKU!");
       System.exit(1);
   }

   BufferedReader bfr = new BufferedReader(fr);
   // ODCZYT KOLEJNYCH LINII Z PLIKU:
   try {
     while((linia = bfr.readLine()) != null){
        System.out.println(linia);
     }
    } catch (IOException e) {
        System.out.println("BLAD ODCZYTU Z PLIKU!");
        System.exit(2);
   }

   // ZAMYKANIE PLIKU
   try {
     fr.close();
    } catch (IOException e) {
         System.out.println("BLAD PRZY ZAMYKANIU PLIKU!");
         System.exit(3);
        }
    }
}


 