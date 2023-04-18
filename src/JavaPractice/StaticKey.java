package JavaPractice;

public class StaticKey {
    public static void main(String[] args) throws ClassNotFoundException {
        /*Mobile.name = "Phone";
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        m1.brand="Apple";
        //m1.name = "SmartPhone";
        m1.price = 1500;*/
        //m1.show();
        Class.forName("JavaPractice.Mobile"); //Class loader class

    }
}
class Mobile{
    String brand;
    int price;
    static String name;
    public Mobile(){
        brand="";
        price=2000;
        System.out.println("In constructor");
    }
    static{
        name="phone";
        System.out.println("In Static Block");
    }
    public void show(){
        System.out.println(brand +" : "+price+" : "+name);
    }

}
