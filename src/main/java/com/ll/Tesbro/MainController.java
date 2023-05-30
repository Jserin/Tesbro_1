package com.ll.Tesbro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/tesbro")
    public String home() {
        return "main_page";
    }

    @GetMapping("/")
    public String root(){
        return "redirect:/tesbro";
    }
}
