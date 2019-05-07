package task03;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;



public class Product {
    private boolean isReady;
    File file1;
    File file2;
    FileInputStream sc = null;
    PrintWriter pw = null;
    char c;
    boolean end = false;

    public Product(File file1, File file2){
        this.file1 = file1;
        this.file2 = file2;
        try {
            sc = new FileInputStream(file1);
            pw = new PrintWriter(file2);
        }
        catch (IOException e){
            System.out.println(":(");
        }
    }

    public boolean isProduced() {
        return isReady;
    }

    public boolean isEnd(){
        return end;
    }

    public boolean isConsumed() {
        return !isReady;
    }

    public void produce() {
        int i = 0;
        try {
            i = sc.read();
        }
        catch (IOException e){
            System.out.println(":(");
        }
        if(i != -1){
            this.c = (char) i;
        }
        else end = true;
        isReady = true;
    }

    public void consume() {
        if(!end){
            pw.print(c);
        }
        else pw.close();
        isReady = false;
    }
}