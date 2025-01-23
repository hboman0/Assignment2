package Assignment31;

import java.util.Arrays;

public class Memory {
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32",
                null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }
    public static void executeDefragmentation(String[] array) {
        //напишите тут ваш код
        int position = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[position] = array[i];
                position++;
            }
            }
        for (int i = position; i < array.length; i++) {
            array[i] = null;
        }
    }
}
