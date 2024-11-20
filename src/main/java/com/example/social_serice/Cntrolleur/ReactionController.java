package com.example.social_serice.Cntrolleur;

import com.example.social_serice.Entities.Reaction;
import com.example.social_serice.Service.ReactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reactions")
public class ReactionController {
    @Autowired
    private ReactionService reactionService;

    @PostMapping("/add")
    public Reaction addReaction(@RequestBody Reaction reaction) {
        return reactionService.addReaction(reaction);
    }
}
