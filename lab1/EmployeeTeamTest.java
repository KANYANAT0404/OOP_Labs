package lab1;

public class EmployeeTeamTest {
    public static void main(String[] args) {
        Employee boss = new Employee("David","Miller",80000);
        Employee staff = new Employee("Emma","Watson",35000);

        EmployeeTeam team = new EmployeeTeam(boss, staff);

        System.out.println("--- Initial Team Details ---");
        team.printAllEmployeesDetails();

        System.out.println("--- Testing updateSalaryOfEmployee for Emma ---");
        team.updateSalaryOfEmloyee("Emma", 42000);
        team.printAllEmployeesDetails();

        System.out.println("--- Testing giveRaiseToAllEmployees (10%) ---");
        team.giveRaiseToAllEmployees();
        team.printAllEmployeesDetails();
    }
}
