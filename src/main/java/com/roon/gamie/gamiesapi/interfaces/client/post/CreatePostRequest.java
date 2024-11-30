package com.roon.gamie.gamiesapi.interfaces.client.post;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreatePostRequest {
    private String title;
    private String content;
    private Long authorId;

    public CreatePostRequest(String title, String content, Long authorId) {
        this.title = title;
        this.content = content;
        this.authorId = authorId;
    }
}
