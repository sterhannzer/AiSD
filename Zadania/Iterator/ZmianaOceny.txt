
public class ZmianaOceny {
	
	
	public void zmiana(Object[] tablica, int nrStudenta, int nowaOcena){
		IteratorTablicowy itab = new IteratorTablicowy(tablica);
	    for (itab.first(); !itab.isDone(); itab.next()){
	    	Student st = (Student) itab.current();
	    	if (((Student) st).wyswietlNumer() == nrStudenta ){
	    		((Student) st).zmienOcene(nowaOcena);
	    		break;
	    	}	
	    		
	    		
	    	
	    }
	}
}
