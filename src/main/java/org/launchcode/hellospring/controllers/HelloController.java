package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
//handles request at path /hello
    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello, Spring!";
    }


    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {

        return "Goodbye, Spring!";
    }

//create a handler that handles requests of the form /hello?name=LaunchCode

    @RequestMapping(value="Hola", method = {RequestMethod.GET, RequestMethod.POST})
        public String helloWithQueryParam(@RequestParam String name, Model model) {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    //handler that handles requests of the form /hello/LaunchCode

    @GetMapping("hola/{name}")
    @ResponseBody
    public String helloWithParam(@PathVariable String name) {
        return "Hola, " + name + "!";
    }

    //handler that handles requests of the form /hello/LaunchCode

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }
}


