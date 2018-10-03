import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();
        if(fibonachi(n, f1, f2) == 0){
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }

    }
    public static int fibonachi(int n, int f1, int f2){
        if(n > f2){
            f1 +=f2;
            f2 +=f1;
            return fibonachi(n, f1, f2);
        }
        else if(n == f1 || n == f2){
            return 1;
        }
        else return 0;
    }

}