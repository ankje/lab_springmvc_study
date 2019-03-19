package com.ankje.hi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hi")
public class HiController {

    @RequestMapping("/say")
    public String say(Model model){
        model.addAttribute("first_name","Zhang");
        model.addAttribute("last_name","San");
        return "say";
    }
}
