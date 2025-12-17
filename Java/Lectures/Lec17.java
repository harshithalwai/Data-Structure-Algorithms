class th extends Thread {
    public th(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Hello");
    }
    public void run1() {
        System.out.println("Hello 1");
    }
}

public class Lec17 {
    public static void main(String[] args) {
        th obj=new th("Harshit");
        obj.start();
        obj.run1();
        System.out.println(obj.threadId());
        System.out.println(obj.getName());
    }
}