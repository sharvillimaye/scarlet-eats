package com.scarleteats.backend.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Meals")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "meal_id", nullable = false)
    private Integer mealID;

    private Date date;

    private String label;



}
