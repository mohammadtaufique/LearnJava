package JavaPractice;

public class TernaryOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        int z = 5;
        int r = (((x > y) && (x > z)) || (y < z)) ? 50 : 100;
        System.out.println(r);
    }
}
