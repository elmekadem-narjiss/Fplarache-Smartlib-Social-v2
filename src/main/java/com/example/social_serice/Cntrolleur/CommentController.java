package com.example.social_serice.Cntrolleur;

import com.example.social_serice.Entities.Comment;
import com.example.social_serice.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("/add")
    public Comment addComment(@RequestBody Comment comment) {
        return commentService.addComment(comment);
    }

    @GetMapping("/discussion/{discussionId}")
    public List<Comment> getCommentsByDiscussion(@PathVariable Long discussionId) {
        return commentService.getCommentsByDiscussion(discussionId);
    }
}
