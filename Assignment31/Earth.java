package Assignment31;

public class Earth {
    public static void main(String[] args) {
        class Africa {
            private final int area;

            public Africa(int area) {
                this.area = area;
            }

            public int getArea() {
                return area;
            }
        }
        class Antarctica {
            private final int area;

            public Antarctica(int area) {
                this.area = area;
            }

            public int getArea() {
                return area;
            }
        }
        class Australia {
            private final int area;

            public Australia(int area) {
                this.area = area;
            }

            public int getArea() {
                return area;
            }
        }
        class Eurasia {
            private final int area;

            public Eurasia(int area) {
                this.area = area;
            }

            public int getArea() {
                return area;
            }
        }
        class NorthAmerica {
            private final int area;

            public NorthAmerica(int area) {
                this.area = area;
            }

            public int getArea() {
                return area;
            }
        }
        class SouthAmerica {
            private final int area;

            public SouthAmerica(int area) {
                this.area = area;
            }

            public int getArea() {
                return area;
            }
        }
        Africa africa = new Africa(304049943);
        Antarctica antarctica = new Antarctica(3994949);
        Australia australia = new Australia(400000);
        Eurasia eurasia = new Eurasia(9990000);
        NorthAmerica northAmerica = new NorthAmerica(60070780);
        SouthAmerica southAmerica = new SouthAmerica(6777172);

        System.out.println("Площадь Африки: " + africa.getArea());
        System.out.println("Площадь Антарктиды: " + antarctica.getArea());
        System.out.println("Площадь Австралии: " + australia.getArea());
        System.out.println("Площадь Евразии: " + eurasia.getArea());
        System.out.println("Площадь Северной Америки: " + northAmerica.getArea());
        System.out.println("Площадь Южной Америки: " + southAmerica.getArea());
    }
}
