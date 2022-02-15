public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary()
    {
        return(grossSalary-tax);
    }
    public double IncreaseSalary(double percentagem)
    {
        return ((percentagem/100)*grossSalary+NetSalary());
    }
}
