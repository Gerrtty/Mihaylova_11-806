import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        getPermutation("abcd");
    }

    public static void getPermutation(String string){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(string);
        permutation(arrayList);
        printList(arrayList);
    }


    public static void permutation(ArrayList<String> al) {
        int c = 0;
        int n = factorial(al.get(0).length());
        while (n > 1){
            String s = al.get(c);
            char[] charArray = s.toCharArray();
            for (int i = 0; i < s.length() - 1; i++){
                char element = charArray[i];
                charArray[i] = charArray[i + 1];
                charArray[i + 1] = element;
                String str = charToString(charArray);
                if(!(al.contains(str))){
                    al.add(str);
                    n--;
                }
            }
            c++;
        }
    }

    public static void printList(ArrayList<String> arrayList){
        int k = 1;
        for (String s : arrayList){
            System.out.print(k++ + " " + s + "\n");
        }
    }


    public static String charToString(char[] array){
        String s = "";
        for(int i = 0; i < array.length; i++){
            s += array[i];
        }
        return s;
    }

    public static int factorial(int number){
        int result = 1;
        for (int i = number; i > 0; i--){
            result *= i;
        }
        return result;
    }
}
