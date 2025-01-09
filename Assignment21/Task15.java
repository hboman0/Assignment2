package Assignment21;
import java.util.Scanner;

public class Task15 {
    public static int[][] array = new int[3][3];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                array[i][j] = input.nextInt();

        for (int i = 0; i < 3; i++)
            for (int j = i + 1; j < 3; j++) {
                int t = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = t;
    }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
