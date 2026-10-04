import Lab3.Club;
import Lab3.SportsClub;

public class ClubManagingSystem {
    private Club[] clubList;

    public ClubManagingSystem(Club[] list) {
        this.clubList = list;
    }
    public int determineAllBudget() {
        int totalBudget = 0;
        if (clubList == null) return 0;
        
        for (Club c : clubList) {
            if (c != null) {
                totalBudget += c.determineBudget(); 
            }
        }
        return totalBudget;
    }

    public int getAllMembers() {
        int totalMembers = 0;
        if (clubList == null) return 0;
        
        for (Club c : clubList) {
            if (c != null) {
                if (c instanceof SportsClub) {
                    totalMembers += ((SportsClub) c).getNumMember();
                } else {
                    totalMembers += c.determineBudget() / 1000; 
                }
            }
        }
        return totalMembers;
    }

    public Club getHighestMemberClub() {
        if (clubList == null || clubList.length == 0) return null;
        
        Club highestClub = clubList[0];
        for (int i = 1; i < clubList.length; i++) {
            if (clubList[i] == null) continue;
            
            int currentMembers = (clubList[i] instanceof SportsClub) ? ((SportsClub) clubList[i]).getNumMember() : (clubList[i].determineBudget() / 1000);
            int highestMembers = (highestClub instanceof SportsClub) ? ((SportsClub) highestClub).getNumMember() : (highestClub.determineBudget() / 1000);
            
            if (currentMembers > highestMembers) {
                highestClub = clubList[i];
            }
        }
        return highestClub;
    }
}

