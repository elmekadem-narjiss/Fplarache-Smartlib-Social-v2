package com.example.social_serice.Service;

import com.example.social_serice.Entities.Comment;
import com.example.social_serice.Repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public List<Comment> getCommentsByDiscussion(Long discussionId) {
        return commentRepository.findByDiscussionId(discussionId);
    }
}
