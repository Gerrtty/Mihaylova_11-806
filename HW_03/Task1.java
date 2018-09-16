import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = sc.nextInt();
        System.out.println("Input array: ");
        int arr[] = new int[n];
        int count = 0;
        int result = 0;
        int midHight = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            midHight = midHight + arr[i+1];
            result = midHight/n;
            if(arr[i] > result){
                count = count + 1;
            }
        }
        System.out.println(result);
        System.out.println(count);
    }
}