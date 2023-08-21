package Test;





public class Demo {
    public static void main(String[] args) {
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                System.out.println("foo");
            }
        };

        Thread thread = new Thread(runner);
        thread.start();
        System.out.println("bar");

    }

}



