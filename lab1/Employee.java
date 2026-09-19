package lab1;

public class Employee {
    private String  firstname;
    private String lastname;
    private double monthlysalary;

    public Employee (String firstname, String lastname, double monthlysalary){
        this.firstname = firstname;
        this.lastname = lastname;
        if (monthlysalary>0){
            this.monthlysalary = monthlysalary;
        }
        else{
            this.monthlysalary = 0;
        }
    }
    public Employee (String firstname, String lastname){
        this(firstname, lastname, 0.0);
    }
    public String getFirstName(){
        return firstname;
    }
    public void setFirsName(String firstname){
        this.firstname = firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public void setLastName(String lastname){
        this.lastname = lastname;
    }
    public double getMonthlySalary(){
        return monthlysalary;
    }
    public  void setMonthlySalary(double monthlysalary){
       if (monthlysalary<0){
         this.monthlysalary = monthlysalary;
       }
       
    }
    public double getYearlySalary(){
        return this.monthlysalary * 12;
    }
    public void giveRaise (double percentage){
        if (percentage > 0){
            this.monthlysalary += this.monthlysalary * (percentage / 100);
        }
    }
}
