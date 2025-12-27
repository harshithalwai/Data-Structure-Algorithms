import java.util.Scanner;

public class Lec66 {
    // spiral print
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(), col = sc.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int row_start = 0, row_end = row - 1, col_start = 0, col_end = col - 1;

        // printing
        while (row_start <= row_end && col_start <= col_end) {
            // upper row (Col wise)
            for (int cl = col_start; cl <= col_end; cl++) {
                System.out.print(arr[row_start][cl] + " ");
            }
            row_start++;

            // left col (row wise)
            for (int rw = row_start; rw <= row_end; rw++) {
                System.out.print(arr[rw][col_end] + " ");
            }
            col_end--;

            for (int cl = col_end; cl >= col_start; cl--) { 
                System.out.print(arr[row_end][cl] + " ");
            }
            row_end--;
            for (int rw = row_end; rw >= row_start; rw--) {
                System.out.print(arr[rw][col_start] + " ");
            }
            col_start++;
        }

    }
}
