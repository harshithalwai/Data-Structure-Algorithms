public class Lec28 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                // for (int k = i; k < j; k++) {
                // System.out.print(arr[k]+" ");
                // }
                // System.out.println();
                sum += arr[j];
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}