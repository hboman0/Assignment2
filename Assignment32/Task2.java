package Assignment32;

public class Task2 {
    public static void main(String[] args) {
    }
    public interface CanFly {
        public void fly();
    }
    public interface CanMove {
        public void move();
    }
    public interface CanEat {
        public void eat();
    }
    public class Dog implements CanEat, CanMove {
        public void eat() {}
        public void move() {}
    }
    public class Duck implements CanFly, CanMove, CanEat {
        public void eat() {}
        public void move() {}
        public void fly() {}
    }
    public class Car implements CanMove {
        public void move() {}
    }
    public class Airplane implements CanMove, CanFly {
        public void move() {}
        public void fly() {}
    }
}
