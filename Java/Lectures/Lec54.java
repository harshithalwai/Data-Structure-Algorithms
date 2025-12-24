public class Lec54 {
    public static int acsBinSrch(int arr[], int target) {
        int st = 0, end = arr.length;
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
    public static int descBinSrch(int arr[], int target) {
        int st = 0, end = arr.length;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.err.println(arr[0]>arr[arr.length-1] ? descBinSrch(arr, 3) : acsBinSrch(arr, 7));
    }
}