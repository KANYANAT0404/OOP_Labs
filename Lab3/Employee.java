
    class Employee {
    protected String name;
    public double computePay() { return 0; }
}

class Fulltimer extends Employee {
    private double salary;
    public Fulltimer(String n, double s) {
        name = n; salary = s;
    }
    @Override
    public double computePay() { return salary; }
}

class Manager extends Fulltimer {
    private int workYear;
    public Manager(String n, double s, int w) {
        super(n, s);
        workYear = w;
    }
    public int getWorkYear() { return this.workYear; } 
    @Override
    public double computePay() { return super.computePay() * workYear; }
}

class Hourly extends Employee {
    private double rate;
    private int hour;
    public Hourly(String n, double r, int h) {
        name = n; hour = h; rate = r;
    }
    @Override
    public double computePay() { return hour * rate; }
}

