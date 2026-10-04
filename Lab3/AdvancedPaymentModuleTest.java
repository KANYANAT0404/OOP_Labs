package Lab3;

public class AdvancedPaymentModuleTest {
    public static void main(String[] args) {
        AdvancedPaymentModule apm = new AdvancedPaymentModule(0);

        Employee[] staff = new Employee[3];
        staff[0] = new Fulltimer("Alice", 3000);
        staff[1] = new Manager("Tom", 4000, 15); 
        staff[2] = new Hourly("Chris", 50, 40);

        apm.payment(staff); // รันคำนวณแบบส่งอาเรย์ทีเดียวครบทุกคน
        System.out.println("Advanced Final Total Pay: " + apm.getTotalPay());
    }
}

