package JavaPractice;

import java.util.Objects;

public class ObjectClass {
    public static void main(String[] args) {
        laptop l = new laptop();
        l.price=2000;
        l.name="Lenovo test";
        laptop l1 = new laptop();
        l1.price=2000;
        l1.name="Lenovo test";
        System.out.println(l.equals(l1));
        //System.out.println(l.toString());
    }
}

class laptop{
    int price = 1000;
    String name = "Lenovo";
    public String toString(){
        return name +" : "+ price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        laptop laptop = (laptop) o;
        return price == laptop.price && Objects.equals(name, laptop.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name);
    }
}
