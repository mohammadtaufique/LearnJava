package JavaPractice;

public class ThreadRunnable {
    public static void main(String[] args) {
        Runnable x = ()-> {
                for (int i = 0; i <= 5; i++) {
                    try {
                        System.out.println("Hi");
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        };
        Runnable y = ()->{
                for (int i = 0; i <= 5; i++) {
                    try {
                        System.out.println("Hello");
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                     };

        Thread t1 = new Thread(x);
        Thread t2 = new Thread(y);
        t1.start();
        t2.start();


    }
}
