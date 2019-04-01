public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> b = new BinarySearchTreeImpl<>();
        b.insert(10);
        b.insert(4);
        b.insert(11);
        b.remove(4);
        System.out.println(b.contains(10));
        System.out.println(b.contains(11));
        System.out.println(b.contains(4));
    }
}