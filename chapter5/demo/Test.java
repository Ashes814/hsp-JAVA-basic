import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // int age = input.nextInt();
        // if(age < 18) {
        //     System.out.println(9);
        // }

    // Scanner input = new Scanner(System.in);
    // int level = input.nextInt();
    int level = 7;
    int i = 1;
    while(i <= level) {
        for(int k = 1;k<=(level - i);k++) {
            System.out.print(" ");
            // System.out.print(" ");
            
        }


        for(int j = 1;j<=i;j++) {

            if (j == 1 | j == i | i == level) {
                System.out.print('*');
            } else {
                System.out.print(' ');
            }
            
            System.out.print(" ");
            
        }

       
        System.out.print('\n');
        i++;
    }



    }
}