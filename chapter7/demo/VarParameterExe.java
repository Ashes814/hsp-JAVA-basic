// package homework;

public class VarParameterExe {

    public static void main(String[] args) {
        VarP test = new VarP();
        System.out.println(test.showScore("欧宝",90.4,90.2,90.3));
        
    }
}

class VarP {
    public String showScore(String name, double... score) {
        double sumScore = 0;
        for (int i = 0; i < score.length; i++) {
            sumScore += score[i];
        }

        return name + Double.toString(sumScore);
    }
}