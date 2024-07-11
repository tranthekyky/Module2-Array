import java.util.Scanner;

public class TongDuongCheoChinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Width : ");
        int width = sc.nextInt();
        System.out.print("Nhap Height : ");
        int height = sc.nextInt();
        int [][] matrix = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("Nhap Phan tu thu " + i + " " +j + " : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            total += matrix[i][i];
            for (int j = 0; j < matrix[i].length; j++) {
            }
        }
        System.out.println("Total : " + total);
    }
}
