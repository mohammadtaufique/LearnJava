package JavaPractice;

public class StringClass {
    public static void main(String[] args) {
        Testing t1 = new Testing();

        /*t1.t = 5;
        t1.name=5;
        Testing.value = 99;
        t1.show();*/
        try {
            Class.forName("Testing");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}

class Testing{
    int t;
    int name;
    static int value=99;

    public void show(){
        System.out.println(t+":"+name+":"+value);
    }
    public Testing(){
        t=5;
    }
    static
    {
        System.out.println("Testing Static block");
    }
}
