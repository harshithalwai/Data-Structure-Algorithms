import java.util.Scanner;

class shape {
    double x;

    shape() {
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
    }

    public double getRad() {
        return (x);
    }
}

class circle extends shape {
    double r;

    circle() {
        r = x;
    }

    public void area() {
        System.out.println(r * r * 3.14);
    }
}

public class Lec6 {
    public static void main(String[] args) {
        circle obj1 = new circle();
        obj1.area();
    }
}
