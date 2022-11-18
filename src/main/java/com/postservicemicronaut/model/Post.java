package com.postservicemicronaut.model;


import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

import java.util.ArrayList;

@MappedEntity
public class Post {

    @Id
    @GeneratedValue(GeneratedValue.Type.UUID)
    private String id;

    private String userId;

    private String title;

    private String body;

    private String date;

    private ArrayList<Integer> likes;

    private ArrayList<Integer> dislikes;

    private ArrayList<Comment> comments;

    public Post(String id, String userId, String title, String body, String date, ArrayList<Integer> likes, ArrayList<Integer> dislikes, ArrayList<Comment> comments) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.body = body;
        this.date = date;
        this.likes = likes;
        this.dislikes = dislikes;
        this.comments = comments;
    }

    //generate getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<Integer> getLikes() {
        return likes;
    }

    public void setLikes(ArrayList<Integer> likes) {
        this.likes = likes;
    }

    public ArrayList<Integer> getDislikes() {
        return dislikes;
    }

    public void setDislikes(ArrayList<Integer> dislikes) {
        this.dislikes = dislikes;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

}
