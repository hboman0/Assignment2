package Assignment21;
import java.util.Scanner;

public class Task16 {
    public static char[][] array;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        array = new char[N][N * 2 - 1];

        for (int i = 0; i < N; i++) {
            int start = N - i - 1;
            int end = N + i - 1;

            for (int j = 0; j < array[i].length; j++) {
                if (j >= start && j <= end) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

}
