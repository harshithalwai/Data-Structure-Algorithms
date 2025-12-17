
public class Lec27 {
    public static int binarySearch(int[] arr, int key) {
        int st = 0, end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                st = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 1;
        int result = binarySearch(arr, key);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}