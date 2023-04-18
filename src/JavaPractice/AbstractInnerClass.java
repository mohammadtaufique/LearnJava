package JavaPractice;

public class AbstractInnerClass {
    public static void main(String[] args) {
        demo d = new demo() {
            @Override
            public void show() {
                System.out.println("in new show");
            }

            @Override
            public void config() {
                System.out.println("in config method");
            }
        };
        d.show();
        d.config();
    }
}
abstract class demo{
    public abstract void show();
    public abstract void config();
}
