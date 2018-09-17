import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Input first number: ");
            double x1 = sc.nextDouble();
            System.out.println("Input operator: ");
            String op = sc.next();
            System.out.println("Input second number: ");
            double x2 = sc.nextDouble();
            double result = 0;
            String an = "";
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
            System.out.println("Continue? ");
            an = sc.next();
            if(an.equals("no")){
                break;
            }
        }
    }
}