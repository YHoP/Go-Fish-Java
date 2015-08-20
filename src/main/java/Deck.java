import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Deck {
  private static final String[] SUITS = {"Spades", "Clubs", "Hearts", "Diamonds"};
  private static final String[] VALUES = {
    "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
  };
  private ArrayList<Card> mCards;
  private int mCardSize;

  public Deck() {
    mCards = new ArrayList<Card>();
    for (String suit : SUITS) {
      for ( String value : VALUES){
        Card newCard = new Card(suit, value);
        mCards.add(newCard);
      }
    }
  }

  public ArrayList<Card> getFullDeck(){
    return mCards;
  }

  public Card getCard(){
    mCardSize = mCards.size();
    Random randomCards = new Random();
    int i = randomCards.nextInt(mCardSize);
    Card newCard = mCards.get(i);
    mCards.remove(i);
    //mCards = Collection.shuffle(mCards);
    return newCard;
  }
}
