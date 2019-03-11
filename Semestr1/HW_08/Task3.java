import java.util.Scanner;
public class Task3 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Input size of matrix: ");
        int n = sc.nextInt(); //Size
        int c = 1;
        int k = 0; //Amount of repetitions
        int t = 0; //Offset
        int[][] mat = new int[n][n];
        if(n % 2 == 0 ){
            k = n / 2;
        }
        else{
            k = (n + 1) / 2;
        }
        while(k > 0){
            for(int i = t; i < n - t; i++){
                mat[t][i] = c;
                c++;
            }
            for(int i = 1 + t; i < n - t; i++){
                mat[i][n - 1 - t] = c;
                c++;
            }
            for(int i = n - 2 - t; i >= t; i-- ){
                mat[n - 1 - t][i] = c;
                c++;
            }
            for(int i = n - 2 - t; i > t; i--){
                mat[i][t] = c;
                c++;
            }
            k--;
            t++;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] < 10){
                    System.out.print(mat[i][j] + "  ");
                }
                else{
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}