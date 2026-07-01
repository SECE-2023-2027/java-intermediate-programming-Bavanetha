import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double empSalary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Manager Name: ");
        String mgrName = sc.nextLine();

        System.out.print("Enter Manager Salary: ");
        double mgrSalary = sc.nextDouble();

        System.out.print("Enter Manager Bonus: ");
        double bonus = sc.nextDouble();

        Employee emp = new Employee(empName, empSalary);
        Manager mgr = new Manager(mgrName, mgrSalary, bonus);

        System.out.println("Employee Salary: " + emp.calculateSalary());
        System.out.println("Manager Salary: " + mgr.calculateSalary());

        sc.close();
    }
}