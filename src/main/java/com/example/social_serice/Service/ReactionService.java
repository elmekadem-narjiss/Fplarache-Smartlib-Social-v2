package com.example.social_serice.Service;


import com.example.social_serice.Entities.Reaction;
import com.example.social_serice.Repository.ReactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReactionService {
    @Autowired
    private ReactionRepository reactionRepository;

    public Reaction addReaction(Reaction reaction) {
        return reactionRepository.save(reaction);
    }
}
