package com.microsoft.shinyay.ai.demo.service;

import com.microsoft.shinyay.ai.demo.config.AzureOpenAIConfig;
import com.microsoft.shinyay.ai.demo.model.ChatMessage;
import com.microsoft.shinyay.ai.demo.repository.ChatMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ChatService {

    @Autowired
    private AzureOpenAIConfig config;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ChatMessageRepository chatMessageRepository;

    public String getChatResponse(String message) {
        // Azure OpenAI API へのリクエストを構築し、レスポンスを取得するロジックを実装
        String url = config.getEndpoint();
        // API リクエストの詳細は省略
        String response = "Response from Azure OpenAI";

        // Save the message and response to the database
        ChatMessage chatMessage = new ChatMessage(message, response);
        chatMessageRepository.save(chatMessage);

        return response;
    }
}
