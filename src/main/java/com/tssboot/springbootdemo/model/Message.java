package com.tssboot.springbootdemo.model;

import lombok.Getter;

public class Message {

    public Message(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Getter
    private final String name;

    @Getter
    private final String content;
}
