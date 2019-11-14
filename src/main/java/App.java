import models.Post;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
//            TODO: Uncomment to show all available posts
//            ArrayList<Post> posts = Post.getAllPosts();
//            model.put("posts", posts);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/add-post", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(null, "add-post.hbs");
        }, new HandlebarsTemplateEngine());

        post("/posts/success", (req, res) -> { //URL to make new post on POST route
            Map<String, Object> model = new HashMap<>();
            String title = req.queryParams("title");
            String content = req.queryParams("content");
//            TODO: Uncomment to create a new post
//            Post newPost = new Post(title, content);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
