public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> b = new BinarySearchTreeImpl<>();
        b.insert(7);
        b.insert(5);
        b.insert(9);
        b.insert(11);
        b.printAll();
        System.out.println(b.contains(7));
        System.out.println(b.contains(5));
        System.out.println(b.contains(20));
        System.out.println(b.contains(9));
        System.out.println(b.contains(11));
    }
}