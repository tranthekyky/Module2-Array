import java.util.Scanner;

public class GiaTrịNhoNhat {
    public static void main(String[] args) {
        int size ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Size cua mang : ");
        size = sc.nextInt();
        if (size > 10 ){
            System.out.print("Size khong vuot qua 10 phan tu !");
        }
        int [] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " : ");
            numbers[i] = sc.nextInt();
        }
            System.out.print("Mang : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print( numbers[i] + " ");
        }
        int index = minValue(numbers) ;
        System.out.printf("%nVi tri index co phan tu nho nhat la : " + index);
    }
    public static int minValue(int [] arr) {
        int indexMin = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[indexMin]) {
                indexMin = i;
            }
        }
        return indexMin ;
    }
}
