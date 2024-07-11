import java.util.Scanner;

public class MaxInMangHaiChieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap size chieu ngang cua ma tran : ");
        int width = sc.nextInt();
        System.out.print("Nhap size chieu ngang cua ma tran : ") ;
        int height = sc.nextInt();
        int [][] numbers = new int[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.println("Nhap phan tu thu " + i + " " + j);
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma Tran : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println();
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print( numbers[i][j] + " ");
            }
        }
        System.out.printf("%nPhan tu lon nhat trong Ma Tran la : ");
        int Max = MaxValue(numbers) ;
        System.out.print(Max);


    }
    public static int MaxValue (int [][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
