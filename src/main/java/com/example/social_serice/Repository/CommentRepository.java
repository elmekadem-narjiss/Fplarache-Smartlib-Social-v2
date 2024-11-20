package com.example.social_serice.Repository;


import com.example.social_serice.Entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByDiscussionId(Long discussionId);
}
