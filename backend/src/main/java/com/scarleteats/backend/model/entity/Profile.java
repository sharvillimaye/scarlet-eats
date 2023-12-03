package com.scarleteats.backend.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Profiles")
public class Profile {
    @Id
    @Column(name = "user_id")
    private Integer userID;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    private Integer age;

    private String gender;

    private Double height;
}
