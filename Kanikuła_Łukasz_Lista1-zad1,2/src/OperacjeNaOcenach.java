
public class OperacjeNaOcenach {
	double liczbaOsob;
    double sumaOcenPoz;
    
    public double LiczSrednia(Object[] s){
    	
    
	    for (int j = 0; j < s.length; j++ ){
	    	if (((Student) s[j]).wyswietlOcene() > 2 ){
	    		liczbaOsob += 1;
	    		sumaOcenPoz += ((Student) s[j]).wyswietlOcene();
	    	}
	    }
	    System.out.println("�rednia ocen os�b kt�re maj� pozytywne oceny:");
	    return sumaOcenPoz/liczbaOsob;
    }
    
    public void nieZaliczyli(Object[] tablica){
    	IteratorTablicowy itab = new IteratorTablicowy(tablica);
    	System.out.printf("%s %s  %s z�\n","nrIndeksu","Ocena","stypendium");
    	for(itab.first(); !itab.isDone(); itab.next()){
    		Student st = (Student) itab.current();
    		if(((Student) st).wyswietlOcene() <= 2){
    			((Student) st).wyswietlDane();
    		}
    	}	
    }



}
