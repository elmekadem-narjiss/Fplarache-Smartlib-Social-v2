package com.example.social_serice.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Reaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "discussion_id")
    private Discussion discussion;
    private String type; // "like" ou "unlike"
    private Long userId; // ID de l'utilisateur qui réagit

    // Getters et setters
}

