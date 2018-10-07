import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int max = 0;
        System.out.println("Input amount of lines: ");
        int m = sc.nextInt();
        System.out.println("Input amount of columns: ");
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        int arr[] = new int[m];
        int arr2[] = new int[n];
        System.out.println("Input matrix: ");
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) { //For clarity
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < m; i++){ //Min element in each line
            min = 100000;
            for(int j = 0; j < n; j++){
                if(mat[i][j] < min){
                    arr[i] = mat[i][j];
                    min = mat[i][j];
                }
            }
        }
        for(int i = 0; i < n; i++){ //Max element in each column
            max = 0;
            for(int j = 0; j < m; j++){
                if(mat[j][i] > max){
                    arr2[i] = mat[j][i];
                    max = mat[j][i];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j] == arr[i] && mat[i][j] == arr2[j]){
                    System.out.println(mat[i][j]);
                }
            }
        }
    }
}