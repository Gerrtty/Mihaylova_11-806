public interface BinarySearchTree <T extends Comparable> {
    void insert(T t);
    boolean contains(T t);
    void remove(T t);
    void printAll();
    void printAllByLevels();
}
