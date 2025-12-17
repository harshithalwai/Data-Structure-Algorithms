class a implements Runnable {
    public void run() {
        int i = 0;
        while (i != 100) {
            System.out.println("Thread 1");
            i++;
        }
    }
}

class b implements Runnable {
    public void run() {
        int i = 0;
        while (i != 100) {
            System.out.println("Thread 2");
            i++;
        }
    }
}

public class Lec15 {
    public static void main(String[] args) {
        a a1 = new a();
        Thread thread1 = new Thread(a1);
        b b1 = new b();
        Thread thread2 = new Thread(b1);

        thread1.start();
        thread2.start();
    }
}
