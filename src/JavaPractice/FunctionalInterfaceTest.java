package JavaPractice;

import org.w3c.dom.ls.LSOutput;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        //Lamda interface implementation
        show s = i -> System.out.println("in show " + i);
        s.show(5);

        //Normal Functional interface implementation
        config c = new config() {
            @Override
            public void config() {
                System.out.println("in config");
            }

            @Override
            public void show(int i) {
                System.out.println("in show " + i);
            }
        };
        c.config();
        c.show(6);

        //Lamda interface implementation
        add a = (i,j) -> i + j;
        System.out.println(a.add(2,3));
    }
}

@FunctionalInterface
interface show{
    void show(int i);

}
interface config extends show{
    void config();
}
@FunctionalInterface
interface add{
    int add(int i,int j);
}
