import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/output", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/output.vtl");

      int sideOne = Integer.parseInt(request.queryParams("sideOne"));
      int sideTwo = Integer.parseInt(request.queryParams("sideTwo"));
      int sideThree = Integer.parseInt(request.queryParams("sideThree"));

      Triangle triangle = new Triangle(sideOne, sideTwo, sideThree);
      model.put("triangle", triangle);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
