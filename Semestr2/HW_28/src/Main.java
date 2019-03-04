import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("input.txt");
        InputStream i = new FileInputStream(f);
        MyScanner m = new MyScanner(i);
        System.out.println(m.next());
    }
}
