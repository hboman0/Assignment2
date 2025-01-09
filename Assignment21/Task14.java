package Assignment21;
import java.util.Scanner;

public class Task14 {
    public static int[][] array = new int[3][3];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                array[i][j] = input.nextInt();

        int minsum = 1000000;

        for (int i = 0; i < 3; i++) {
            int rowsum = 0;
            for (int j = 0; j < 3; j++) {
                rowsum += array[i][j];
            } if (minsum > rowsum)
                minsum = rowsum;
        }

        for (int j = 0; j < 3; j++) {
            int colsum = 0;
            for (int i = 0; i < 3; i++) {
                colsum += array[i][j];
            }
            if (colsum < minsum) {
                minsum = colsum;
            }
        } System.out.println(minsum);
    }
}
