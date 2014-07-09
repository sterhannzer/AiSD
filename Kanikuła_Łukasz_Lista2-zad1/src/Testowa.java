import java.io.IOException;


public class Testowa {
	public static void main(String args[]) throws IOException{
		ListaPojWiazana<Integer> listawiazana = new ListaPojWiazana<Integer>();
		
		listawiazana.dodawanie(8);
		listawiazana.dodawanie(7);
		listawiazana.dodawanie(6);
		listawiazana.dodawanie(5);
		listawiazana.dodawanie(4);
		listawiazana.dodawanie(3);
		listawiazana.dodawanie(2);
		listawiazana.dodawanie(1);
		//IteratorListowy<Integer> it = new IteratorListowy<Integer>(listawiazana.first());
		
		//System.out.print(((listawiazana.elemPierwszy).next()).wartosc());
		
		for (listawiazana.it.current(); listawiazana.it.hasNext(); listawiazana.it.next()){
			ElemListy<Integer> elem = ((ElemListy<Integer>) listawiazana.it.current());
			System.out.print(( elem.wartosc()));
		}
	}

}
			
	