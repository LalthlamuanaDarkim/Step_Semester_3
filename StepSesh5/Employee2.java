package StepSesh5;

public class Employee2 {

    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    Employee2(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    void printEmployeeInfo() {
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + companyName);
        System.out.println();
    }

    static void printCompanyInfo() {
        System.out.println("Company: " + companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {

        Employee2 e1 = new Employee2("John", 50000);
        Employee2 e2 = new Employee2("Sarah", 60000);
        Employee2 e3 = new Employee2("Mike", 55000);

        e1.printEmployeeInfo();
        e2.printEmployeeInfo();
        e3.printEmployeeInfo();

        Employee2.printCompanyInfo();
    }
}