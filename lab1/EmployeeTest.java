package lab1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee empTest = new Employee("John ","Doe", 20000);
        System.out.println("Original Salary: "+empTest.getMonthlySalary());
        empTest.setMonthlySalary(-5000);
        System.out.println("After invalid update: "+empTest.getMonthlySalary());
        empTest.setMonthlySalary(25000);
        System.out.println("After valid update: "+empTest);

        System.out.println("------------------");
        Employee emp1 = new Employee("Alice", "Smith",30000);
        Employee emp2 = new Employee("Bob","Johnson",40000);

        System.out.println(emp1.getFirstName()+"'s Yearly Salary: "+emp1.getYearlySalary());
        System.out.println(emp2.getFirstName()+"'s Yearly Salary: "+emp2.getYearlySalary());

        System.out.println("----------------");
        System.out.println("Giving 10% raise to both employees...");
        emp1.giveRaise(10);
        emp2.giveRaise(10);

        System.out.println(emp1.getFirstName()+"'s New Yearly Salary: "+emp1.getYearlySalary());
        System.out.println(emp2.getFirstName()+"'s New Yearly Salary: "+emp2.getYearlySalary());
    }
}
