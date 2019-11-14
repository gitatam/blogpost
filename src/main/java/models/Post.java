package models;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Post{
    private int id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private static ArrayList<Post> instances = new ArrayList<>();

    public Post(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdAt = LocalDateTime.now();
        this.instances.add(this);
    }

    //getter functions
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    //setter functions

    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public static ArrayList<Post> getAllPosts(){
        return instances;
    }
    public void deletePost(int id){
        this.id =  id;
    }
    public void deleteAllPosts(String content){
        this.content = content;
    }

}
