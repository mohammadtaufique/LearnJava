package JavaPractice;

public class InnerClass {
    int a=10;

    public static void main(String[] args) {
        InnerClass I = new InnerClass();
        I.show();
        InnerClass.B iB = (new InnerClass()).new B();
        iB.config();
        InnerClass.C iC = new InnerClass.C();
        iC.demo();
    }
    public void show(){
        System.out.println("IN Show");
    }
    class B{
        public void config(){
            System.out.println("in class B");
        }
    }
    static  class C{
        public void demo(){
            System.out.println("in static class c");
        }
    }
}
