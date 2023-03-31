import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

       int a = 1 >> 2; //0 00000000 00000000 00000000 00000001
       int b = -1 >> 2; //-1 111111111 11111111 11111111 11111110
       int c = 1 << 2; //4 00000000 00000000 00000000 00000100
       int d = -1 << 2; //-4 100000000 00000000 00000000 00000100
       int e = -1 >>> 3; //536870911 000111111 11111111 11111111 11111111

       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);
       System.out.println(e);
       System.out.println(~-2); // 1
       System.out.println(~2); // -3 10000000 00000000 00000000 00000011
       System.out.println(2|3); //3
       System.out.println(2^3); //1




    }
}