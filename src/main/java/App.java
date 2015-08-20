
import java.util.Map;
import java.util.HashMap;
import java.io.Console;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    // staticFileLocation("/public");
    // String layout = "templates/layout.vtl";
    // get("/", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/home.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
    //
    // get("/whowon", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/whowon.vtl");
    //
    //   String playerOne = request.queryParams("playerOne");
    //   String playerTwo = request.queryParams("playerTwo");
    //
    //   String whoWins = whoWins(playerOne, playerTwo);
    //
    //   model.put("playerOne", playerOne);
    //   model.put("playerTwo", playerTwo);
    //   model.put("whoWins", whoWins(playerOne, playerTwo));
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());

  }
