package com.roon.gamie.gamiesapi.interfaces.client.post;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostResponse {
    private Long postId;
    private String title;
    private String content;
    private Long authorId;

    public PostResponse(Long postId, String title, String content, Long authorId) {
        this.postId = postId;
        this.title = title;
        this.content = content;
        this.authorId = authorId;
    }
}
