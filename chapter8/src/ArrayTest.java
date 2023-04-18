import java.util.Scanner;

public class ArrayTest {
   
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        int[] arr = {6, 2, 7, 21, 7, 8, 2};
        MyTools test = new MyTools();


        test.bubble(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
    }

}

class MyTools {


    public void bubble(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }


    }
}