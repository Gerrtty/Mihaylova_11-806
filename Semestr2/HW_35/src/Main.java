import java.io.IOException;
import java.util.Random;

public class Main {
    public static int mainSum = 0;
    public static void main(String[] args) throws InterruptedException, IOException {
        int l = 1000000;
        int n = 5;
        int gap = l / n;
        int[] arr = new int[l];
        Random r = new Random();
        for (int i = 0; i < l; i++) {
            arr[i] = r.nextInt(100);
        }
        int sum = 0;
        for (int i = 0; i < l; i++) {
            sum += arr[i];
        }

        CounterThread[] counterThreads = new CounterThread[5];
        int start = 0; int end = gap;
        for (int i = 0; i < 5; i++){
            counterThreads[i] = new CounterThread(arr, start, end);
            start += gap;
            end += gap;
        }
        for(CounterThread counterThread : counterThreads){
            counterThread.start();
        }
        for (CounterThread counterThreads1 : counterThreads){
            counterThreads1.join();
        }
        System.out.println(sum);
        System.out.println();
        System.out.println(mainSum);
    }
}