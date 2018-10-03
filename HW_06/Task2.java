import java.util.Scanner;

public class Task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = sc.nextLine();
        System.out.println(itrim(str));
    }
    static String itrim(String str){
        char[] arr = str.toCharArray();
        int x = 0;
        for(int i = 0; i < str.length(); i++){
            if(arr[i] == ' '){
                x++;
            }
        }
		char[] arr2 = new char[str.length() - x];
        for (int i = 0, j = 0; j < str.length() - x; i++, j++) {
            arr2[j] = arr[i + x];
        }
        str = String.valueOf(arr2);
        return str;
    }
}