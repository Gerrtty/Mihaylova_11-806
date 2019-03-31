public class Main {
    public static void main(String[] args) {
        BinarySearchTreeImpl<Integer> b = new BinarySearchTreeImpl<>();
        b.insert(10);
        b.insert(8);
        b.insert(20);
        b.insert(5);
        b.printAllByLevels();
        b.remove(20);
        System.out.println();
        b.printAllByLevels();
    }
}