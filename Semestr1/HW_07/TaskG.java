import java.util.Scanner;
public class TaskG{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = sc.nextInt();
        System.out.print(func(n));
    }
    public static String func(int n) {
        if(n < 10){
            return Integer.toString(n);
        }
        return func(n / 10) + " " + n % 10;
    }
}