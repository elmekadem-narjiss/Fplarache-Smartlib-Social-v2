package com.example.social_serice.Repository;

import com.example.social_serice.Entities.Discussion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiscussionRepository extends JpaRepository<Discussion, Long> {
    List<Discussion> findByBookId(Long bookId);
}
