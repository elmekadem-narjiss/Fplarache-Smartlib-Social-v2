package com.example.social_serice.Repository;

import com.example.social_serice.Entities.Reaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReactionRepository extends JpaRepository<Reaction, Long> { }