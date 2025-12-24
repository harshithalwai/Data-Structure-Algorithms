public class Lec58 {

    public static int ceil(int arr[], int target) {
        int st = 0, end = arr.length - 1;
        if (target > arr[end]) {
            return arr[0];
        }
        int ans = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] >= target) {
                ans = arr[mid]; // possible ceil
                end = mid - 1; // search left
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 8, 10, 15 };

        System.out.println(ceil(arr, 8)); // 8
        System.out.println(ceil(arr, 6)); // 8
        System.out.println(ceil(arr, 100)); // -1
    }
}
