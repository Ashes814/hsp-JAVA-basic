package homework;

public class Homework03 {

    public static void main(String [] args) {
        Book test = new Book();
       
        System.out.println(test.price);
        test.updatePrice();
        System.out.println(test.price);

    }
}

class Book {
    double price = 185.5;
    public void updatePrice(){
        if (this.price > 150) {
            this.price = 150;
        } else if (this.price > 100) {
            this.price = 100;
        } else {
            return;
        }
    }
}