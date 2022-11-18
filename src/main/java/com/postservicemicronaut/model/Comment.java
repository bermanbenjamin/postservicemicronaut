package com.postservicemicronaut.model;

import io.micronaut.data.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;

@MappedEntity
public class Comment {

    @Id
    @GeneratedValue(GeneratedValue.Type.AUTO)
    private String id;

    @NotNull
    private String postId;
    @NotNull
    private String userId;
    private String body;
    @DateCreated
    private String date;
    private ArrayList<Integer> likes;
    private ArrayList<Integer> dislikes;

    public Comment(String id, String postId, String userId, String body, String date, ArrayList<Integer> likes, ArrayList<Integer> dislikes) {
        this.id = id;
        this.postId = postId;
        this.userId = userId;
        this.body = body;
        this.date = date;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    //generate getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
}
