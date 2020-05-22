package com.tssboot.springbootdemo.model;

import lombok.Getter;

public class ChatMessage {

    public ChatMessage(String name, String message, String time) {
        this.name = name;
        this.content = message;
        this.time = time;
    }

    @Getter
    private final String name;

    @Getter
    private final String content;

    @Getter
    private final String time;

}
