package JavaPractice;

public class Calculator {
    public static void main(String[] args) {
        addition add = new addition();
        System.out.println(add.Add(5,10,20));
    }
}

class addition{
    public int Add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int Add(int a, int b,int c){
        return a+b+c;
    }
    public double Add(double a, int b){
        return a+b;
    }

}
