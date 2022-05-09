package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
//handles request at path /hello

    @GetMapping("Hello")
    @ResponseBody
    public String hello() {

        return "Hello, Sring!";
    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {

        return "Goodbye, Spring!";
    }
}
