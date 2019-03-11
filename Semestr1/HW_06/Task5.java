import java.util.Scanner;

public class Task5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input amount of first array: ");
        int n1 = sc.nextInt();
        System.out.println("Input fist array: ");
        int[] arr1 = new int[n1];
        int c = 0;
        int i = 0;
        int j = 0;
        for(i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Input amount of second array: ");
        int n2 = sc.nextInt();
        System.out.println("Input second array: ");
        int[] arr2 = new int[n2];
        for(i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }
        for(i = 0; i < n1; i++){
            for(j = 0; j < n2; j++){
                if(arr1[i] == arr2[j]){
                    c++;
                }
            }
        }
        if(c > 0){
            System.out.println(c);
        }
        else{
            System.out.println("No");
        }
    }
}