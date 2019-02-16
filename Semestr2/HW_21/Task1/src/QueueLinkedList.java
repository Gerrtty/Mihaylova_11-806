public class QueueLinkedList<T> {
    Node<T> first;
    Node<T> current;

    public void enqueue(T element){
        Node<T> newNode = new Node<>();
        newNode.setValue(element);
        if(first == null){
            first = newNode;
        }
        else if(first.getNext() == null){
            first.setNext(newNode);
            current = newNode;
        }
        else {
            current.setNext(newNode);
            current = newNode;
        }
    }
    public T dequeue(){
        if(isEmpty()){
            throw new IllegalArgumentException("Queue is empty");
        }
        T e = first.getValue();
        first = first.getNext();
        return e;
    }

    public boolean isEmpty(){
        return first == null;
    }

}

class Node<T>{
    private T value;
    private Node next;

    public void setValue(T value){
        this.value = value;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public T getValue(){
        return value;
    }
    public Node getNext(){
        return next;
    }
}