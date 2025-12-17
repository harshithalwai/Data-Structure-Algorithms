public class Lec2 {
    public static int sum(int x, int y) {
        return x + y;
    }

    public static int minu(int x, int y) {
        return x - y;
    }

    int mul(int x, int y) {
        return x * y;
    } 

    public static int div(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {
        // System.out.println(mul(2, 3));
        Lec2 obj = new Lec2();
        System.out.println(obj.mul(2, 3));
    }
}
