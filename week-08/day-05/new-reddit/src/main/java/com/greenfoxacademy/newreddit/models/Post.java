package com.greenfoxacademy.newreddit.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private long score;
  private String title;
  private String url;

  @CreationTimestamp
  private LocalDateTime createDateTime;

  public Post() {
  }

}
