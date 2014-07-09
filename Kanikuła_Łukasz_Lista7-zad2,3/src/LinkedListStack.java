class LinkedListStack
{
    private StackNode first;
    public LinkedListStack()
    {
        first = null;
    }
    public boolean isEmpty()
    {
        return (first==null);
    }
    public void insert(Wierzcholek key)//Wstawianie na początek listy
    {
        StackNode newLLNode = new StackNode(key);
        newLLNode.next = first;
        first = newLLNode;
    }
    public Wierzcholek delete()// Usuwanie z początku listy
    {
        StackNode temp = first;
        first = first.next;
        return temp.item;
    }
}