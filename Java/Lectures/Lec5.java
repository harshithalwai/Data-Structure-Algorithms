import java.util.Scanner;

class circle {
    private double rad;

    public void setRad() {
        Scanner sc = new Scanner(System.in);
        rad = sc.nextDouble();
    }

    public double  getRad() {
        return (rad*rad*3.14);
    }
}

public class Lec5 {
    public static void main(String[] args) {
        circle obj1 = new circle();
        obj1.setRad();
        System.out.println(obj1.getRad());
    }
}