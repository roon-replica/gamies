package com.roon.gamie.gamiesapi.application;

import com.roon.gamie.gamiesapi.domain.GamieApiException;
import com.roon.gamie.gamiesapi.domain.post.Post;
import com.roon.gamie.gamiesapi.infra.persistence.PostRepository;
import com.roon.gamie.gamiesapi.interfaces.client.post.PostResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;

    public PostResponse getPost(Long id) {
        var post = postRepository.findById(id)
                .orElseThrow(() -> new GamieApiException("PostNotFound. id: " + id));

        return new PostResponse(post.getId(), post.getTitle(), post.getContent(), post.getAuthorId());
    }

    public Long createPost(String title, String content, Long authorId) {
        var post = Post.builder()
                .title(title)
                .content(content)
                .authorId(authorId)
                .build();

        return postRepository.save(post).getId();
    }
}
