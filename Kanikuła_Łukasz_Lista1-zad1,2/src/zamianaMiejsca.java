
public class zamianaMiejsca  {
	int dlugosc;
	Object zmienna1;
	Object zmienna2;
	Object[] nowaTablica;
	int wolneMiejsce;
	
	
	public void zamiana(Student[] tablica, int elDoZmiany1, int elDoZmiany2){
		zmienna1 = tablica[elDoZmiany1];
		zmienna2 = tablica[elDoZmiany2];
		tablica[elDoZmiany1] = (Student) zmienna2;
		tablica[elDoZmiany2] = (Student) zmienna1;
		nowaTablica=tablica;
		
		
	}
	
	
	public void usuwanieStud(Student[] lista, int nrIndDoUsuniecia){
		IteratorTablicowy itab = new IteratorTablicowy(lista);
		
		for(itab.first(); !itab.isDone(); itab.next()){
			Student st = (Student) itab.current();
			if(st != null){
				if(st.wyswietlNumer() == nrIndDoUsuniecia){
					lista[nrIndDoUsuniecia]= null;
					break;
				}
			}
			if(itab.lastest()){
				System.out.println("Nie ma studenta o indeksie: " + nrIndDoUsuniecia );	
			}
		}
		wyswietlWszystkich(lista);
	}
	
	
	public int wskazStudenta(Student[] lista, int szukanyNrIndeksu){
		IteratorTablicowy itab = new IteratorTablicowy(lista);
		
		for(itab.first(); !itab.isDone(); itab.next()){
			Student st = (Student) itab.current();
			if(st == null){
				//NOTHING
			}
			else{
				if(st.wyswietlNumer() == szukanyNrIndeksu){
					return itab.zwrocBiezacy();
				}		
			}
		}	
		return szukanyNrIndeksu;
	}

	
	public int zwrocWolneMiejsce(Student[] lista){
		IteratorTablicowy itab = new IteratorTablicowy(lista);
		
		wolneMiejsce = -1;
		for(itab.first(); !itab.isDone(); itab.next()){
			Student st = (Student) itab.current();
			if(st== null){
				wolneMiejsce = itab.zwrocBiezacy();
				return wolneMiejsce;	
			}
		}
		return -1;
	}

	
	public void dodajStudenta(Student[] lista, int miejsceDodania, int nrIndeksu, double ocena, double stypendium){
	    if(miejsceDodania == -1){
		    System.out.println("Brakuje wolnych miejsc, przyjdz za rok");
	    }
	    else{
		    lista[miejsceDodania] = new Student(nrIndeksu, stypendium, ocena);    
	    }
	    
	    wyswietlWszystkich(lista);
	}
	
	
	public void wyswietlWszystkich(Object[] lista){
		   IteratorTablicowy itab = new IteratorTablicowy(lista);
		   System.out.printf("%s %s  %s z³\n","nrIndeksu","Ocena","stypendium");
		   for(itab.first(); !itab.isDone(); itab.next()){
		    	Student st = (Student) itab.current();
		    	if (st != null){
		    		st.wyswietlDane();
		    	}
		   }
		   System.out.println("");
		   System.out.println("");
	}
	
	public void sortuj(Student[] lista){
		int i,j=0;
		for(i=0; i<lista.length; i++){
			for(j=1; j<lista.length-1; j++){
				if(lista[j] != null && lista[j-1] != null){
					if(lista[j-1].Ocena > lista[j].Ocena){
						zamiana(lista, j-1,j);
					}
				}
			}
		}
		
	}
}