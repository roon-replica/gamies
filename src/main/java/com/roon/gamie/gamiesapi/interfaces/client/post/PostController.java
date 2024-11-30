package com.roon.gamie.gamiesapi.interfaces.client.post;

import com.roon.gamie.gamiesapi.application.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostController {
    private final PostService postService;

    @GetMapping("/posts/{id}")
    public PostResponse getPost(@PathVariable Long id) {
        return postService.getPost(id);
    }

    @PostMapping("/create-post")
    public Long createPost(@RequestBody CreatePostRequest request) {
        return postService.createPost(request.getTitle(), request.getContent(), request.getAuthorId());
    }
}
