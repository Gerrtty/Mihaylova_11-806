package com.company;

public class MyLinkedList<T> {

    private Node head;
    private int count = 0;

    //добавление в конец списка
    public void add(T value) {
        Node newNode = new Node();
        newNode.setValue(value);
        newNode.setNext(null);
        if (head != null) {
            Node current = head;
            //нахождение последнего из списка
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        } else {
            head = newNode;
        }
        count++;
    }

    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException(index + " does not exist");
        }
        Node elem = head;
        for (int i = 0; i < index; i++) {
            elem = elem.getNext();
        }
        return (T) elem.getValue();
    }

    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException(index + " does not exist");
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            Node beforeRemovable = head;
            for (int i = 0; i < index - 1; i++) {
                beforeRemovable = beforeRemovable.getNext();
            }
            Node elemToRemove = beforeRemovable.getNext();
            beforeRemovable.setNext(elemToRemove.getNext());
        }
        this.count--;
    }

    public int size(){
        return count;
    }

    public boolean contains(T value){
        Node current = head;
        while (current.getNext() != null){
            if(current.getValue().equals(value)){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public T[] toArray(){
        T[] arr = (T[]) new Object[count];
        int c = 0;
        Node current = head;
        while (current != null){
            arr[c] = (T) current.getValue();
            current = current.getNext();
            c++;
        }
        return arr;
    }

    public void addAll(MyLinkedList<T> list){
        for(int i = 0; i < list.size(); i++){
            add(list.get(i));
        }
        count += list.size();
    }

    public void addAll(MyLinkedList<T> list, int index){
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException(index + " does not exist");
        }
        Node before = head;
        for(int i = 0; i < index - 1; i++){
            before = before.getNext();
        }
        Node last = list.getLast();
        last.setNext(before.getNext());
        before.setNext(list.getFirst());
        count += list.size();
    }

    public Node getFirst(){
        return head;
    }

    public Node getLast(){
        Node last = head;
        while (last.getNext() != null){
            last = last.getNext();
        }
        return last;
    }

    public MyIterator iterator() {
        return new MyIterator();
    }

    class MyIterator{
        int currentIndex = 0;

        public boolean hasNext() {
            return currentIndex < count;
        }


        public T next() {
            for (int i = 0; i < currentIndex; i++) {
                head = head.getNext();
            }
            currentIndex++;
            return (T) head;
        }
    }
}