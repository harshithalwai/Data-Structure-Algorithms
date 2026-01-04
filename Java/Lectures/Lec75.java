import java.util.Arrays;
import java.util.Scanner;

public class Lec75 {
    public static String maxWord1(String str) {
        String ans = "";
        int maxLen = 0;
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        for (String word : words) {
            if (word.length() > maxLen) {
                maxLen = word.length();
                ans = word;
            }
        }
        return ans;
    }

    public static String maxWord(String str) {
        String ans = "";
        String word = "";
        int len = 0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (word.length() > len) {
                    ans = word;
                    len = word.length();
                }
                word = "";
            } else {
                word += ch;
            }
        }
        if (word.length() > 0) {
            if (word.length() > len) {
                ans = word;
                len = word.length();
            }
            word = "";
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(maxWord(str));
    }
}
