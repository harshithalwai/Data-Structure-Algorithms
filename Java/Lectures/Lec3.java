public class Lec3 {
    public static int sums(int... arr) {
        int sum = 0;
        for (int ele : arr) {
            sum += ele;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sums(1,2,3,4,5));
    }
}
