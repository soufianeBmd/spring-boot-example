package com.soufiane.service;

import com.soufiane.DTO.PosteEmployesDTO;
import com.soufiane.model.Post;
import com.soufiane.repositrory.PostRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public void deletePost(Integer id){
        postRepository.deletePostById(id);
    }
    public List<PosteEmployesDTO> getEmployeeByPost()
    {
        List<Object[]> counts = postRepository.countEmployeeByPost();
        List<PosteEmployesDTO> result = new ArrayList<>();
        for (Object[] row: counts){
            PosteEmployesDTO posteEmployesDTO = new PosteEmployesDTO();
            posteEmployesDTO.setNomPoste((String) row[0]);
            posteEmployesDTO.setNbrEmployes((Long) row[1]);
            result.add(posteEmployesDTO);
        }
        return result;
    }
}
