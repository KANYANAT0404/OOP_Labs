package Lap2;

public class CardUtilTest{
    public static void main(String[] args) {
        System.out.println("---Testing Card---");
        Card card1 = new  Card (Card.Rank.ACE,Card.Suit.SPADES);
        Card card2 = new Card (Card.Rank.KING,Card.Suit.HEARTS);
        System.out.println("Is card1 the highest card?");
        System.out.println(CardUtil.isHighestCard(card1));
        System.out.println("Is card2 the Highest card?");
        System.out.println(CardUtil.isHighestCard(card2));
    }
}