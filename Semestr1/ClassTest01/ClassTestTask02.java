import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = sc.next();
        int i = 0;
        System.out.println(func(str, i));
    }
    public static String low(String str){
        char[] strChar = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            if(strChar[i] >= 'A' && strChar[i] <= 'Z'){
                strChar[i] = (char) (strChar[i] + 32);
            }
        }
        return str;
    }

    public static String func(String str, int i) {
        char[] arr = new char[str.length()];
        arr = str.toCharArray();
        if(i == (str.length() - 1) / 2){
            return "Yes";
        }
        if(str.length() == 1){
            return "Yes";
        }
        else if(arr[i] == arr[str.length() - 1 - i]){
            return func(str, i + 1);
        }
        else{
            return "No";
        }
    }
}