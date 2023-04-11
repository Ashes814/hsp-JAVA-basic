import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.next();
        switch (inputName) {
            case "小白":
                System.out.println("小白,绿色,3");
                break;
            case "小花":
                System.out.println("小花,花色,8848");
                break;
            default:
                System.out.println("小猫咪离家出走");
        }

        scanner.close();

    }
       
}