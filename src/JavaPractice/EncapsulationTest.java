package JavaPractice;

public class EncapsulationTest {
    public static void main(String[] args) {
        Human h = new Human();
        Human h1 = new Human(25,"john");

        h.setName("Test");
        h.setAge(34);
        System.out.println(
                h.getName()+" : "+h.getAge()
        );
        System.out.println(
                h1.getName()+" : "+h1.getAge()
        );
    }
}

class Human{

    private int age;
    private String name;

    public Human(){
        name = "Testing";
        age = 15;
        System.out.println("In Default constructor");
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("In Parameterised constructor");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
