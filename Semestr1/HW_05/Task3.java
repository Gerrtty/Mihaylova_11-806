import java.util.Scanner;
public class Task3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = sc.nextLine();
        char[] a = str.toCharArray();
        int x = 0;
        int ten = 1;
        for (int i = str.length() - 1; i > -1; i--) {
            x = x + (a[i]-'0')*ten;
            ten = ten*10;
        }
        System.out.println(x);
    }
}