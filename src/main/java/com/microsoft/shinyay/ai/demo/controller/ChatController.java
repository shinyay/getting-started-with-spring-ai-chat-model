package com.microsoft.shinyay.ai.demo.controller;

import com.microsoft.shinyay.ai.demo.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @PostMapping
    public String chat(@RequestBody String message) {
        return chatService.getChatResponse(message);
    }
}
