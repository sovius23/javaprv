package web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {
    @GetMapping("/registration")
    public String greeting(Model model) {
        model.addAttribute("registration", "Regiatration");
        return "registration";
    }
}
