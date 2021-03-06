package cardgameweek4;
/**
 * Starter code for the Card class.
 * To be used in Week 4.
 * @author Will Agbonselobho, 2019
 */
public class Card {
    
        public enum Suit {HEARTS, CLUBS,SPADES,DIAMONDS};
        public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
        private final Suit suit;
        private final Value value;
        public enum Joker {JOKER};
	private final Joker joker;
        public Card(Suit s, Value gVal)
        {
           suit =s;
           value= gVal;
        }
	public Value getValue() {
		return this.value;
	}

	
	public Suit getSuit() {
		return this.suit;
        }
	public Joker getJoker() {
		return this.joker;
	}
	
}
