package Lab2;

        public class PlayerTest {
        public static void main(String[] args) {
            FootballPlayer f = new FootballPlayer("Ronado", 7);
            BasketballPlayer b = new BasketballPlayer("James", 23);

            f.print();
            b.print();

            f.playGame();
            b.playGame();

            System.out.println(f.getMinutesPlayer());
            System.out.println(b.getMinutesPlayer());

        b.changeJerseyNumber(6);
    }
}
