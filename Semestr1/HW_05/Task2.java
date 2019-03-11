import java.util.Scanner;
public class Task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(0 == 0){
            System.out.println("Input string: ");
            String str = sc.nextLine();
            char[] strChar = str.toCharArray();
            for(int i = 0; i < str.length(); i++){
                if(strChar[i] > 47 && strChar[i] < 58){
                    strChar[i] = 42;
                }
            }
            System.out.println(strChar);
        }
    }
}