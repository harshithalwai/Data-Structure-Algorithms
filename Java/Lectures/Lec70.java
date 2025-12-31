import java.util.Scanner;

public class Lec70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1 = sc.nextInt();
        int row2 = sc.nextInt();
        int col1 = sc.nextInt();
        int col2 = sc.nextInt();

        int[][] arr1 = new int[row1][col1];
        int[][] arr2 = new int[row2][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        if (col1 != row2) {
            System.out.println("Invalid input ! Matrices cannot be multiplied.");
            return;
        }
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print("[" + i + "][" + j + "] ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print("[" + i + "][" + j + "] ");
            }
            System.out.println();
        }

        // int[][] result = new int[row1][col2];

        // for (int i = 0; i < row1; i++) {
        //     for (int j = 0; j < col2; j++) {
        //         result[i][j] = 0;
        //         for (int k = 0; k < col1; k++) {
        //             result[i][j] += arr1[i][k] * arr2[k][j];
        //         }
        //     }
        // }
    }
}
