import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Mang : ");
        for( int i=0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
        Scanner sc = new Scanner(System.in);
        System.out.printf("%nNhap Phan tu muon xoa : ");
        int x = sc.nextInt();
        if (CheckElement(numbers,x)) {
           int [] newArr =  NewArr(numbers, x);
            System.out.println("Mang sau khi xoa : " );
            for (int element : newArr) {
                System.out.print(element + " ");
            }

        }else {
            System.out.println("Khong co Phan tu nay trong mang !!");
        }


    }
    public static int[] NewArr(int[] arr, int x) {
        int[] newArr = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[arr.length - 1]) {
                continue;
            }
            if (arr[i] == x) {
                i = i + 1 ;
            }
            newArr[index] = arr[i];
            index++ ;
        }
        return newArr;

    }
    public static boolean CheckElement(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }
}
