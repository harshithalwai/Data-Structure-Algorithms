class phone {
    public void greet() {
        System.out.println("Hello ! Welcome to phone....");
    }

    public void name() {
        System.out.println("Hello ! I'm a Phone ");
    }
}

class smartPhone extends phone {
    public void greeting() {
        System.out.println("Hello ! Welcome to Smart phone....");
    }
    @Override
    public void name() {
        System.out.println("Hello ! I'm a Smart Phone ");
    }
}

public class Lec8 {
    public static void main(String[] args) {
        // phone obj1 = new phone();
        // obj1.greet();
        // obj1.name();

        // smartPhone obj2 = new smartPhone();
        // obj2.greet();
        // obj2.name();

        phone obj3=new smartPhone();
        obj3.greet();
        // obj3.greeting(); //its giving error
        obj3.name();
    }
}
