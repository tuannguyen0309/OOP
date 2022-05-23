public interface Stack{
    public int size();
    public boolean isEmpty();
    public Object peek() throws StackEmptyException;
    public void push(Object element) throws StackFullException;
    public Object pop() throws StackEmptyException;
}