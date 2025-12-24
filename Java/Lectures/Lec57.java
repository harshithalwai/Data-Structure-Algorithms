import java.util.Arrays;
import java.util.Scanner;

public class Lec57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // array initilization normally
        // int [][]arr=new int[][]{
        // {1,2,3},
        // {4,5,6},
        // {7,8,9}
        // };

        // 2d array
        int m = sc.nextInt(), n = sc.nextInt();
        char arr[][] = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        // // jacked array
        // System.out.print("Enter the value of row : ");
        // int row = sc.nextInt();
        // int arr[][] = new int[row][];
        // for (int i = 0; i < row; i++) {
        // System.out.print("Enter the col len of arr[" + i + "][] : ");
        // arr[i] = new int[sc.nextInt()];

        // }
        System.err.println(Arrays.deepToString(arr));
    }
}
