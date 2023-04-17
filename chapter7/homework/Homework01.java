package homework;

public class Homework01 {
    public static void main(String [] args) {
        A01 test = new A01();
        // double[] testArray = {0.1, -0.1, 0.2, 2.3, -3.3};
        double[] testArray = {};
        System.out.println(test.max(testArray));

    }
}

class A01 {
    public Double max(double[] array){
        if (array.length < 1) {
            System.out.println("Wrong");
            return null;
        }
        double maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            } else {
                continue;
            }
        }
        return maxNumber;
    }
}