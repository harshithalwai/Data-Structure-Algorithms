public class Lec64 {
    public static int binSearch(int[] arr, int target, int st, int end) {
        end = Math.min(target, end);
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
                28, 29, 30, 31, 32 };
        int st = 0, end = 1;
        int target = 31;
        while ( end < arr.length && target > arr[end] ) {
            int newSt = end + 1;
            // new end will be
            // end =end +size of the box
            end = end + (end - st + 1) * 2;
            st = newSt;
        }
        System.err.println(binSearch(arr, target, st, end));
    }
}
