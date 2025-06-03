public class Employee {
    private final String name;
    private final double baseSalary;
    private final double sales;

    public Employee(String name, double baseSalary, double sales) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.sales = sales;
    }

    public double calculateTotalSalary() {
        return baseSalary + (sales * 0.15);
    }

    public String getName() {
        return name;
    }
}