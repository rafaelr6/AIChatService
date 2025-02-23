package com.artificial.chat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ChatGPTService {

    private final RestTemplate restTemplate;
    private final String apiKey;

    public ChatGPTService(RestTemplate restTemplate, @Value("${OPENAI_API_KEY}") String apiKey) {
        this.restTemplate = restTemplate;
        this.apiKey = apiKey;
    }

    public String getChatGPTResponse(String prompt) {
        String url = "https://api.openai.com/v1/chat/completions"; // Updated endpoint
    
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + apiKey);
        headers.set("Content-Type", "application/json");
    
        String requestBody = "{ \"model\": \"gpt-3.5-turbo\", \"messages\": [{\"role\": \"user\", \"content\": \"" + prompt + "\"}], \"max_tokens\": 150 }";
    
        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);
    
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
    
        return response.getBody();
    }
}
