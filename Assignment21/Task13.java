package Assignment21;
import java.util.Scanner;

public class Task13 {
    public static int[][] array = new int[3][3];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                array[i][j] = input.nextInt();

        int max = array[0][0];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (array[i][j] > max)
                    max = array[i][j];
        System.out.println(max);

    }
}
