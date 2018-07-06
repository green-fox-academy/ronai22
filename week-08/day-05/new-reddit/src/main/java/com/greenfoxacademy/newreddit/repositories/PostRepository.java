package com.greenfoxacademy.newreddit.repositories;

import com.greenfoxacademy.newreddit.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
  List<Post> findAll();
  List<Post> findAllByOrderByScoreDesc();
}
