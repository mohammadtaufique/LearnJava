package JavaPractice;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put('a',1);
        m.put("Test",123);
        m.put('Y', true);

        for(Object o : m.keySet()){
            System.out.println(o+" : "+m.get(o));
        }

    }
}
