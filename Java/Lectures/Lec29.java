class Lec29 {
    public int lengthOfLastWord(String s) {
        int i = s.length()-1;
        while(i >=0){
            if(s.charAt(i) !=' '){
                break;
            }
            i--;
        }
        if(i >= 0){
            int j = i;
            while(j >=0){
                if(s.charAt(j) == ' '){
                    break;
                }
                j--;
            }
            return i - j;
        }
        return 0;
    }
    public static void main(String[] args) {
        Lec29 obj = new Lec29();
        String s = "Hello World                        ";
        System.out.println(obj.lengthOfLastWord(s)); // Output: 5
    }
}