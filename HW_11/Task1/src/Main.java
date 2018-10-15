import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < maxLength(); i++) {

            sortInFiles(i);
            merge();
        }
    }
    static void merge() throws IOException {
        PrintWriter pw = new PrintWriter(new File("in.txt"));
        Scanner[] scanners = new Scanner[26];
        for (int i = 0; i < 26; i++) {
            scanners[i] = new Scanner(new File("out" + i + ".txt"));
            while (scanners[i].hasNextLine()) {
                pw.println(scanners[i].nextLine());
            }
        }
        pw.close();
    }
    static int maxLength() throws IOException{
        Scanner sc = new Scanner(new File("in.txt"));
        int max = 0;
        while (sc.hasNextLine()){
            String str = sc.nextLine();
            int strLength = str.length();
            if(strLength > max){
                max = strLength;
            }
        }
        return max;
    }
    static void sortInFiles(int k) throws IOException {
        PrintWriter[] pws = new PrintWriter[26];
        for (int i = 0; i < 26; i++) {
            pws[i] = new PrintWriter(new File("charsLetters" + (char) (i + 'A') + ".txt"));
        }
        Scanner sc = new Scanner(new File("out.txt"));
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            char[] arr = str.toCharArray();
            int leng = str.length();
            if(leng > k){
                pws[(int) arr[k]-'a'].println(str);
            } else {
                pws[0].println(str);
            }
        }
        for (int i = 0; i < 26 ; i++) {
            pws[i].close();
        }
    }
}
