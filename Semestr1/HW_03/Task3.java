import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Input array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(i > 0 && i < n-1 && arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                count++;
            }
        }
        System.out.println(count); 
    }
}