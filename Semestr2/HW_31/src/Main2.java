import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        String s = "abcd";
        int lineNumber = 0, change = 0, fact = factorial(s.length());
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(s);


        permutation(arrayList, lineNumber, change, fact);
        printList(arrayList);
    }

    public static ArrayList<String> permutation(ArrayList<String> al, int lineNimber, int change, int count){
        if(count == 1){
            return al;
        }
        String str = al.get(lineNimber);
        char[] charArray = str.toCharArray();
        if(change < str.length() - 1){
            char element = charArray[change];
            charArray[change] = charArray[change + 1];
            charArray[change + 1] = element;
            String s = charToString(charArray);
            if(!(al.contains(s))){
                al.add(s);
                count = count - 1;
            }
            change = change + 1;
            permutation(al, lineNimber, change, count);
        }
        else{
            change = 0;
            lineNimber = lineNimber + 1;
            permutation(al, lineNimber, change, count);
        }
        return al;
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