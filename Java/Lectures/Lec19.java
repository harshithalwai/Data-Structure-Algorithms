import java.util.Scanner;

class exp extends Exception {

    @Override
    public String toString() {
        // return super.toString();
        return "It's my error";
    }

    @Override
    public String getMessage() {
        return "It's my message";
    }

}

public class Lec19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // System.out.println(54/0);
        if (a < 9) {
            try {
                throw new ArithmeticException("Hello babu exception here");
                // throw new exp();
            } catch (Exception e) {
                // System.out.println(e.toString());
                System.out.println(e);
                // System.out.println(e.getMessage());
                // e.printStackTrace();
            }
        }

    }
}
