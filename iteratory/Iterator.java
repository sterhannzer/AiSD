
public interface Iterator  // metody wymagaj¹ce zaimplementowania
{  public void previous(); // powoduje przejœcie do poprzedniego elementu
   public void next();     // powoduje przejœcie do nastêpnego elementu
   public void first();    // powoduje przejœcie do pierwszego elementu
   public void last();     // powoduje przejœcie do ostatniego elementu
			// niezaimplementowanie powy¿szych metod wywo³uje wyj¹tek 
			// UnsupportedOperationException 
   public boolean isDone(); // true jeœli nie jest okreœlony element bie¿¹cy,
			        // iterator jest w stanie "wyczerpany"
			        // false – jeœli jest okreœlony element bie¿¹cy
   public Object current(); // throws IteratorOutOfBoundsException;   
			                // udostêpnia wartoœæ bie¿¹cego elementu
			// jeœli bie¿¹cy element nie nie jest okreœlony, wystêpuje wyj¹tek 
}