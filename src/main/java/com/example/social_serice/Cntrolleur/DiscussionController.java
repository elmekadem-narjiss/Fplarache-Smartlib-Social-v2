package com.example.social_serice.Cntrolleur;

import com.example.social_serice.Entities.Discussion;
import com.example.social_serice.Service.DiscussionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/discussions")
public class DiscussionController {
    @Autowired
    private DiscussionService discussionService;

    @PostMapping("/create")
    public Discussion createDiscussion(@RequestBody Discussion discussion) {
        return discussionService.createDiscussion(discussion);
    }

    @GetMapping("/{bookId}")
    public List<Discussion> getDiscussionsByBook(@PathVariable Long bookId) {
        return discussionService.getDiscussionsByBook(bookId);
    }
}
