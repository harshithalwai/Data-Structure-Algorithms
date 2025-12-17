public class Lec37 {
    public static boolean isBadVersion(int version) {
        int badVersion = 1;
        return badVersion <= version;
    }

    public static int firstBadVersion(int n) {
        int st = 0, end = n, mid = -1, result = n;
        while (st <= end) {
            mid = st + (end - st) / 2;
            System.out.println(mid);
            System.out.println(isBadVersion(mid));
            if (isBadVersion(mid)) {
                result = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(1));
    }
}
