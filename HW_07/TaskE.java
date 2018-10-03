import java.util.Scanner;
public class TaskE{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = sc.nextInt();
        System.out.println(func(n));
    }
    public static int func(int n) {
        if(n < 10){
            return n;
        }
        return n % 10 + func(n/10);
    }
}