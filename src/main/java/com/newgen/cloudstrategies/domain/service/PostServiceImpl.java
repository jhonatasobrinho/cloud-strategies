package com.newgen.cloudstrategies.domain.service;

import com.newgen.cloudstrategies.domain.model.Post;
import com.newgen.cloudstrategies.infrastructure.client.PostClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CircuitBreaker(backend = "post-api")
public class PostServiceImpl implements PostService {

    private PostClient client;

    @Autowired
    public PostServiceImpl(PostClient client) {
        this.client = client;
    }

    @Override
    public List<Post> getAllPosts() {
        return client.getAllPosts();
    }
}
