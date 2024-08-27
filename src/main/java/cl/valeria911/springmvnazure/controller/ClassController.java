package cl.valeria911.springmvnazure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello, this is a project made from Maven and Azure";
    }

}
