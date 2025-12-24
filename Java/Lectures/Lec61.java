import java.util.Arrays;

public class Lec61 {
    public static void main(String[] args) {
        int[] apple = { 5, 5, 5 };
        int[] capacity = { 2, 4, 2, 7 };
        int target = 0;
        for (int i = 0; i < apple.length; i++) {
            target += apple[i];
        }
        int count = 0;
        Arrays.sort(capacity);
        for (int i = capacity.length - 1; i >= 0 && target > 0; i--) {
            target -= capacity[i];
            count++;
            if (target <= 0) {
                break;
            }
        }
        System.err.println(count);
    }
}
