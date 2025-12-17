package tool;

class Scientific_calculator {
    void add(int x, int y) {
        System.out.println(x + y);
    }

    public void sub(int x, int y) {
        System.out.println(x - y);
    }

    protected void mul(int x, int y) {
        System.out.println(x * y);
    }

    private void div(int x, int y) {
        System.out.println(x / y);
    }
    public void pows(int base ,int power){
        System.out.println(Math.pow(base, power));
    }
}

public class Lec13_scal {
    public static void main(String[] args) {
        Scientific_calculator obj=new Scientific_calculator();
        obj.pows(2,3);
        obj.add(2, 3);
        obj.sub(3, 2);
        obj.mul(4, 2);

    }
}
