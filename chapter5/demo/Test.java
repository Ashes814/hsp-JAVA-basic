import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // int age = input.nextInt();
        // if(age < 18) {
        //     System.out.println(9);
        // }

    Scanner input = new Scanner(System.in);
    int level = input.nextInt();
    int i = 1;
    while(i <= level) {
        for(int j = 1;j<=i;j++) {
            System.out.print(" ");
            System.out.print('*');
            
        }
        System.out.print('\n');
        i++;
    }



    }
}