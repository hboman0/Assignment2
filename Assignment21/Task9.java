package Assignment21;

public class Task9 {
    public static int[][] result = new int[10][];
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            result[i] = new int[i + 1];

        for (int i = 0; i < 10; i++)
            for (int j = 0; j <= i; j++)
                result[i][j] = i + j;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
