public class IteratorOdwrotny implements Iterator {
    private final Iterator i;

    public IteratorOdwrotny(Iterator iter) { i=iter; } 
    public void first()     { i.last(); }
    public void last()      { i.first(); }
    public void next()      { i.previous(); }
    public void previous()  { i.next(); }
    public boolean isDone() { return i.isDone(); }
    public Object current() { return i.current(); }
}
