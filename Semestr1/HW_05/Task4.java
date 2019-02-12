import java.util.Scanner;
public class Task4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(0 == 0){
            System.out.println("Input string: ");
            String str = sc.nextLine();
            System.out.println("Input key: ");
            String key = sc.nextLine();
            char[] strChar = str.toCharArray();
            if(key.equals("u")){
                for(int i = 0; i < str.length(); i++){
                    if(strChar[i] >= 'a' && strChar[i] <= 'z'){
                        strChar[i] = (char) (strChar[i] - 32);
                    }
                }
            }
            else if (key.equals("l")){
                for(int i = 0; i < str.length(); i++){
                    if(strChar[i] >= 'A' && strChar[i] <= 'Z'){
                        strChar[i] = (char) (strChar[i] + 32);
                    }
                }
            }
            System.out.println(strChar);
        }
    }
}