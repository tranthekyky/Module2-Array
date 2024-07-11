import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Đảo ngược mảng
        int size ;
        int [] numbers ;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap size cua mang : ");
            size = scanner.nextInt();
            if (size > 20) {
                 System.out.println("Size khong vuot qua 20 ");
            }
        }while (size > 20);
        numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + " : " );
            numbers[i] = scanner.nextInt() ;
        }
        System.out.printf("%-20s%s" , "Cac phan tu trong mang : " , "");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " \t ");
        }
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;

        }
        System.out.printf("\n %-20s%s" , "Mang duoc dao nguoc   : " , "") ;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "   ");
        }
        System.out.println( Arrays.toString(numbers));




    }


}