package com.postservicemicronaut.service;

import com.postservicemicronaut.model.Comment;
import com.postservicemicronaut.repository.CommentRepository;
import jakarta.inject.Inject;

import jakarta.inject.Inject;

import java.util.ArrayList;

public class CommentService {

    final CommentRepository commentRepository;
    
    @Inject
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment findById(Long id) {
        try {
            return commentRepository.findById(id).get();
        } catch (Exception e) {
            throw  e;
        }
    }

    public Iterable<Comment> findAllByPostId(Long id) {
        try {
            final Iterable<Comment> comments = commentRepository.findAll();
            ArrayList<Comment> finalComments = new ArrayList<Comment>();
            comments.forEach(comment -> {
                if (comment.getPostId().equals(id)) {
                    finalComments.add(comment);
                }
            });
            return finalComments;
        } catch (Exception e) {
            throw  e;
        }
    }


    public Iterable<Comment> findAll() {
        try {
            return commentRepository.findAll();
        } catch (Exception e) {
            throw  e;
        }
    }

    public Comment create(Comment comment) {
       try {
           return commentRepository.save(comment);
       } catch (Exception e) {
           throw  e;
       }
    }

    public Comment update(Comment comment) {
       try {
                return commentRepository.save(comment);
            } catch (Exception e) {
                throw  e;
            }
    }

    public Comment deleteById(Long id) {
        try {
            Comment comment = commentRepository.findById(id).get();
            commentRepository.delete(comment);
            return comment;
        } catch (Exception e) {
            throw  e;
        }
    }




}

