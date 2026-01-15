public class Lec87 {
    public static boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
               ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
    }
    public static boolean isUpper(char ch){
        return ch>='A' && ch<='Z';
    }
    public static void main(String[] args) {
        String str="Hello my name is Harshit";
        int up=0,low=0;
        for (int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(isUpper(ch)){
                up++;
            }else{
                low++;
            }
        }
        System.out.println(up);
        System.out.println(low);
        System.out.println(str.length());
    }
}
