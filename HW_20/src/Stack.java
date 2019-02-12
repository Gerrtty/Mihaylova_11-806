public class Stack<T> {
    private Node<T> first;
    private int count = 0;

    public void push(T elem){
        Node<T> newNode = new  Node<>();
        newNode.setValue(elem);
        newNode.setNext(first);
        first = newNode;
        count++;
    }

    public T pop(){
        if(count == 0){
            throw new IllegalArgumentException("Stack is empty");
        }
        T e = first.getValue();
        first = first.getNext();
        count--;
        return e;
    }

    public boolean isEmpty(){
        return count == 0;
    }
}
