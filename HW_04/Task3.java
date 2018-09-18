import java.util.Scanner;
public class Task3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = sc.next();
        char[] str1 = str.toCharArray();
        System.out.println("Input n1: ");
        int n1 = sc.nextInt();
        System.out.println("Input n2: ");
        int n2 = sc.nextInt();
        int razn = n2-n1;
        char[] str2 = new char[razn];
        for(int i = 0, j = 0; i < n1; i++){
            str2[i] = str1[j];
        }
        for(int i = n1, j = n2+1; i < razn; i++){
            str2[i] = str1[j];
        }
        String strResult = String.copyValueOf(str2);
        System.out.println(strResult);
    }
}