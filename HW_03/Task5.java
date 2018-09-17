import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Input array: ");
        int result = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            for(int j = n - 1; j >= 0; --j){
                result = result + (arr[i] * (int)Math.pow(10, j)); // Can't understand where is mistake
            }
        }
        System.out.println(result);
    }
}