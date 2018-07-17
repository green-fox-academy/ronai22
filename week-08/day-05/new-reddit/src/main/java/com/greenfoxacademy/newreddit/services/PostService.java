package com.greenfoxacademy.newreddit.services;
import com.greenfoxacademy.newreddit.models.Post;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import java.awt.print.Pageable;
import java.util.List;

@Service
public interface PostService  {

  void save(Post post);
  void scorePost(long id, String type);
  List<Post> findAllByScoreOrder();
  Page<Post> listAllByPage(Pageable pageable);
}
