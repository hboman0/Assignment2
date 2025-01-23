package Assignment31;

public class Iphone {
    private String model;
    private String color;
    private int price;
    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    //write your code here
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Iphone))
            return false;

        Iphone second = (Iphone) obj;

        return this.model == second.model && this.color == second.color && this.price ==second.price;
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);
        System.out.println(iphone1.equals(iphone2));
    }
}
