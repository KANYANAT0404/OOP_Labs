
    public class AdvancedPaymentModule extends PaymentModule {

    public AdvancedPaymentModule(double initialPay) {
        super(initialPay);
    }

    // Method Overloading รับค่าพารามิเตอร์เป็นชุดอาเรย์
    public void payment(Employee[] employees) {
        for (Employee emp : employees) {
            super.payment(emp); 
        }
    }
}

