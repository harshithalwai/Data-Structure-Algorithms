import java.util.Arrays;
import java.util.Scanner;

public class Lec69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(), col = sc.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // method : 1
        // int[][] transpose = new int[col][row];
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // transpose[i][j] = arr[j][i];
        // }
        // }

        // method : 2
        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
