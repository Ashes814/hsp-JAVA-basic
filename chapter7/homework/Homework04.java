package homework;

public class Homework04 {
    public static void main(String[] args) {
        A03 test = new A03();
        int[] oldArray = {1,2,3,4};
        int[] newArray = test.copyArr(oldArray);
        System.out.println(oldArray);
        System.out.println(newArray);

        oldArray[2] = 8848;
        System.out.println(oldArray);
        System.out.println(newArray);

    }
}

class A03 {
    public int[] copyArr(int[] oldArr) {
        int[] newArr = new int[oldArr.length];
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }

        return newArr;
    }
}