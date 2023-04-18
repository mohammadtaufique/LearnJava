package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("35");
        l.add("999");
        l.add("6598725");
        l.add("1254");
        l.add("9858748569");
        Comparator<String> com =( o1, o2) -> o1.length()>o2.length()?1:-1;
        Collections.sort(l,com);
        System.out.println(l);


        List<StudentTest> S = new ArrayList<>();
        S.add(new StudentTest("Test1",12));
        S.add(new StudentTest("Test5",15));
        S.add(new StudentTest("Test9",10));
        S.add(new StudentTest("Test11",9));
        Collections.sort(S);
        for(StudentTest s : S){
            System.out.println(s);
        }
    }
}

class StudentTest implements Comparable<StudentTest>{
    String name;
    int age;
    public StudentTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name +" : "+ age;
    }
    @Override
    public int compareTo(StudentTest that) {
        return this.age>that.age? 1: -1;
    }

}
