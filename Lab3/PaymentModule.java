package Lab3;
    public class PaymentModule {
    protected double totalPay; 

    public PaymentModule(double initialPay) {
        this.totalPay = initialPay;
    }

    public void payment(Employee emp) {
        double currentPay = emp.computePay();
        
       
        if (emp instanceof Manager) {
            Manager m = (Manager) emp; 
            if (m.getWorkYear() > 10) {
                currentPay *= 2;
            }
        }
        totalPay += currentPay;
    }

    public double getTotalPay() {
        return totalPay;
    }
}

