package com.postservicemicronaut.delivery;

import com.postservicemicronaut.service.PostService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.http.annotation.*;

@Controller("/posts")
public class PostController {

    final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @Get("/all")
    public HttpResponse<Iterable<com.postservicemicronaut.model.Post>> getAll() {
        try {
            return HttpResponse.ok(postService.findAll());
        } catch (Exception e) {
        	e.printStackTrace();
            return HttpResponse.badRequest();
        }
    }

    @Get("/{id}")
    public MutableHttpResponse<Object> get(@PathVariable Long id) {
        try {
            return HttpResponse.ok(postService.findById(id));
        } catch (Exception e) {
        	e.printStackTrace();
            return HttpResponse.badRequest();
        }
    }

    @Get("/user/{id}/all")
    public MutableHttpResponse<Object> getAllByUserId(@PathVariable Long id) {
        try {
            return HttpResponse.ok(postService.findAllByUserId(id));
        } catch (Exception e) {
        	e.printStackTrace();
            return HttpResponse.badRequest();
        }
    }


    @Post("/create")
    public MutableHttpResponse<Object> create(@Body com.postservicemicronaut.model.Post post) {
        try {
            postService.create(post);
            return HttpResponse.ok();
        } catch (Exception e) {
        	e.printStackTrace();
            return HttpResponse.badRequest();
        }
    }

    @Put("/update")
    public MutableHttpResponse<Object> update(@Body com.postservicemicronaut.model.Post post) {
        try {
            postService.update(post);
            return HttpResponse.ok();
        } catch (Exception e) {
        	e.printStackTrace();
            return HttpResponse.badRequest();
        }
    }

    @Delete("/delete/{id}")
    public MutableHttpResponse<Object> delete(@PathVariable Long id) {
        try {
            postService.deleteById(id);
            return HttpResponse.ok();
        } catch (Exception e) {
        	e.printStackTrace();
            return HttpResponse.badRequest();
        }
    }



}
