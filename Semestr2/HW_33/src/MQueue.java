public class MQueue<T> {

    private int n;

    private T elem;

    private T[] arr;

    private int campacity;



    public MQueue(int campacity){

        arr = (T[]) new Object[campacity];

        this.campacity = campacity;

        n = 0;

    }



    public void enqueue(T element){

        if(n == campacity){

            throw new IllegalArgumentException("Queue is overflow");

        }

        arr[n++] = element;

    }



    public T dequeue(){

        if(isEmpty()){

            throw new IllegalArgumentException("Queue is empty");

        }

        elem = arr[arr.length - n];

        n--;

        return elem;

    }



    public boolean isEmpty(){

        return n == 0;

    }

}