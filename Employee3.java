package edureka_project1;

public class Employee3 {

    private double basicSalary;
    private double specialAllowance;
    private double HRA;

    public void calculateSalary(){
        double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * HRA/100);

        System.out.println("Calculated Salary : " + salary);
    }

    public static void main(String[] args) {
        Employee3 employee3 = new Employee3();
        employee3.basicSalary = 50000;
        employee3.specialAllowance = 10;
        employee3.HRA = 20;
        employee3.calculateSalary();
    }
}
