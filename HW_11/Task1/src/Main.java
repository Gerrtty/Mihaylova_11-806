import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    }
    static void merge() throws IOException {
        System.out.println("Input amount of strings: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintWriter pw = new PrintWriter(new File("in.txt"));
        Scanner[] scanners = new Scanner[n];
        for (int i = 0; i < n; i++) {
            scanners[i] = new Scanner(new File("out" + i + ".txt"));
        }
        for (int i = 0; i < n; i++) {
            while (scanners[i].hasNext()) {
                pw.println(scanners[i].next());
            }
        }
        pw.close();
    }
    public int maxLength() throws IOException{
        Scanner sc = new Scanner(new File("in.txt"));
        int max = 0;
        while (sc.hasNext()){
            String str = sc.next();
            int strLength = str.length();
            if(strLength > max){
                max = strLength;
            }
        }
        return max;
    }
    static void sortInFiles(int k) throws IOException {
        PrintWriter[] printWriters = new PrintWriter[n];
        for (int i = 0; i < n; i++) {
            printWriters[i] = new PrintWriter(new File("out" + i + ".txt"));
        }
        Scanner sc = new Scanner(new File("in.txt"));
        while (sc.hasNextInt()) {
            String str = sc.next();
            char[] arr = new char[];
            for (int i = 0; i < k; i++) {
                c = c / 10;
            }
            printWriters[c % 10].println(x);
        }
        for (int i = 0; i < 10; i++) {
            printWriters[i].close();
        }
    }
}