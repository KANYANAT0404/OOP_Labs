        package Lab4.Q2;

        import java.util.Scanner;

            public class Q2Test {
            public static void main(String[] args) {
                 Scanner scanner = new Scanner(System.in);

                   System.out.print("Enter age: ");
                   int age = scanner.nextInt();

                   System.out.print("Enter GPA: ");
                   double gpa = scanner.nextDouble();

        
        try {
            UndergradStudent undergrad = new UndergradStudent(age, gpa);
            GradStudent grad = new GradStudent(age, gpa);

            System.out.println("--- Successfully Created ---");
            System.out.println("Undergrad student age: " + undergrad.getAge());
            System.out.println("Grad student age: " + grad.getAge());

        } catch (IllegalArgumentException e) {
            
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}   
