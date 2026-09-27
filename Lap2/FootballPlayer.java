package Lap2;

    public class FootballPlayer extends Player{
        public FootballPlayer (String n, int j){
        super(n,j);
    }
    @Override
    public void playGame(){
        minutesPlayed = minutesPlayed +90;
    }
}
