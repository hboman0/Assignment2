package Assignment21;
import java.util.Scanner;
public class Task6 {
    public static int[] array;
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        array = new int[N];

        for (int i = 0; i < N; i++)
            array[i] = input.nextInt();
        int max = 0;
        for (int i = 1; i < N; i++) {
            if (array[i] > max)
                max = array[i];
        } System.out.println(max);
    }
}
