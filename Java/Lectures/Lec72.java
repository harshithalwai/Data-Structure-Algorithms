import java.util.Scanner;
// 4 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16
public class Lec72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();

    }
}
