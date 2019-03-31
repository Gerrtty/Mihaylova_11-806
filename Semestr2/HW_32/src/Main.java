public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.add("abc");
        mll.add("fnnf");
        mll.add("aknknf");
        mll.add("aiff");

        mll.stream().filter(s -> s.charAt(0) == 'a').map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
    }
}