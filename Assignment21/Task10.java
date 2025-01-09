package Assignment21;
import java.util.Scanner;

public class Task10 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        multiArray = new int[N][];

        for (int i = 0; i < N; i++) {
            int col = input.nextInt();
            multiArray[i] = new int[col];
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print("[] ");
            }
            System.out.println();
        }
    }
}
