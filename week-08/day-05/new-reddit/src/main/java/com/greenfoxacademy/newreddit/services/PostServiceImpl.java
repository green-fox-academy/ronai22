package com.greenfoxacademy.newreddit.services;

import com.greenfoxacademy.newreddit.models.Post;
import com.greenfoxacademy.newreddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.awt.print.Pageable;
import java.util.List;

@Service
@Transactional
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
  public void scorePost(long id, String type) {
    Post post = postRepository.findById(id).get();
    if (type.equals("+")) {
      post.setScore(post.getScore() +1);
    } else {
      post.setScore(post.getScore() -1);
    }
    postRepository.save(post);
  }

  @Override
  public List<Post> findAllByScoreOrder() {
    return postRepository.findTop10ByOrderByScoreDesc();
  }

  @Override
  public Page<Post> listAllByPage(Pageable pageable) {
    return postRepository.findAll((org.springframework.data.domain.Pageable) pageable);
  }
}
