import java.util.Scanner;
public class TaskD{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        double n = sc.nextDouble();
        if(n < 0){
            System.out.println("Error");
            System.exit(0);
        }
        if(func(n) == 1){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    public static double func(double n){
        if(n == 1){
            return 1;
        }
        if(n % 2 != 0){
            return 0;
        }
        else {
            return func(n / 2);
        }
    }
}