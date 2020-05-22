package com.tssboot.springbootdemo.controller;

import com.tssboot.springbootdemo.model.ChatMessage;
import com.tssboot.springbootdemo.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.HtmlUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/chat")
public class ChatController {

    @RequestMapping("/page")
    public String chatView() {
        return "chat";
    }

    @MessageMapping("/chat")
    @SendTo("/topic/chat")
    public ChatMessage send(final Message message) {
        final String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new ChatMessage(HtmlUtils.htmlEscape(message.getName()), message.getContent(), time);
    }

}
