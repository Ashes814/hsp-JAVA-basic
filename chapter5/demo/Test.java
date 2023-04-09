import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int[] unsortedArray = {1,25,67,8848,7765,7723,24,69,80,57,13};
        int arrayLength = unsortedArray.length;
        int current;
        int next;

        for (int point = arrayLength - 1; point>0; point--) {
            for (int i = 0; i < point; i++) {
                current = unsortedArray[i];
                next = unsortedArray[i + 1];
                if (current > next) {
                    unsortedArray[i + 1] = current;
                    unsortedArray[i] = next;
                }
            }
        }

        for (int n=0;n<arrayLength;n++) {
            System.out.println(unsortedArray[n]);
        }
    }
}