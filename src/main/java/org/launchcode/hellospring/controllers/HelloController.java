package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    public String helloWithParam(@PathVariable String name, Model model) {
        model.addAttribute("greeting", "Hello " + name + "!" );
        return "hello";
    }

    //handler that handles requests of the form /hello/LaunchCode

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model){
        List<String> names= new ArrayList<>();
        names.add("Josh");
        names.add("Be-Asia");
        names.add("Asase");
        names.add("Essence");
    model.addAttribute("names",names );
    return "hello-list";
    }
}


