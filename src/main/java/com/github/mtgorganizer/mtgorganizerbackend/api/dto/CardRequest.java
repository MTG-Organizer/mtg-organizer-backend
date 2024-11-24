package com.github.mtgorganizer.mtgorganizerbackend.api.dto;

public record CardRequest(
        Long id,
        String name,
        String picUrl,
        String lowerName
) {
}
