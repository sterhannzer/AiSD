
public interface Iterator  // metody wymagaj�ce zaimplementowania
{  public void previous(); // powoduje przej�cie do poprzedniego elementu
   public void next();     // powoduje przej�cie do nast�pnego elementu
   public void first();    // powoduje przej�cie do pierwszego elementu
   public void last();     // powoduje przej�cie do ostatniego elementu
			// niezaimplementowanie powy�szych metod wywo�uje wyj�tek 
			// UnsupportedOperationException 
   public boolean isDone(); // true je�li nie jest okre�lony element bie��cy,
			        // iterator jest w stanie "wyczerpany"
			        // false � je�li jest okre�lony element bie��cy
   public Object current(); // throws IteratorOutOfBoundsException;   
			                // udost�pnia warto�� bie��cego elementu
			// je�li bie��cy element nie nie jest okre�lony, wyst�puje wyj�tek 
}