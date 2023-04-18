package JavaPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(5);
        l.add("test");
        l.add(true);
        l.add(5.5);
        l.add(3,false);

        System.out.println(l.size());
        Iterator i = l.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
