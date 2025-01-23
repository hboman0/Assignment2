package Assignment31;

public class Programmer {
    private int salary = 1000;
    public int getSalary() {
        return salary;
    }

    public void setSalary(int newsalary) {
        if (newsalary > salary)
            this.salary = newsalary;
    }
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.setSalary(700);
        System.out.println(programmer.getSalary());

        programmer.setSalary(2000);
        System.out.println(programmer.getSalary());
    }
}
