package Assignment4;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String fullName;
    private String position;
    private double salary;
    private Department department;

    public Employee(String fullName, String position, double salary, Department department) {
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
        this.department = department;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee: " + fullName + ", Position: " + position + ", Salary: " + salary + ", Department: " + department.getName();
    }
}

class Department {
    private String name;
    private Company company;
    private List<Employee> employees;

    public Department(String name, Company company) {
        this.name = name;
        this.company = company;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public int getNumberOfEmployees() {
        return employees.size();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public String toString() {
        return "Department: " + name + ", Employees: " + employees.size();
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    public Employee findEmployeeByName(String fullName) {
        for (Department dept : departments) {
            for (Employee emp : dept.getEmployees()) {
                if (emp.getFullName().equalsIgnoreCase(fullName)) {
                    return emp;
                }
            }
        }
        return null;
    }
}

class EnterpriseStructure {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department devDept = new Department("Development", company);
        Department hrDept = new Department("Human Resources", company);

        company.addDepartment(devDept);
        company.addDepartment(hrDept);

        Employee emp1 = new Employee("Alice Johnson", "Software Engineer", 70000, devDept);
        Employee emp2 = new Employee("Bob Smith", "Backend Developer", 75000, devDept);
        Employee emp3 = new Employee("Charlie Brown", "HR Manager", 65000, hrDept);

        devDept.addEmployee(emp1);
        devDept.addEmployee(emp2);
        hrDept.addEmployee(emp3);

        System.out.println("Employees in Development Department:");
        for (Employee emp : devDept.getEmployees()) {
            System.out.println(emp);
        }
        System.out.println("Total Employees in Development: " + devDept.getNumberOfEmployees());
        
        String searchName = "Bob Smith";
        Employee foundEmployee = company.findEmployeeByName(searchName);
        if (foundEmployee != null) {
            System.out.println("\nEmployee found: " + foundEmployee);
        } else {
            System.out.println("\nEmployee not found.");
        }
    }
}
