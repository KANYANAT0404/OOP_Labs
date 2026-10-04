import Lab3.Club;
import Lab3.ESportsClub;
import Lab3.MarketingClub;
import Lab3.SportsClub;

    public class ClubManagingSystemTest {
    public static void main(String[] args) {
        Club[] list = new Club[4];
        list[0] = new Club("Student", 200);
        list[1] = new SportsClub("Football", 40);
        list[2] = new ESportsClub("RoV", 5);
        list[3] = new MarketingClub("Advertising", 10, 100);

        ClubManagingSystem system = new ClubManagingSystem(list);

        System.out.println("Highest Member Club: " + system.getHighestMemberClub().getName());
        System.out.println("Total Budget: " + system.determineAllBudget());
        System.out.println("Total Members: " + system.getAllMembers());
    }
}
