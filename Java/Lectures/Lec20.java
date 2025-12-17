class negRad extends Exception {

    @Override
    public String toString() {
        return "please enter a positive number";
    }

    @Override
    public String getMessage() {
        return "You entered a negative number";
    }

}

public class Lec20 {
    public static double pr(int r) throws negRad{
        if (r<0) {
            throw new negRad();
        }
        double area=Math.PI*r*r;
        return area;
    }
    public static void main(String[] args) {
        try {
            System.out.println(pr(-1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
