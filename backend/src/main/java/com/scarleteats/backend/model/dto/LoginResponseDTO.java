package com.scarleteats.backend.model.dto;

import com.scarleteats.backend.model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponseDTO {
    private User user;
    private String jwt;
}
