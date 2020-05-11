package com.Tudod.Tudod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
class BaseController {
    @Autowired
    private GreetingRepo gr;
    private Integer i =1222;
    private Long k=i.longValue();

    @GetMapping("/greeting")
    public Greeting greetingForm(Model model) {
        //model.addAttribute("greeting", new Greeting());
        //return gr.getOne( k );
        Greeting grt=new Greeting();
        grt.setContent("szia");
        grt.setId(k);
        return grt;
    }

    @PostMapping("/greeting")
    public Greeting greetingSubmit(@ModelAttribute Greeting greeting) {
        return gr.save(greeting);
    }
}
