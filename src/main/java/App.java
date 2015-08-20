
import java.util.Map;
import java.util.HashMap;
import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";
    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/players.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/playerOne", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();


      String playerOne = request.queryParams("playerOne");
      request.session().attribute("playerOne", playerOne);

      String playerTwo = request.queryParams("playerTwo");
      request.session().attribute("playerTwo", playerTwo);

      Player player1 = new Player(playerOne);
      Player player2 = new Player(playerTwo);
      Deck gameDeck = new Deck();
      // gameDeck.getFullDeck()
      Card testCard = new Card("test", "card");
      ArrayList<Card> playerOneCards = player1.get7Cards(gameDeck);
      ArrayList<Card> playerTwoCards = player2.get7Cards(gameDeck);

      model.put("playerOneCards", playerOneCards);
      model.put("playerTwoCards", playerTwoCards);
      model.put("testcard", testCard);
      model.put("gameDeck", gameDeck.getFullDeck());
      model.put("template", "templates/playerOne.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
