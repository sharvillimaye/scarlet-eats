package com.scarleteats.backend.security.controller;

import com.scarleteats.backend.security.model.dto.LoginResponseDTO;
import com.scarleteats.backend.security.model.dto.RegistrationDTO;
import com.scarleteats.backend.security.model.entity.User;
import com.scarleteats.backend.security.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*") // TODO : fix cross origin
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;

    //TODO : do not return ApplicationUser return a DTO
    @PostMapping("/register")
    public User registerUser(@RequestBody RegistrationDTO registrationDTO) {
        return authenticationService.registerUser(registrationDTO.getUsername(), registrationDTO.getPassword());
    }

    @PostMapping("/login")
    public LoginResponseDTO loginUser(@RequestBody RegistrationDTO registrationDTO) {
        // TODO make a seperate loginDTO
        return authenticationService.loginUser(registrationDTO.getUsername(), registrationDTO.getPassword());
    }

}
