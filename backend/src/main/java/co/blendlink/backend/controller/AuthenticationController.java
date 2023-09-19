package co.blendlink.backend.controller;

import co.blendlink.backend.model.dto.LoginResponseDTO;
import co.blendlink.backend.model.dto.RegistrationDTO;
import co.blendlink.backend.model.entity.ApplicationUser;
import co.blendlink.backend.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*") // TODO : fix cross origin
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;

    //TODO : do not return ApplicationUSer return a DTO
    @PostMapping("/register")
    public ApplicationUser registerUser(@RequestBody RegistrationDTO registrationDTO) {
        return authenticationService.registerUser(registrationDTO.getUsername(), registrationDTO.getPassword());
    }

    @PostMapping("/login")
    public LoginResponseDTO loginUser(@RequestBody RegistrationDTO registrationDTO) {
        // TODO make a seperate loginDTO
        return authenticationService.loginUser(registrationDTO.getUsername(), registrationDTO.getPassword());
    }

}
