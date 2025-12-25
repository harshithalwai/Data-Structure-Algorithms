public class Lec63 {
    public static int first(int arr[], int target) {
        int st = 0, end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.err.println(st + " " + end);
        return st;
    }

    public static int last(int arr[], int target) {
        int st = 0, end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                st = mid + 1;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.err.println(st + " " + end);
        return end;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 5, 5, 5, 7, 8, 9 };
        System.out.println(first(arr, 5));
        System.out.println(last(arr, 5));
    }
}
