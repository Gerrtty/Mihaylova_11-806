public class Main {
    public static void main(String[] args) {
        QueueLinkedList<Integer> q = new QueueLinkedList<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.print(q.dequeue() + " ");
        System.out.print(q.dequeue() + " ");
        System.out.print(q.dequeue() + " ");
        System.out.println("\n" + q.isEmpty());
    }
}
