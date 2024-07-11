import java.util.Scanner;

public class TinhTongCotMaTran {
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
        System.out.print("Nhap vi tri cot ban muon tinh  : ");
        int column = sc.nextInt();
        int total = Total(matrix,column) ;
        System.out.println("Total : " + total);

    }
    public static int Total (int [][] arr , int n  ) {
        int total = 0;
        if (n >= 1 && n <= arr.length) {
            for (int i = 0; i < arr.length; i++) {
                total += arr[i][n - 1 ];
                for (int j = 0; j < arr[i].length; j++) {
                }
            }
        }else {
            return 0;
        }
        return total;

    }
}
