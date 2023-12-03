package com.scarleteats.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin("*") // TODO: update this to make it more secure
public class UserController {

    @GetMapping("/")
    public String helloUserController() {
        return "user access level";
    }

}
