package lab1;

public class EmployeeTeam {
    private Employee boss;
    private Employee employee;

    public EmployeeTeam (Employee boss, Employee employee){
        this.boss = boss;
        this.employee = employee;
    }
    public void printEmloyDetails(){
        System.out.println("Employee: "+employee.getFirstName()+" "+employee.getLastName()+", Salary: "+employee.getMonthlySalary());
    }
    public void printAllEmployeesDetails(){
        System.out.println("Boss: "+boss.getFirstName()+" "+boss.getLastName()+", Salary: "+boss.getMonthlySalary());
        System.out.println("Employee: "+employee.getFirstName()+" "+employee.getLastName()+", Salary: "+employee.getMonthlySalary());
    }
    public void updateSalaryOfEmloyee(String firstname, double newSalary){
        if(newSalary>0){
            if(boss.getFirstName().equals(firstname)){
                boss.setMonthlySalary(newSalary);
            }
            if(employee.getFirstName().equals(firstname)){
                employee.setMonthlySalary(newSalary);
            }
        }

    }
    public void giveRaiseToAllEmployees(){
        boss.giveRaise(10);
        employee.giveRaise(10);
    }
}
