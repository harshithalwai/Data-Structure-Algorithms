// public class Lec47 {
//  public static void main(String[] args) {
//     String []strs = {"flower","flow","flight"};

//     String prefix = strs[0];
//     for(int i=1;i<strs.length;i++){
//         while(strs[i].indexOf(prefix)!=0){
//             prefix=prefix.substring(0,prefix.length()-1);
            
//         }
//     }
//     System.out.println(prefix);
//  }   
// }


// public class Lec47 {
//     public static String substr(String s) {
//         String result = "";
//         for (int i = 0; i < s.length() - 1; i++) {
//             result += s.charAt(i);
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         String[] strs = { "flower", "flow", "flight" };

//         String prefix = strs[0];
//         for (int i = 1; i < strs.length; i++) {
//             while (strs[i].indexOf(prefix) != 0) {
//                 prefix = substr(prefix);
//             }
//         }
//         System.out.println(prefix);
//     }
// }


import java.util.Arrays;

public class Lec47 {
    public static String substr(String s,int st,int end) {
        String result = "";
        for (int i = 0; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        Arrays.sort(strs); 
        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        System.out.println(substr(first,0, i));
    }
}
