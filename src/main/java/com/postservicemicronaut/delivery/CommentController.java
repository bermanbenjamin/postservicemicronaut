package com.postservicemicronaut.delivery;

import com.postservicemicronaut.service.CommentService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

import javax.validation.Valid;

@Controller("/comments")
public class CommentController {

    final CommentService commentService;


    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @Get("/all")
     public HttpResponse<Iterable<com.postservicemicronaut.model.Comment>> getAll() {
        try {
            return HttpResponse.ok(commentService.findAll());
        } catch (Exception e) {
            return HttpResponse.badRequest();
        }

    }

    @Get("/{id}")
    public HttpResponse<com.postservicemicronaut.model.Comment> get(@PathVariable String id) {
        try {
            return HttpResponse.ok(commentService.findById(id));
        } catch (Exception e) {
            return HttpResponse.badRequest();
        }
    }

    @Get("/post/{id}/all")
    public HttpResponse<Iterable<com.postservicemicronaut.model.Comment>> getAllByPostId(@PathVariable String id) {
        try {
            return HttpResponse.ok(commentService.findAllByPostId(id));
        } catch (Exception e) {
            return HttpResponse.badRequest();
        }
    }

    @Post("/create")
    public HttpResponse<Object> create(@Body @Valid com.postservicemicronaut.model.Comment comment) {
        try {
            commentService.create(comment);
            return HttpResponse.ok();
        } catch (Exception e) {
            return HttpResponse.badRequest();
        }
    }

    @Put("/update")
    public HttpResponse<Object> update(@Body @Valid com.postservicemicronaut.model.Comment comment) {
        try {
            commentService.update(comment);
            return HttpResponse.ok();
        } catch (Exception e) {
            return HttpResponse.badRequest();
        }
    }

    @Delete("/delete/{id}")
    public HttpResponse<Object> delete(@PathVariable String id) {
        try {
            commentService.deleteById(id);
            return HttpResponse.ok();
        } catch (Exception e) {
            return HttpResponse.badRequest();
        }
    }


}
