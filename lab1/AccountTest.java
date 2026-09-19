package lab1;

public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account("InvaliAcc", -500);
        System.out.println(acc1.getName()+" Balance: "+acc1.getBalance());

        Account acc2 = new Account("Oak", 1000);
        System.out.println(acc2.getName()+" Initial Balance: "+acc2.getBalance());

        acc2.deposit(500);
        System.out.println("After vaild deposit (+500): "+acc2.getBalance());

        acc2.deposit(-200);
        System.out.println("After invalid deposit (-200): "+acc2.getBalance());
    }
}
