package com.newgen.cloudstrategies.infrastructure.client;

import com.newgen.cloudstrategies.domain.model.Post;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@CircuitBreaker(backend = "post-api")
@FeignClient(name = "post-client")
public interface PostClient {

    @GetMapping("/posts")
    List<Post> getAllPosts();
}
