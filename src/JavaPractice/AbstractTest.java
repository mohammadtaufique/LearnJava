package JavaPractice;

public class AbstractTest {
    public static void main(String[] args) {
        Vehicle v1 = new Cycle();
        Vehicle v2 = new Car();
        v1.move();
        v1.stop();
        v2.move();
        v2.stop();
    }
}

abstract class Vehicle{
    public abstract void move();
    public void stop(){
        System.out.println("Press Break!!!!!");
    }
}

class Cycle extends Vehicle{

    @Override
    public void move() {
        System.out.println("moves in 2 wheels");
    }
}

class Car extends Vehicle{

    @Override
    public void move() {
        System.out.println("Moves in 4 wheels");
    }
}
abstract class tempo extends Vehicle{

}
