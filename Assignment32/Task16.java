package Assignment32;

import java.awt.*;

public class Task16 {
    public static void main(String[] args) throws Exception {
    }
    public interface Animal {
        Color getColor();
        Integer getAge();
    }
    public static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
        public Color getColor() {
            return null;
        }
        public Integer getAge() {
            return null;
        }
    }
}
