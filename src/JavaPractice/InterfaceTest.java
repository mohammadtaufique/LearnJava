package JavaPractice;

public class InterfaceTest {
    public static void main(String[] args) {
        developer dev = new developer();
        computer l = new LaptopTest();
        Desktop d = new Desktop();
        dev.devApp(d);
        dev.devApp(l);
        dev.sitting(d);
    }
}

class LaptopTest implements computer{
    public void code(){
        System.out.println("code, compile, run");
    }
}
class Desktop implements computer,tableChair{
    public void code(){
        System.out.println("code, compile, run : faster");
    }

    @Override
    public void seat() {
        System.out.println("Seat at office , Table : " +tableChair.table+" chair : "+tableChair.chair);
    }
}

class developer{
    public void devApp(computer l){
        l.code();
    }
    public void sitting(tableChair t){
        t.seat();
    }
}

interface computer{
    void code();
}
interface tableChair{
    int table =  1;
    int chair = 1;
    void seat();
}
