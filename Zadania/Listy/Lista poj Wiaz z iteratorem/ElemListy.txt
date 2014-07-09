public class ElemListy<T> {
	T wartoscElem;
	ElemListy<T> nastElem;
	
	
	public ElemListy(T WartoscNowegoElem, ElemListy<T> NastElem){
		this.wartoscElem = WartoscNowegoElem;
		this.nastElem = NastElem;
		
	}
	
	public ElemListy<T> next(){
		return nastElem;
	}
	
	public T wartosc(){
		return wartoscElem;
	}
	
}
