

interface base {
    void meth1();

    void meth2();
}

interface derived extends base {
    default void meth(){
        System.out.println("Hello ");
    }
    default void meth(int x){
        System.out.println("Hello "+x);
    }
    default void meth(int x,int y){
        System.out.println("Hello "+x+y);
    }
    default void methx(int x,int y){
        System.out.println("Hello "+(x+y));
    }
    void meth3();

    void meth4();
}

class child implements derived {
    public void meth1() {
        System.out.println("Hello 1");
    }

    public void meth2() {
        System.out.println("Hello 2");
    }

    public void meth3() {
        System.out.println("Hello 3");
    }

    public void meth4() {
        System.out.println("Hello 4");
    }
}

public class Lec11 {
    public static void main(String[] args) {
        child obj = new child();
        obj.meth(1,2);
        
    }
}
