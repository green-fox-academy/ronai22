package com.greenfoxacademy.newreddit.repositories;

import com.greenfoxacademy.newreddit.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

  

}
