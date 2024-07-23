package com.microsoft.shinyay.ai.demo.service;

import com.microsoft.shinyay.ai.demo.config.AzureOpenAIConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ChatService {

    @Autowired
    private AzureOpenAIConfig config;

    @Autowired
    private RestTemplate restTemplate;

    public String getChatResponse(String message) {
        // Azure OpenAI API へのリクエストを構築し、レスポンスを取得するロジックを実装
        String url = config.getEndpoint();
        // API リクエストの詳細は省略
        return "Response from Azure OpenAI";
    }
}
