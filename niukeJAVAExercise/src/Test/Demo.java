package Test;





public class Demo {
    private static final String Message = "taobao";

    public static void main( String[] args ) {
        new A1().testA1();
    }
}

interface A1 {

    void testA1();


}

interface A2 implements A1 {


}