package com.greenfoxacademy.newreddit.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

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
    this.score = 0;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getScore() {
    return score;
  }

  public void setScore(long score) {
    this.score = score;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public LocalDateTime getCreateDateTime() {
    return createDateTime;
  }

  public void setCreateDateTime(LocalDateTime createDateTime) {
    this.createDateTime = createDateTime;
  }
}
