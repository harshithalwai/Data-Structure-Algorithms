public class Lec54 {
    public static int ceil(int arr[], int target) {
        int st = 0, end = arr.length;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return st;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 6, 7, 8, 9, 10 };
        System.err.println(ceil(arr, 3));
    }
}