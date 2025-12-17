import java.util.Arrays;

public class Lec48 {
    public static String[] reverse(String []s){
        int n=s.length;
        for (int i = 0; i < n/2; i++) {
            String temp=s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=temp;
        }
        return s;
    }
    public static void main(String[] args) {
        String []s = {"h","e","l","l","o"};
        System.err.println(Arrays.toString(reverse(s)));
    }
}
