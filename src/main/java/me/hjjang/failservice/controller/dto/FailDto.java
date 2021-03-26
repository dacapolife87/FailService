package me.hjjang.failservice.controller.dto;

import lombok.Getter;

@Getter
public class FailDto {

    private String message;

    private FailDto(String message) {
        this.message = message;
    }

    public static FailDto create(String message) {
        return new FailDto(message);
    }
}
