package JavaPractice;

public class WrapperClass {
    public static void main(String[] args) {
        int b = 88;
        Integer i = b; //autoboxing
        int a = i;//auto-unboxing
        System.out.println(a);

        String s = "99";
        int x = Integer.valueOf(s);
        int y = Integer.parseInt(s);
        System.out.println(x/11);
        System.out.println(y+1);
    }
}
