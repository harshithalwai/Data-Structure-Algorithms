// public class Lec59 {
//     public static String peakIdx(int[] arr) {
//         int st = 0, end = arr.length - 1;
//         while (st < end) {
//             int mid = st + (end - st) / 2;
//             if (arr[mid] > arr[mid + 1]) {
//                 end = mid;
//             } 
//             else if (arr[mid] < arr[mid + 1]) {
//                 st = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }
//         return st + " " + end;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1,2,1,3,5,6,4 };
//         System.err.println(peakIdx(arr));
//     }
// }

public class Lec59 {
    public static String peakIdx(int[] arr) {
        int st = 0, end = arr.length - 1;
        while (st < end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } 
             else {
                st = mid + 1;
            }
        }
        return st + " " + end;
    }

    public static void main(String[] args) {
        int[] arr = { 6,7,1,2,3,4,5 };
        System.out.println(peakIdx(arr));
    }
}
