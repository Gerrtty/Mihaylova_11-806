public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 1; i < 5; i++){
            stack.push(i);
        }
        for(int i = 1; i < 5; i++){
            System.out.print(stack.pop() + " ");
        }
        System.out.println("\n" + stack.isEmpty());
    }
}
