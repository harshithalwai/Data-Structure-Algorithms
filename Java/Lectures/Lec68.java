public class Lec68 {
    public static void main(String[] args) {
        // String customers = "YYNY";
        // String customers ="NNNNN";
        String customers = "YYYY";
        // int n = customers.length();

        // // Explanation:
        // // - Closing the shop at the 0th hour incurs in 1+1+0+1 = 3 penalty.
        // // - Closing the shop at the 1st hour incurs in 0+1+0+1 = 2 penalty.
        // // - Closing the shop at the 2nd hour incurs in 0+0+0+1 = 1 penalty.
        // // - Closing the shop at the 3rd hour incurs in 0+0+1+1 = 2 penalty.
        // // - Closing the shop at the 4th hour incurs in 0+0+1+0 = 1 penalty.
        // // Closing the shop at 2nd or 4th hour gives a minimum penalty. Since 2 is
        // // earlier, the optimal closing time is 2.
        // int minPenalty = Integer.MAX_VALUE;
        // int bestHour = -1;
        // for (int i = 0; i <= n; i++) {
        // int penalty = 0;
        // for (int j = 0; j < n; j++) {
        // if (j >= i) {
        // if (customers.charAt(j) == 'Y') {
        // penalty++;
        // }
        // } else {
        // if (customers.charAt(j) == 'N') {
        // penalty++;
        // }
        // }
        // }
        // if (penalty < minPenalty) {
        // minPenalty = penalty;
        // bestHour = i;
        // }
        // }

        int n = customers.length();

        // Initial penalty if shop closes at hour 0
        int penalty = 0;
        for (int i = 0; i < n; i++) {
            if (customers.charAt(i) == 'Y') {
                penalty++;
            }
        }

        int minPenalty = penalty;
        int bestHour = 0;

        // Try closing at hours 1 to n
        for (int i = 1; i <= n; i++) {
            char prev = customers.charAt(i - 1);

            if (prev == 'Y') {
                penalty--; // now shop is open, so no penalty
            } else {
                penalty++; // shop was open but no customer
            }

            if (penalty < minPenalty) {
                minPenalty = penalty;
                bestHour = i;
            }
        }

        System.out.println(bestHour);
    }
}
