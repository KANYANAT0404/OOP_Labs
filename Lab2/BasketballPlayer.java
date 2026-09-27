package Lab2;

public class BasketballPlayer extends Player{
    public BasketballPlayer (String n, int j){
        super (n, j);
    }
    @Override 
    public void playGame(){
        minutesPlayed = minutesPlayed + 48;
    }
    public void changeJerseyNumber(int newNumber){
        this.jerseyNumber = newNumber;
        System.out.println(name+ " changes number to "+jerseyNumber);
    }
}
