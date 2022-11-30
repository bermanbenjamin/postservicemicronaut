package com.postservicemicronaut.model;

import io.micronaut.data.annotation.*;
import io.micronaut.data.model.DataType;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;

@MappedEntity
public class Comment {

    @Id
    @GeneratedValue(GeneratedValue.Type.AUTO)
    private Long id;

    @NotNull
    private String postId;
    @NotNull
    private String userId;
    private String body;
    @DateCreated
    private String date;
   
    private Long likes;

    private Long dislikes;

    public Comment(Long id, String postId, String userId, String body, String date, Long likes, Long dislikes) {
        this.id = id;
        this.postId = postId;
        this.userId = userId;
        this.body = body;
        this.date = date;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    //generate getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public Long getDislikes() {
        return dislikes;
    }

    public void setDislikes(Long dislikes) {
        this.dislikes = dislikes;
    }
}
