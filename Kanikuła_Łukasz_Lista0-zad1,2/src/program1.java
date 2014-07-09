import java.io.IOException;


public class program1{
    	public static void main(String args[]) throws IOException{
    		
    		Zad1 zad1 = new Zad1(5,5);
    	       
            zad1.Generuj();
           
            zad1.Zapisz();
           
            zad1.Odczytaj();
    	}
    }