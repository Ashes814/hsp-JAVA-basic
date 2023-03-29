public class Test {
    public static void main(String[] args) {
        int n1 = 10;
        double d1 = n1 + 1.1; //(1.1为double类型,n1为int类型,计算时自动转换成double,double向float赋值会报错)
        char c1 = 'b';
        double c2 = c1;

     
        System.out.println(n1);
        System.out.println(d1);
        System.out.println(c2);
       

    }
}