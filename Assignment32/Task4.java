package Assignment32;

public class Task4 {
    public static void main(String[] args) {
    }
    //add public interfaces and a public class here - добавь public интерфейсы и public
    interface CanRun {
        public void run();
    }
    interface CanSwim {
        public void swim();
    }
    abstract class Human implements CanRun, CanSwim {

    }
}
