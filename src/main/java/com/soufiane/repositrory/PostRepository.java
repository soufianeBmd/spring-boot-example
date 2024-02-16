package com.soufiane.repositrory;

import com.soufiane.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
    Post findPostById(Integer id);
}
