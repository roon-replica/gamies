package com.roon.gamie.gamiesapi.domain;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class GamieApiException extends RuntimeException {
    public GamieApiException(String message) {
        super(message);
    }
}
