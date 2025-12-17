class th1 extends Thread {
    public th1(String name) {
        super(name);
    }

    public void run() {
        // while (true) {
        // try {
        // Thread.sleep(2000);

        // } catch (Exception e) {
        // System.out.println(e);
        // }
        // System.out.println("Hello 1");
        // }
        for (int i = 0; i < 100; i++) {
            System.out.println("HEllo 1");
        }
    }
}

class th2 extends Thread {
    public th2(String name) {
        super(name);
    }

    public void run() {
        // while (true) {
        // try {
        // Thread.sleep(3000);

        // } catch (Exception e) {
        // System.out.println(e);
        // }
        System.out.println("Hello 2");
        // }
    }
}

public class Lec18 {
    public static void main(String[] args) {
        th1 obj1 = new th1("Harshit");
        th2 obj2 = new th2("Harshit");
        obj1.start();
        try {
            obj1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        obj2.start();
    }
}