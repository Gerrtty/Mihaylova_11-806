import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ���-�� ���������: ");
        int n = sc.nextInt();
        System.out.println("������� ���� ���������: ");
        int arr[] = new int[n];
        int count = 0; //�������
        int result = 0; //������� ����
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
        System.out.println(result); // ����� �������� �����
        System.out.println(count); // ����� ���-�� ���������, ��� ���� ���� ��������
    }
}