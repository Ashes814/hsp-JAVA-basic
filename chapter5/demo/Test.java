import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int newNumber = 8848;
        int newIndex = -1;
        int[] oldArray = {10, 12, 45, 90, 108, 109};
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            if (newNumber >= oldArray[i]) {
                newArray[i] = oldArray[i];
            } else {
                newIndex = i;
                newArray[i] = newNumber;
                break;
            }

        }

        
        if (newIndex == -1) {
            newArray[oldArray.length] = newNumber;

            
        } else {
            for (int j = newIndex + 1; j < oldArray.length + 1; j++) {
                newArray[j] = oldArray[j - 1];
            }
        }

        for (int i = 0; i < newArray.length;i++) {
            System.out.println(newArray[i]);
        }


            

    }
       
}