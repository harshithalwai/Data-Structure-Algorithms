class st {
    public void func() {
        System.out.println("first");

    }
}

class en extends st {
    @Override
    public void func() {
        System.out.println("second");
    }
}

public class Lec33 {
    public static void main(String[] args) {
        en obj = new en();
        obj.func();
    }
}
