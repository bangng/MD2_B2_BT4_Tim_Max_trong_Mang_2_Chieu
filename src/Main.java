import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m,n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột");
        n = scanner.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Nhập các phần tử cho mảng");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr["+ i +"]["+ j +"]");
                arr[i][j] = scanner.nextInt();

            }

        }
        int max = arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < arr[i][j]){
                    max = arr[i][j];
                }

            }

        }
        System.out.println("Phần tử lớn nhất trong mảng là: "+ max);
    }
}
