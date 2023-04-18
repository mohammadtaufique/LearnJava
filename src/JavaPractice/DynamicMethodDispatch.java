package JavaPractice;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Aa obj = new Aa(); //parent class reference parent class object
        obj.show();
        obj = new Bb();//parent class reference child class object
        obj.show();
        obj = new Cc();//parent class reference child class object
        obj.show();
    }
}
class Aa{
    public void show(){
        System.out.println("in A show");
    }
}
class Bb extends Aa{
    public void show(){
        System.out.println("in B show");
    }
}
class Cc extends Aa{
    public void show(){
        System.out.println("in C show");
    }
}
