import java.util.Scanner;

public class Lec62 {
    public static boolean vaildPar(String inp) {
        int paran = 0, brak = 0, curly = 0;
        for (int i = 0; i < inp.length(); i++) {
            char ch = inp.charAt(i);
            switch (ch) {
                case '(':
                    paran++;
                    break;
                case '[':
                    brak++;
                    break;
                case '{':
                    curly++;
                    break;
                case ')':
                    paran--;
                    break;
                case '}':
                    curly--;
                    break;
                case ']':
                    brak--;
                    break;
                default:
                    break;
            }
        }
        return (paran == 0 && curly == 0 && brak == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println(vaildPar("{{[()]}}"));
    }
}
