package Assignment31;

public class Skyscraper2 {
    public static final String SKYSCRAPER_WAS_BUILD = "Skyscraper is built.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT =
            "Skyscraper is built. The number of floors - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER =
            "Skyscraper is built. Developer - ";
    public String skyscraper;
    public int skyscraperTower;
    public String skyscraperSkyline;

    //write your code here
    Skyscraper2() {
        this.skyscraper = SKYSCRAPER_WAS_BUILD;
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }
    Skyscraper2(int skyscraperTower) {
        this.skyscraperTower = skyscraperTower;
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + skyscraperTower);
    }
    Skyscraper2(String skyscraperSkyline) {
        this.skyscraperSkyline = skyscraperSkyline;
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + skyscraperSkyline);
    }

    public static void main(String[] args) {
        Skyscraper2 skyscraper = new Skyscraper2();
        Skyscraper2 skyscraperTower = new Skyscraper2(50);
        Skyscraper2 skyscraperSkyline = new Skyscraper2("JavaRushDevelopment");
    }
}
