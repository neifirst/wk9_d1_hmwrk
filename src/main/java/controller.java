import models.StudentList;
import spark.ModelAndView;
import spark.Spark;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;


public class controller {

    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("public");


        get("/one", (req, res) -> {
            String name = StudentList.getRandomName();
            HashMap<String, Object> model = new HashMap<>();
            model.put("name", name);
            model.put("template", "one.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        Spark.exception(Exception.class, (exception, request, response) -> {
            exception.printStackTrace();
        });


        get("/two", (req, res) -> {
            List<String> names = StudentList.getRandomTwoNames();
            HashMap<String, Object> model = new HashMap<>();
            model.put("names", names);
            model.put("template", "two.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        Spark.exception(Exception.class, (exception, request, response) -> {
            exception.printStackTrace();
        });


        get("/three", (req, res) -> {
            List<String> names = StudentList.getRandomThreeNames();
            HashMap<String, Object> model = new HashMap<>();
            model.put("names", names);
            model.put("template", "three.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        Spark.exception(Exception.class, (exception, request, response) -> {
            exception.printStackTrace();
        });

    }
}
