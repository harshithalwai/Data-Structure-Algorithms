class Solution {
    public static int peakIdx(int[] arr) {
        int st = 0, end = arr.length - 1;
        while (st < end) {
            int mid = st + (end - st) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            else if (mid > st && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            else if (arr[mid] < arr[0]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return -1;
    }

    public static int binSearch(int[] arr, int target, int st, int end) {

        while (st <= end) {

            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {

                return mid;

            }

            else if (arr[mid] < target) {

                st = mid + 1;

            } else {

                end = mid - 1;

            }

        }

        return -1;

    }

    public static int search(int[] nums, int target) {

        int peak = peakIdx(nums);

        if (peak != -1) {

            if (binSearch(nums, target, 0, peak) != -1) {

                return binSearch(nums, target, 0, peak);

            } else {

                return binSearch(nums, target, peak + 1, (nums.length - 1));

            }

        } else {

            return binSearch(nums, target, 0, (nums.length - 1));

        }

    }
}