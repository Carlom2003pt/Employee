import java.util.Scanner;
public class ProgEmployee {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.name=sc.nextLine();
        System.out.print("Salary: ");
        emp.grossSalary=sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax=sc.nextDouble();
        System.out.println("Employee: " + emp.name + ", Salary: " + emp.NetSalary());

        System.out.print("Which percentage to increase salary?: ");
        double percentage = sc.nextDouble();
        System.out.println("Updated data: " + emp.name + ", Salary: " + emp.IncreaseSalary(percentage));
    }
}
