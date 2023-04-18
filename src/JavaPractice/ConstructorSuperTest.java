package JavaPractice;

public class ConstructorSuperTest {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A{
    public A() {
        System.out.println("in A");
    }
    public A(int i) {
        System.out.println("in A int");
    }

}

class B extends A{
    public B() {
        this(5);
        //super();

        System.out.println("in B");
    }

    public B(int i) {
        super(i);
        //this();
        System.out.println("in B int");
    }
}
