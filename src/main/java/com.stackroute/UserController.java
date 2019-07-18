package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
class UseController {
    @RequestMapping("/")
    public String display(Model model) {
        User user = new User();
        user.setName("Magnolia");
        String name = user.getName();
        model.addAttribute("print", name);
        return "index";
    }
}
