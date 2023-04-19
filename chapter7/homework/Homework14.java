package homework;
import java.util.Scanner;
import java.util.Random;
public class Homework14 {
    public static void main(String[] args) {
        Tom test = new Tom();
        test.startGame(4);
    }
}
class Tom {
    int tomResult =0;
    int pcResult = 0;
    public void startGame(int round) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        do {
            int player = scanner.nextInt();
            int pc = random.nextInt(3);
            if (pc == 2 && player == 0) {
                this.pcResult += 1;
                System.out.println("电脑获胜");
            } else if(pc == 1 && player == 2) {
                this.pcResult += 1;
                System.out.println("电脑获胜");
            } else if(pc == 0 && player == 1) {
                this.pcResult += 1;
                System.out.println("电脑获胜");
            } else if (pc == 0 && player == 2) {
                this.tomResult += 1;
                System.out.println("玩家获胜");
            } else if(pc == 2 && player == 1) {
                this.tomResult += 1;
                System.out.println("玩家获胜");
            } else if(pc == 1 && player == 0) {
                this.tomResult += 1;
                System.out.println("玩家获胜");
            } else {
                System.out.println("Draw Game");
            }
            round--;
        } while (round > 0);
        scanner.close();
        System.out.println("电脑获胜次数" + this.pcResult);
        System.out.println("玩家获胜次数" + this.tomResult);
    }
    

    
    
}