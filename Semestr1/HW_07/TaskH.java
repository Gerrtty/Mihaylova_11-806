import java.util.Scanner;
public  class TaskH{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = sc.nextInt();
        int d = 2;
        if((func(n , d) == 0)){
            System.out.println("Not Simple");
        }
        else if(func(n, d) == 1){
            System.out.println("Simple");
        }
        else{
            System.out.println("Error");
            System.exit(0);
        }
    }
    public static int func(int n, int d){
        if(n < 1){
            return -1;
        }
        else if(n == d){
            return 1;
        }
        else if ( n % d != 0 ){
            return func(n, d + 1);
        }
        else return 0;
    }
}