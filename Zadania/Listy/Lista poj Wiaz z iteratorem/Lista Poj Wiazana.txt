public class ListaPojWiazana<T> {
	ElemListy<T> elemPierwszy;
	IteratorListowy<T> it;
	
	
	public ListaPojWiazana(){
		elemPierwszy = null;
		
	}
	
	public void dodawanie(T nowyElement){
		ElemListy<T> nowaGlowa = new ElemListy<T>(nowyElement, elemPierwszy);
		elemPierwszy = nowaGlowa;
		it = new IteratorListowy<T>(elemPierwszy);
		
	}
	
	/*public void usuwanie(){
		if(elemPierwszy == null){
			return;
		}
		else{
			elemPierwszy = elemPierwszy.next();
		}
	}*/
	
	public void wyswietlListe(){
		for (it.current(); it.hasNext(); it.next()){
			ElemListy<Integer> elem = ((ElemListy<Integer>) it.current());
			System.out.print(( elem.wartosc()));
		}
	}
	
	public ElemListy<T> first(){
		return elemPierwszy;
	}
	
}
