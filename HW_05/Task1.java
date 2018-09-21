import java.util.Scanner;
public class Task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double result = 0;
        double x3 = 0;
        String op2 = "";
        System.out.println("Input first number: ");
        double x1 = sc.nextDouble();
        System.out.println("Input operator: ");
        String op = sc.next();
        System.out.println("Input second number: ");
        double x2 = sc.nextDouble();
        String key = "n";
        while(key.equals("n") || key.equals("y")){
            if(op.equals("+")){
                result = x1 + x2;
            }
            else if(op.equals("-")){
                result = x1 - x2;
            }
            else if(op.equals("*")){
                result = x1 * x2;
            }
            else if(op.equals("/")){
                if(x2 == 0){
                    System.out.println("Error");
                }
                result = x1 / x2;
            }
            System.out.println(result);
            System.out.println("Reset the result? y/n: ");
            key = sc.next();
            if(key.equals("n")){
                System.out.println("Input operator: ");
                op2 = sc.next();
                op = op2;
                System.out.println("Input second number: ");
                x3 = sc.nextDouble();
                x1 = result;
                x2 = x3;
            }
            else if(key.equals("y")){
                System.out.println("Input first number: ");
                x1 = sc.nextDouble();
                System.out.println("Input operator: ");
                op = sc.next();
                System.out.println("Input second number: ");
                x2 = sc.nextDouble();
            }
        }
    }
}