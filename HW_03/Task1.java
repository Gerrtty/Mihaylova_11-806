import java.util.Scanner;

public class Task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = sc.nextInt();
        System.out.println("Input array: ");
        int arr[] = new int[n];
        int count =0;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
            count = count + 1;
        }
        System.out.println(count);
    }
}