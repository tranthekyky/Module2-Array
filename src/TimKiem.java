import java.util.Scanner;

public class TimKiem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] names = {"ky","Hau","Khoa","Duc","Lau"} ;
        System.out.print("Mang : ");
        for (String element : names) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Nhap ten can tim : ");
        String name = input.nextLine();
        int index = SearchElement(names,name) ;
        System.out.println("Vi tri cua " + names[index] + " : " + index);

    }
    public static int SearchElement (String[] array, String x) {

       for (int i = 0; i < array.length; i++) {
           if (array[i].equals(x)) {
               return i;
           }
       }
       return -1;
    }
}
