package JavaPractice;

import static JavaPractice.Days.*;

public class EnumTest {
    public static void main(String[] args) {
        /*Status[] s = Status.values();
        for(Status ss : s) {
            System.out.println(ss+" : "+ss.ordinal());
        }*/
        Days d = Days.Sunday;
        switch (d) {
            case Monday:
                System.out.println("Today is : "+d);
                break;
            case Tuesday:
                System.out.println("Today is : "+d);
                break;
            case Wednesday:
                System.out.println("Today is : "+d);
                break;
            case Thursday:
                System.out.println("Today is : "+d);
                break;
            case Friday:
                System.out.println("Today is : "+d);
                break;
            case Saturday:
                System.out.println("Today is : "+d);
                break;
            case Sunday:
                System.out.println("Today is : "+d);
                break;
            default:
                System.out.println("No Day for you");

        }
    }
}

enum Status{
    Running,Success,Stopped,Failed;
}

enum Days{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
}
