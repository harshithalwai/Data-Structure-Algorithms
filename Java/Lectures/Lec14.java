class a extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i!=100) {
            System.out.println("Thread 1");
            i++;
        }
    }
}
class b extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i!=100) {
            System.out.println("Thread 2");
            i++;
        }
    }
}

public class Lec14 {
    public static void main(String[] args) {
        a a1=new a();
        b b1=new b();
        a1.start();
        b1.start();
    }
}
