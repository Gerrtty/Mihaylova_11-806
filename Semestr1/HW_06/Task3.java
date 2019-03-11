import java.util.Scanner;

public class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input amount of array: ");
        int n = sc.nextInt();
        System.out.println("Input array: ");
        int[] arr = new int[n];
        int c = 1;
        int max = 1;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n - 1; i++){
            if(arr[i] == arr[i + 1]){
                c++;
            }
            else if(c > max){
                max = c;
                c = 1;
            }
        }
        if(max > 1){
            System.out.println(c);
        }
        else if(max == 1){
            System.out.println("No");
        }
    }
}