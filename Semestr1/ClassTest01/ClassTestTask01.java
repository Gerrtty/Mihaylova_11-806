//Var 1

package com.company;
import java.util.Scanner;
public class ClassTestTask01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = sc.nextInt();
        int[] arr = new int[n * n];
        int matrix[][] = new int[n][n];
        System.out.println("Input numbers: ");
        for(int i = 0; i < n * n; i++){
            arr[i] = sc.nextInt();
        }
        SortArr(arr);
        spiralFill(matrix, arr);
        overDiagonalSum(matrix);
    }
    static void SortArr(int[] arr){
        System.out.println("Task1: ");
        int d = arr.length;
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d - 1 - i; j++) {
                if (Math.abs(arr[j]) > Math.abs(arr[j + 1])) {
                    int b = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = b;
                }
            }
        }
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void spiralFill(int[][] matrix, int[] arr){
        System.out.println("Task2: ");
        int n = (int)Math.sqrt(arr.length);
        int c = 0;
        int k = 0; //Amount of repetitions
        int t = 0; //Offset
        if(n % 2 == 0 ){
            k = n / 2;
        }
        else{
            k = (n + 1) / 2;
        }
        while(k > 0){
            for(int i = t; i < n - t; i++){
                matrix[t][i] = arr[c];
                c++;
            }
            for(int i = 1 + t; i < n - t; i++){
                matrix[i][n - 1 - t] = arr[c];
                c++;
            }
            for(int i = n - 2 - t; i >= t; i-- ){
                matrix[n - 1 - t][i] = arr[c];
                c++;
            }
            for(int i = n - 2 - t; i > t; i--){
                matrix[i][t] = arr[c];
                c++;
            }
            k--;
            t++;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] < 10){
                    System.out.print(matrix[i][j] + "  ");
                }
                else{
                    System.out.print(matrix[i][j] + " ");
                }
            }System.out.println();

        }
    }
    static void overDiagonalSum(int[][] matrix){
        System.out.println();
        System.out.println("Task3: ");
        int n =(int)Math.sqrt(matrix[0].length);
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; i++){
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}