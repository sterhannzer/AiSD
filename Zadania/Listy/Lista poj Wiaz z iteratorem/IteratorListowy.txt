import java.util.Iterator;

public class IteratorListowy<T> implements Iterator<ElemListy<T>> {
	ElemListy<T> kursor;
	
	public IteratorListowy(ElemListy<T> elem){
		this.kursor = elem;
	}

	@Override
	public boolean hasNext(){
		if(kursor == null)
			return false;
		return true;
	}

	@Override
	public ElemListy<T> next(){
		
		return kursor = kursor.next();
	}
	
	public ElemListy<T> current(){
		return kursor;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
	
	
}
