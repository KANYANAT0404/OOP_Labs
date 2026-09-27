    package Lap2;

    public class Player {
        protected String name;
        protected int jerseyNumber;
        protected int minutesPlayed;

    public Player (String n, int j){
        this.name = n;
        this.jerseyNumber = j;
        this.minutesPlayed = 0;
    }
    public void playGame(){

    }
    public void print(){
        System.out.println(name+ ": "+jerseyNumber);
    }
    public int getMinutesPlayer(){
        return minutesPlayed;
    }
}
