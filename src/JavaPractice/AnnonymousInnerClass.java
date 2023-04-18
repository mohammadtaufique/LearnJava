package JavaPractice;

public class AnnonymousInnerClass {
    public static void main(String[] args) {
        abc x = new abc()
        {
            public void show()
            {
                System.out.println("in new class");
            }
        };
        x.show();
    }
}
class abc{
    public void show(){
        System.out.println("in A class");
    }
}
