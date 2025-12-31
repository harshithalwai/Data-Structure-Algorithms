import java.util.Scanner;

public class Lec71 {
    public static void main(String[] args) {
        // 1 4 7 11
        // 2 5 8 12
        // 3 6 9 16
        // 10 13 14 17
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

        int st = 0, end = arr.length - 1;
        System.out.println(st + " " + end);
        while (st <= end) {
            if (arr[st][end] == target) {
                System.out.println("Found at index: " + end + ", " + st);
                return;
            } else if (arr[st][end] > target) {
                end--;
            } else {
                st++;
            }
        }
        System.out.println("Found at index: " + st + ", " + end);
    }
}
