package JavaPractice;

public class ThreadTest {
    public static void main(String[] args) {
        Abcd i = new Abcd();
        Xyz j = new Xyz();
        System.out.println(i.getPriority());
        System.out.println(j.getPriority());
        /*i.setPriority(6);
        j.setPriority(10);
        System.out.println(i.getPriority());
        System.out.println(j.getPriority());*/
        i.start();
        j.start();
    }
}

class Abcd extends Thread{
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println("Hi");
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Xyz extends Thread{
    public void run() {
        for (int i = 0; i <= 10; i++) {

            try {
                System.out.println("Hello");
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
