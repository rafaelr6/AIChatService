package com.artificial.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatGPTController {

    @Autowired
    private ChatGPTService chatGPTService;

    @GetMapping("/chat")
    public String chat(@RequestParam String prompt) {
        return chatGPTService.getChatGPTResponse(prompt);
    }
}