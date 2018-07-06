package com.greenfoxacademy.newreddit.services;

import com.greenfoxacademy.newreddit.models.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService  {

  void save(Post post);
  List<Post> findAll();
  void scorePost(long id, String type);
  List<Post> findAllByScoreOrder();

}
