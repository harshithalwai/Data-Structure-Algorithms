import java.util.Arrays;
import java.util.Scanner;

public class Lec75 {
    public static String maxWord(String str) {
        String ans = "";
        int maxLen = 0;
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        for(String word:words){
            if(word.length()>maxLen){
                maxLen=word.length();
                ans=word;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        maxWord(str);
    }
}
