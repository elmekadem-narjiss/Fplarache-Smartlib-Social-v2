package com.example.social_serice.Service;


import com.example.social_serice.Entities.Discussion;
import com.example.social_serice.Repository.DiscussionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussionService {
    @Autowired
    private DiscussionRepository discussionRepository;

    public Discussion createDiscussion(Discussion discussion) {
        return discussionRepository.save(discussion);
    }

    public List<Discussion> getDiscussionsByBook(Long bookId) {
        return discussionRepository.findByBookId(bookId);
    }
}

