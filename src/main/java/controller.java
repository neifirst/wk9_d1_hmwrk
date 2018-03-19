import models.StudentList;
import spark.ModelAndView;
import spark.Spark;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static spark.Spark.get;

public class controller {

    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();




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
            List<String> chosen = new ArrayList<>();
            String name1 = StudentList.getRandomName();
            chosen.add(name1);
            String name2 = StudentList.getRandomName();
            while (chosen.contains(name2) == true) {
                name2 = StudentList.getRandomName();
            }
            chosen.add(name2);
            String name3 = StudentList.getRandomName();
            while (chosen.contains(name3) == true) {
                name3 = StudentList.getRandomName();
            }
            chosen.add(name3);
            HashMap<String, Object> model = new HashMap<>();
            model.put("name1", name1);
            model.put("name2", name2);
            model.put("name3", name3);
            model.put("template", "three.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        Spark.exception(Exception.class, (exception, request, response) -> {
            exception.printStackTrace();
        });

    }
}
