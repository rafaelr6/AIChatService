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
    public String chat(@RequestParam String prompt, String model, String role) {
        // Default values for model and role if not provided
        if (model == null || model.isEmpty()) {
            model = "gpt-3.5-turbo"; // Default model
        }
        if (role == null || role.isEmpty()) {
            role = "user"; // Default role
        }
        // Call the service to get the response from ChatGPT
        // and return the response
        return chatGPTService.getChatGPTResponse(prompt, model, role);
    }
}