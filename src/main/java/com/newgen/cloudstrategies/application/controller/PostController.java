package com.newgen.cloudstrategies.application.controller;

import com.newgen.cloudstrategies.domain.model.Post;
import com.newgen.cloudstrategies.domain.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController("/posts")
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getAllPosts() {
        try {
            return postService.getAllPosts();
        } catch (Exception e) {
            System.out.println("Error while fetching posts -- " + e);
            return Collections.emptyList();
        }
    }
}
