abstract class base {
    public void greet() {
        System.out.println("Helllo greetigs...by base class");
    }

    abstract void helo();
}

class derived extends base {
    public void helo() {
        System.out.println("Hello by derived in hello");
    }
}

public class Lec9 {
    public static void main(String[] args) {
        // derived obj = new derived();
        // obj.helo();
        base obj=new derived();
        obj.greet();
        obj.helo();
    }
}
