import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = -1;
        System.out.println("Input first number: ");
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        System.out.println("Input first array: ");
        for(int i = 0; i < n1; i++){
            a1[i] = sc.nextInt();
        }
        System.out.println("Input second number: ");
        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        if(n1 < n2){
           System.out.println("Error");
        }
        System.out.println("Input second array: ");
        for(int j = 0; j < n2; j++){
            a2[j] = sc.nextInt();
        }
        for(int i = 0, j = 0; a1[i] != a2[j]; i++){
            index++;
        }
        if(index == -1){
            System.out.println("No occurrences");
        }
        System.out.println(index);
    }
}