import java.util.Scanner;
public class Task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int maxLine = 0; int maxColumn = 0;
        int l = -1; int c = -1; //Counters: l - index of line, c - index of column  
        System.out.println("Input first number: "); //Lines
        int n = sc.nextInt();
        System.out.println("Input second number: "); //Columns
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        System.out.println("Input matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) { //For clarity
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++){ //Searching max line
            int sumLine = 0;
            for (int j = 0; j < m; j++){
                sumLine = sumLine + mat[i][j];
            }
            if(sumLine > maxLine){
                maxLine = sumLine;
                l++;
            }
        }


        for (int j = 0; j < m; j++){ //Searching max column
            int sumColumn = 0;
            for (int i = 0; i < n; i++){
                sumColumn = sumColumn + mat[i][j];
            }
            if(sumColumn > maxColumn){
                maxColumn = sumColumn;
                c++;
            }
        }

        System.out.println("Max line: ");
        for(int i = 0; i < m; i++){
            System.out.print(mat[l][i] + " ");
        }
        System.out.println();
        System.out.println("Max column: ");
        for(int i = 0; i < n; i++){
            System.out.println(mat[c][k]);
        }
    }
}