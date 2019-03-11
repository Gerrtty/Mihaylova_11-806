import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        SimpleMap<String, Integer> sm = new SimpleMap<>(100);
        File in = new File("in.txt");
        try {
            if (!in.exists()) {
                in.createNewFile();
            }
        }
        catch (IOException e){
            throw new RuntimeException(":(((");
        }
        Scanner sc = new Scanner(in);

        int n = 1;
        while (sc.hasNextLine()){
            while (sc.hasNext()){
                String s = (sc.next().toLowerCase().replaceAll("\\\"|\\,|\\.|\\!|\\?|\\:|\\-|\\;", ""));
                if(sm.isRepeat(s)){
                    sm.put(s, sm.get(s) + 1);
                }
                else {
                    sm.put(s, n);
                }
            }
        }
        sm.print();
    }
}
