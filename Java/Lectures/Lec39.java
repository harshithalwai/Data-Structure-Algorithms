public class Lec39 {
    public static char search(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                end = mid - 1;
            System.out.println("Mid true " + mid);
            } else {
                start = mid + 1;
            System.out.println("Mid false " + mid);
            }
        }
        System.out.println("Start " + start+" End "+end);
        return arr[start % arr.length];
    }

    public static void main(String[] args) {
        char[] arr = { 'c', 'd', 'f', 'j' };
        System.out.println(search(arr, 'z'));
    }
}
