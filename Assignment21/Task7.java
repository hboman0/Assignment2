package Assignment21;
import java.util.Scanner;
public class Task7 {
    public static String[] strings = new String[6];

    public static void main(String[] args) {
        //write your code here
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 6; i++)
            strings[i] = input.nextLine();

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null)
                continue;
            for (int j = i + 1; j < strings.length; j++)
                if (strings[i].equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
