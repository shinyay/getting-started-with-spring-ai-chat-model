package com.microsoft.shinyay.ai.demo.controller;

import com.microsoft.shinyay.ai.demo.service.ChatService;
import com.microsoft.shinyay.ai.demo.model.ChatMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChatController {

    private final ChatService chatService;

    // Constructor injection
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/chat")
    public String showChatForm(Model model) {
        model.addAttribute("chatMessage", new ChatMessage());
        return "chat";
    }

    @PostMapping("/chat")
    public String getChatResponse(@RequestParam("message") String message, Model model) {
        String response = chatService.getChatResponse(message);
        model.addAttribute("response", response);
        return "chat";
    }
}
