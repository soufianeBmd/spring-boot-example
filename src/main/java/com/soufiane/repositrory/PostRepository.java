package com.soufiane.repositrory;

import com.soufiane.DTO.PosteEmployesDTO;
import com.soufiane.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {
    Post findPostById(Integer id);
    void deletePostById(Integer id);

    @Query(value = "select post.nom, count(employee.id) as nombreEmployee from employee, post where employee.post = post.id group by post.id;", nativeQuery = true)
    List<Object[]> countEmployeeByPost();
}
