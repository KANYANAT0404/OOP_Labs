      package Lab3;

         public class ESportClubTest {
            public static void main(String[] args) {
                System.out.println("--- Test with ESportClub ---");
                ESportsClub e = new ESportsClub("Esport",100);
                e.advertise();
                System.out.println("Budget: "+e.determineBudget());
                System.out.println("Name: "+e.getName());

                System.out.println("--- Test with club (Polymorphism) --- ");
                Club c = new ESportsClub("ESportsClub",100);
                c.advertise();
                System.out.println("Budget: "+c.determineBudget());
                System.out.println("Name: "+c.getName());
            }
     }
