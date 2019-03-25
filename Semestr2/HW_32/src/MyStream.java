import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStream<T> {
    MyLinkedList<T> linkedList;

    public MyStream(MyLinkedList<T> linkedList) {
        this.linkedList = linkedList;
    }

    public void forEach(Consumer<T> action) {
        for (int i = 0; i < linkedList.size(); i++) {
            action.accept(linkedList.get(i));
        }
    }

    public MyStream<T> filter(Predicate<T> predicate) {
        MyLinkedList<T> newMyLinkedList = new MyLinkedList<>();
        for (int i = 0; i < linkedList.size(); i++) {
            T obj = linkedList.get(i);
            if (predicate.test(obj)) {
                newMyLinkedList.add(obj);
            }
        }
        return new MyStream<>(newMyLinkedList);
    }

    public <R> MyStream map(Function<T, R> mapper) {
        MyLinkedList<R> newMyLinkedList = new MyLinkedList<>();
        R[] arr = (R[]) new Object[linkedList.size()];
        for (int i = 0; i < linkedList.size(); i++) {
            T obj = linkedList.get(i);
            arr[i] = mapper.apply(obj);
        }
        for (int i = 0; i < arr.length; i++) {
            newMyLinkedList.add(arr[i]);
        }
        return new MyStream<>(newMyLinkedList);
    }
}
