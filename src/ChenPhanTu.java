import java.util.Scanner;

public class ChenPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mang duoc cho : ");
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int element : numbers) {
            System.out.print(element + " ");
        }
        System.out.printf("%nNhap Phan tu muon chen : ");
        int element = sc.nextInt();
        System.out.printf("%nNhap vi tri muon chen :");
        int index = sc.nextInt();
        if (CheckLocation(numbers,index)) {
            System.out.printf("%nVi tri hop le ");
            System.out.printf("%nMang sau khi chen : ");
            int [] newNumbers = AddElement(numbers,element,index) ;
            for (int i = 0; i < newNumbers.length; i++) {
                System.out.print(newNumbers[i] + " ");
            }
        }else {
            System.out.printf("%nVi tri khong ton tai ! ");
        }

    }
    public static int [] AddElement (int [] arr, int x , int index) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length + 1; i++) {
            if (index > i) {
                newArr[i] = arr[i];
            } else if (index == i) {
                newArr[i] = x;
            } else if (index < i) {
                newArr[i] = arr[index];
                index++;
            }
        }
        return newArr;
    }
    public static boolean CheckLocation (int [] arr, int index) {
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                return true;
            }
        }
        return false;
    }
}
