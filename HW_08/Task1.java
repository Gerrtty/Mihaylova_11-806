import java.util.Scanner;
public class Task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0; //For main diagonal
        int sum2 = 0; //For secondary diagonal
        System.out.println("Input size of matrix: ");
        int n = sc.nextInt();
        int[][] m = new int[n][n];
        System.out.println("Input elements of matrix: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                m[i][j] = sc.nextInt();
            }
        }
        for(int i = 0, j = 0; i < n; i++, j++){ //Sum of elements on the main diagonal
            sum = sum + m[i][j];
        }
        for(int i = n - 1, j = 0; i >= 0; i--, j++){ //Sum of elements on the secondary diagonal
            sum2 = sum2 + m[i][j];
        }
        if(sum != sum2){
            System.out.println("It's not magic matrix");
            System.exit(0);
        }
        else{
            for(int i = 0; i < n; i++){
                int sum3 = 0;
                int sum4 = 0;
                for(int j = 0; j < n; j++){
                    sum3 = sum3 + m[i][j]; //For lines
                    sum4 = sum4 + m[j][i]; //For columns
                }
                if(sum3 != sum || sum4 != sum){
                    System.out.println("It's not magic matrix");
                    System.exit(0);
                }
            }
        }
        System.out.println("It's magic matrix");
    }
}