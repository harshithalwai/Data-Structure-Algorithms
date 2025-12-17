class Lec49 {
    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();

        for (int start = 0; start < arr.length; start += 2 * k) {

            int i = start;
            int j = Math.min(start + k - 1, arr.length - 1);

            // reverse characters from i to j
            while (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        String result = new String(arr);
        return result;
    }
    public static void main(String[] args) {
        System.err.println(reverseStr("abcdefg", 2));
    }
}
