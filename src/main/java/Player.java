import java.util.ArrayList;

public class Player{

  private String playerName;
  private ArrayList<Card> playerCards = new ArrayList<Card>();
  private int playerCardSize;

  public Player(String player){
    playerName = player;
  }

  public ArrayList<Card> get7Cards(Deck gameDeck){
     for(int i = 0; i < 7; i++){
       playerCards.add(gameDeck.getCard());
     }
     return playerCards;
  }

  public ArrayList<Card> removeCard(int i){
    playerCards.remove(i);
    return playerCards;
  }
}
