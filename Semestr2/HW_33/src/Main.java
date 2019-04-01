public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> b = new BinarySearchTreeImpl<>();
        b.insert(10);
        b.insert(4);
        b.insert(15);
        b.remove(15);
        b.printAll();
    }
}