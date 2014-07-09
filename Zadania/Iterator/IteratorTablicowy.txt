
public class IteratorTablicowy implements Iterator {
	final Object [] tablica;
    final int pierwszy;
    final int ostatni;
    int biezacy=-1;
   
    
    public IteratorTablicowy(Object[] tab, int odElem, int liczbaElem){
    	tablica=tab;
    	pierwszy=odElem;
    	ostatni=odElem+liczbaElem-1;
    }
    
    
    public IteratorTablicowy(Object[] tab){
    	tablica = tab;
    	pierwszy = 0;
    	ostatni=tablica.length-1;
    }
    
    
    public void first(){
    	biezacy=pierwszy;
    }
 
    
    public void last(){
    	biezacy=ostatni;
    }

    
    public void next(){
    	++biezacy;
    }

    
    public void previous(){
    	--biezacy;
    }

    
    public boolean isDone(){
    	return biezacy < pierwszy || biezacy > ostatni;
    }

    public boolean isDone2(){
    	return biezacy < pierwszy || biezacy > ostatni-1;
    }
    
    public Object current(){
    	return tablica [ biezacy ];
    }
    
    
    public int zwrocBiezacy(){
    	return biezacy;
    }
    
    
    public boolean lastest(){
    	if(biezacy==ostatni)
    		return true;
    	else 
    		return false;
    }
}
