package Lap2;

        public class FamilyTest {
            public static void main(String[] args) {
                System.out.println("=== Test Name Overriding (As required by spec) ===");
                Mother m = new Mother();
                m.setFirstName("Alice");
                m.setLastName("Smith");
                System.out.println("Mother: " +m.getFirstName()+" "+m.getLastName());

                Father f = new Father(m);
                f.setFirstName("Bob");
                f.setLastName("Smith");
                System.out.println("Father: "+f.getFirstName()+" "+f.getLastName());

                Person p = new Person();
                p.setFirstName("John");
                System.out.println("Normal Person: "+p.getFirstName());

                System.out.println("=== Test Family Relationships (UML Diagram Verification) ===");
                Child c = new Child(10, 140, 35.5);
                c.setFirstName("Charlie");
                c.setLastName("Smith");

                c.setGuardian(f);
                f.setChild(c);
                m.setChild(c);

                System.out.println("Child Name: "+c.getFirstName());
                System.out.println("Child's Guardian: "+c.getGuardian().getFirstName());
                System.out.println("Father's Wife: "+f.getWife().getFirstName());
            }
}
