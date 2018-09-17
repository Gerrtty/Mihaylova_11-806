import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = sc.nextInt();
        System.out.println("Input array: ");
        int[] arr = new int[n];
        int max = 0;
        int indexMax = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(Math.abs(arr[i]) > max){
                max = Math.abs(arr[i]);
                indexMax = i;
            }
        }
        System.out.println(indexMax);
    }
}