package Assignment22;

public class Task6 {
    public static void main(String[] args) {
        // Example calls to the universalMethod
        universalMethod();
        universalMethod(556);
        universalMethod("Hello");
        universalMethod(3.14);
        universalMethod("SE", 31);
        universalMethod(122, 944);
        universalMethod(true);
        universalMethod('A');
        universalMethod(5L);
        universalMethod(new int[]{1, 2, 3});
    }

    public static void universalMethod() {
        System.out.println("No parameters");
    }

    public static void universalMethod(int number) {
        System.out.println("Integer parameter: " + number);
    }

    public static void universalMethod(String text) {
        System.out.println("String parameter: " + text);
    }

    public static void universalMethod(double value) {
        System.out.println("Double parameter: " + value);
    }

    public static void universalMethod(String text, int number) {
        System.out.println("String and Integer parameters: " + text + ", " + number);
    }

    public static void universalMethod(int number1, int number2) {
        System.out.println("Two Integer parameters: " + number1 + ", " + number2);
    }

    public static void universalMethod(boolean flag) {
        System.out.println("Boolean parameter: " + flag);
    }

    public static void universalMethod(char character) {
        System.out.println("Character parameter: " + character);
    }

    public static void universalMethod(long largeNumber) {
        System.out.println("Long parameter: " + largeNumber);
    }

    public static void universalMethod(int[] array) {
        System.out.print("Array parameter: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
