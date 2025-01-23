package Assignment31;

public class Hedgehog {
    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }
    public static void main(String[] args) {
        //напишите тут ваш код
        Hedgehog a = new Hedgehog();
        Apple b = new Apple();
        a.eat(b);
    }
    public static class Apple {
    }
}
