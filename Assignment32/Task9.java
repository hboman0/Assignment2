package Assignment32;

public class Task9 {
    public static void main(String[] args) throws Exception {

    }
    interface CanMove {
        Double speed();
    }
    interface CanFly extends CanMove {
        public Double speed(CanFly y);
    }
}
