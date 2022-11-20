public class Employee {
    private String fullName;
    private double salary;
    private int department;
    private int id;

    private static int counter = 0;

    public Employee(String fullName, double salary, int department) {
        this.department = department;
        this.fullName = fullName;
        this.salary = salary;
        id = counter;
        counter++;
    }

    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        //return id + "." + fullName + " Номер отдела: " + department + " зарплата: " + salary;
        return String.format("%d. %s; Номер отдела: %d; Зарлата: %.2f ", id, fullName, department, salary);

    }
}
