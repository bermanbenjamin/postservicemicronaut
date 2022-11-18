package com.postservicemicronaut.service;

import com.postservicemicronaut.model.Post;
import com.postservicemicronaut.repository.PostRepository;
import io.micronaut.core.annotation.Internal;
import jakarta.inject.Inject;

import java.util.ArrayList;

public class PostService {

    final PostRepository postRepository;

    @Inject
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post findById(String id) {
        try {
            return postRepository.findById(id).get();
        } catch (Exception e) {
            throw  e;
        }
    }

    public Iterable<Post> findAllByUserId(String id) {
        try {
            ArrayList<Post> finalPosts = new ArrayList<Post>();
            final Iterable<Post> posts = postRepository.findAll();
            posts.forEach(post -> {
                if (!post.getUserId().equals(id)) {
                    finalPosts.add(post);
                }

            });
            return finalPosts;

        } catch (Exception e) {
            throw  e;
        }
    }

    public Iterable<Post> findAll() {
        try {
            return postRepository.findAll();
        } catch (Exception e) {
            throw  e;
        }
    }

    public Post create(Post post) {
       try {
           return postRepository.save(post);
       } catch (Exception e) {
           throw  e;
       }
    }

    public Post update(Post post) {
       try {
                return postRepository.save(post);
            } catch (Exception e) {
                throw  e;
            }
    }

    public Post deleteById(String id) {
        try {
            Post post = postRepository.findById(id).get();
            postRepository.delete(post);
            return post;
        } catch (Exception e) {
            throw  e;
        }
    }


}
