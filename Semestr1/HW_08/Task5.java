import java.util.Scanner;
public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input amount of lines first matrix:");
        int m = sc.nextInt();
        System.out.println("Input amount of columns first matrix:");
        int n = sc.nextInt();
        System.out.println("Input amount of lines second matrix:");
        int k = sc.nextInt();
        System.out.println("Input amount of columns first matrix:");
        int t = sc.nextInt();
        if(n != k){
            System.out.println("Error");
            System.exit(0);
        }
        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[k][t];
        int[][] matrix3 = new int[m][t];
        System.out.println("Input first matrix: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input second matrix: ");
        for(int i = 0; i < k; i++){
            for(int j = 0; j < t; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < t; j++){
                for(int a = 0; a < n; a++){
                    matrix3[i][j] += matrix1[i][a] * matrix2[a][j];
                }
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < t; j++){
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}