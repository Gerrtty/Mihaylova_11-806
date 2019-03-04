import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class MyScanner{
    private InputStream is;

    public MyScanner(InputStream is){
        this.is = is;
    }

    int nextInt() throws IOException {
        int x; int i = 0; int y;
        int[] arr = new int[20];
        while ((x = is.read()) != 32 && x != -1){
            arr[i++] = x;
        }
        String s = "";
        for(int j = 0; j < i; j++){
            s += (char) arr[j];
        }
        try{
            y = Integer.parseInt(s);
        }
        catch (NumberFormatException e){
            throw new InputMismatchException();
        }
        return y;
    }

    public double nextDouble() throws IOException{
        int x; int i = 0; double d;
        int[] arr = new int[20];
        while ((x = is.read()) != 32 && x != -1){
            arr[i++] = x;
        }
        String s = "";
        for (int j = 0; j < i; j++){
            s += (char) arr[j];
        }
        try{
            d = Double.parseDouble(s);
        }
        catch (NumberFormatException e){
            throw new InputMismatchException();
        }
        return d;
    }

    public String next() throws IOException {
        int x; int i = 0;
        int[] arr = new int[20];
        while ((x = is.read()) != 32 && x != -1){
            arr[i++] = x;
        }
        String s = "";
        for(int j = 0; j < i; j++){
            s += (char) arr[j];
        }
        if(s.equals("")){
            throw new NoSuchElementException();
        }
        return s;
    }

    public String nextLine() throws IOException{
        int x; int i = 0;
        int[] arr = new int[20];
        while ((x = is.read()) != 10 && x != -1){
            arr[i++] = x;
        }
        String s = "";
        for(int j = 0; j < i; j++){
            s += (char) arr[j];
        }
        if(s.equals("")){
            throw new NoSuchElementException();
        }
        return s;
    }
}