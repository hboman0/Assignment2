package Assignment31;

public class Building {
    private String type;

    public void initialize(String type) {
        this.type = type;
    }
    //write your code here
    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Restaurant");
        building.initialize("Barbershop");
    }
}
