package Lab3;

    public class PaymentModuleTest {
    public static void main(String[] args) {
        PaymentModule pm = new PaymentModule(0);
        
        Employee m1 = new Manager("John", 5000, 5);  
        Employee m2 = new Manager("Bob", 5000, 12);  

        pm.payment(m1);
        System.out.println("Total Pay after John: " + pm.getTotalPay());

        pm.payment(m2);
        System.out.println("Total Pay after Bob (Over 10 Years): " + pm.getTotalPay());
    }
}

