package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {
    private static final String template = "Your %s app is running successfully!";

    @GetMapping("testing")
    public String testing(@RequestParam(value="app",defaultValue = "Web") String app){
         return String.format(template,app);
    }
}
