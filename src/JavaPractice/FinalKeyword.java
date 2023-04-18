package JavaPractice;

import org.w3c.dom.ls.LSOutput;

public class FinalKeyword {
    public static void main(String[] args) {
        final double pi = 3.14; //final variable
        //pi = 4;
    }

}

final class test{
    public void testing(){
        System.out.println("final class");
    }
}
/*
class test1 extends test{
    public void testing1(){
        System.out.println("can inherit, as class is final");
    }
}
*/

class test2{
    public final void show(){
        System.out.println("final method");
    }

    public void show(int i){
        System.out.println("final : "+i);
    }
}

/*class test3 extends test2{
    public void show(){
        System.out.println("cant override as method is final");
    }
}*/
