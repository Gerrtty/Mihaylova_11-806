import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        System.out.println("Input array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n-1; i++){
            if(arr[i] < arr[i + 1]){
              count++;
            }
        }
        if(count == n-1){
            System.out.println("Elements of array are arranged in ascending order");
        }
        else if(count > n-1 || count < n-1){
            System.out.println("No");
        }
    }
}