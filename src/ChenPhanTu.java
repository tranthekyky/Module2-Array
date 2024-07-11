import java.util.Arrays;
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
           int [] newArr = AddElement(numbers,element,index) ;
            System.out.println(Arrays.toString(newArr));
//            for (int i = 0; i < newNumbers.length; i++) {
//                System.out.print(newNumbers[i] + " ");
//            }
        }else {
            System.out.printf("%nVi tri khong ton tai ! ");
        }

    }
    public static int [] AddElement (int [] arr, int x , int index ) {
        int [] newArr = new int[arr.length + 1];
        for (int i = 0; i <= arr.length ; i++) {
            if (i == arr.length) {
                newArr[i] = 0;
            }else {
                newArr[i] = arr[i];
            }

        }
        for (int i = newArr.length - 1; i > index; i--) {
            newArr[i] = newArr[i - 1];
        }
        newArr[index] = x;

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
