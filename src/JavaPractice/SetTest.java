package JavaPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {
        Set s = new TreeSet();
        s.add(9);
        s.add(5);
        s.add(6);
        s.add(7);
        s.add(5);

       Iterator i = s.iterator();
       while(i.hasNext()){
           System.out.println(i.next());
       }
    }
}
