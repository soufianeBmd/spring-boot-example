package com.soufiane.service;

import com.soufiane.model.Employee;
import com.soufiane.model.Post;
import com.soufiane.repositrory.PostRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> findAllPost (){
        return postRepository.findAll();
    }

    public Post findPost(Integer id){
        return postRepository.findPostById(id);
    }

    public Post addPost (Post post){
        return postRepository.save(post);
    }

    public Post updatePost (Post post){
        return postRepository.save(post);
    }
}
