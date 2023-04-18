package JavaPractice;

public class ExceptionTestTryCatch {
    public static void main(String[] args) {
        int i = 2;
        int j = 18;
        int a=0;
        String s = "null";
        try {
             a = j / i;
             a = s.length();
            System.out.println(Class.forName("abcd"));
        }
        catch (ArithmeticException e){
            System.out.println("Got exception "+e);
        }
        catch (NullPointerException e){
            System.out.println("got another exception "+e);
        } catch (Exception e) {
            System.out.println("got class another exception "+e);
        }
        System.out.println(a);
    }
}
