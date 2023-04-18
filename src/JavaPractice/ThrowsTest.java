package JavaPractice;

public class ThrowsTest {
    public static void main(String[] args) {
        Aaa a = new Aaa();
        try {
            a.show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

class Aaa {
    public void show() throws ClassNotFoundException{
            Class.forName("jhvjj");
    }
}
