package com.example.todo.dto;

import lombok.Getter;

@Getter
public class TodoUpdateRequest {

    private String title;

    private Boolean completed;

}
