public class Lec81 {
    public static int majorityElement(int[] arr) {
        int ans = arr[0];
        int freq = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == ans) {
                freq++;
            } else {
                freq--;
            }
            if (freq == 0) {
                ans = arr[i];
                freq = 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1 };
        System.out.println(majorityElement(arr));
    }
}
