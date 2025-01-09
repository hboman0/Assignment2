package Assignment21;

public class Task12 {
    public static int[][] array;
    public static void main(String[] args) {
        array = new int[2][];

        for (int i = 0; i < array.length; i++)
            array[i] = new int[3];

        int value = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
