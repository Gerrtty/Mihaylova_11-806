import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во студентов: ");
        int n = sc.nextInt();
        System.out.println("Введите рост студентов: ");
        int arr[] = new int[n];
        int count = 0; //Счётчик
        int result = 0; //Средний рост
        int sum = 0; 
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
            result = sum/n;
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > result){
                count++;
            }
        }
        System.out.println(result); // Вывод среднего роста
        System.out.println(count); // Вывод кол-ва студентов, чей рост выше среднего
    }
}