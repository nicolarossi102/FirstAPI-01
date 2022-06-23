package co.develhope.First.API1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/name")
@RestController
public class NameController {
    private String name = "Nicola";

    @GetMapping("")
    public String getName(){
        return name;
    }

    @PostMapping("")
    public String postName(){
        return new StringBuilder().append(name).reverse().toString();
    }
}
