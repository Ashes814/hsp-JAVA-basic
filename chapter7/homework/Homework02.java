package homework;

public class Homework02 {
    public static void main(String [] args) {
      A02 test = new A02();
      String[] str = {"小黑子", "马老师","abc","def"};
      String element = "abcd";
      System.out.println(test.find(str, element));


    }
}


class A02 {
  public int find(String[] str, String element) {
    int index = -1;
    for (int i = 0; i < str.length; i++) {
      if (element.equals(str[i])) {
        index = i;
        break;
      }
    }
    return index;
  }
}
