import java.util.Scanner;

public class Task4{
    public static void main(String[] args){
        System.out.println("Input amount of array: ");
        func();
    }

    static void func() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Input array: ");
        int[] arr = new int[n];
        Boolean b = false;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            for (int j = 1; j < n - 1; j++) {
                if (arr[i] == arr[j]) {
                    b = true;
                }
            }
        }
        System.out.println(b);
    }
}