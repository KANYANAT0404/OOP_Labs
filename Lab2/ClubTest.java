package Lab2;

        public class ClubTest {
            public static void main(String[] args) {
                System.out.println("=== Test SportsClub ===");
                SportsClub sports = new SportsClub("Fit Club", 10);
                sports.addMember(5);

                System.out.println("Club Name: "+sports.getName());
                System.out.println("SportsClub Budget: "+sports.determineBudget());

                sports.changeName("New Gym Club");
                System.out.println("After changeName: "+sports.getName());

                System.out.println("=== Test MarketingClub ===");
                MarketingClub market = new MarketingClub("Biz Club", 10, 1500);
                System.out.println("Initial Marketing Budget: "+market.determineBudget());

                boolean canUse = market.useBudget(600);
                System.out.println("Use 600 success? "+canUse);
                System.out.println("New Marketing Budget: "+market.determineBudget());
    }
}
