import java.util.Scanner;

public class Lec25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int mx = arr[0], second_mx = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] != mx) && (arr[i] > second_mx)) {
                second_mx = arr[i];
            }
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == second_mx) {
                count++;
            }
        }
        if ((mx==second_mx)||(count>1)||(second_mx==Integer.MIN_VALUE)) {
            System.out.println(-1);
        }else{
            System.out.println(mx +" " +second_mx);
        }
        

    }
}