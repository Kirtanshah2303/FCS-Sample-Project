package com.syndicate.app.Task1.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MyController {
    @Value("${welcome.message}")
    private String message;

    private List<String> tasks = Arrays.asList("Kirtan", "Devkul", "Bharat", "Mazhar");

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("message", message);
        model.addAttribute("tasks", tasks);

        return "welcome"; //view
    }
}
