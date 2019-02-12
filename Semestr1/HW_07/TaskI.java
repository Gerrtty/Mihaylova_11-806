import java.util.Scanner;
public class TaskI{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = sc.nextInt();
        int d = 2;
        System.out.println("Multipliers this number: ");
        System.out.println(func(n, d));
    }
    public static int func(int n, int d) {
        if( d > n){
            return 1;
        }
        else if(n % d != 0){
            return func(n, d + 1);
        }
        else{
            System.out.println(d);
            return func(n / d, d);
        }
    }
}