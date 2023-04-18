package JavaPractice;

public class ThrowTest {
    public static void main(String[] args) {
        int i = 20;
        int j = 2;

        try {
            int a = i/j;
            if(a==10){
                throw new TestException("I dont want test exception");
            }
            System.out.println(a);
        }catch (TestException e){
            System.out.println(e);
        }
    }
}

class TestException extends RuntimeException{

    public TestException(String str){
        super(str);
    }
}
