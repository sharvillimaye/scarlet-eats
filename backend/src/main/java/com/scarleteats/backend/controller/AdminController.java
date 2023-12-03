package com.scarleteats.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*") // TODO: update this to make it more secure
public class AdminController {

    @GetMapping("/")
    public String helloUserController() {
        return "admin access level";
    }

}
