import java.util.Scanner;
public class Task1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input amount of strings: ");
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0, j = 1; i < n; i++, j++){
            System.out.println("Input " + j + " string: ");
            str[i] = sc.next();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if(str[j].length() > str[j + 1].length()){
                    String x = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = x;
                }
            }
        }
        System.out.println("Array which sorting for strings length: ");
        for(String i : str){
            System.out.println(i);
        }
    }
}