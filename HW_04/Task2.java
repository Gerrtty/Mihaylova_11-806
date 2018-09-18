import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string: ");
        String str1 = sc.next();
        char[] str2 = str1.toCharArray();
        char[] str3 = new char[str2.length];
        System.out.println("Input number: ");
        int n = sc.nextInt();
        for(int i = 0, j = str2.length-n; j < str2.length; i++, j++){
            str3[i] = str2[j];
        }
        for(int i = n, j = 0; i < str2.length; i++, j++){
            str3[i] = str2[j];
        }
        System.out.println(str3);
    }
}