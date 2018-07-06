package com.greenfoxacademy.newreddit.services;

import com.greenfoxacademy.newreddit.models.Post;
import com.greenfoxacademy.newreddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

  PostRepository postRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public void save(Post post) {
    postRepository.save(post);
  }

  @Override
  public List<Post> findAll() {
    return postRepository.findAll();
  }

  @Override
  public void scorePost(long id, String type) {
    Post post = postRepository.findById(id).get();
    if (type.equals("+")) {
      postRepository.findById(id).get().setScore(postRepository.findById(id).get().getScore() +1);
      post.setScore(post.getScore() +1);
    } else {
      post.setScore(post.getScore() -1);
    }
    postRepository.save(post);
  }

  @Override
  public List<Post> findAllByScoreOrder() {
    return postRepository.findAllByOrderByScoreDesc();
  }
}
