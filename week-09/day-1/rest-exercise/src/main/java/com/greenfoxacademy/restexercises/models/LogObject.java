package com.greenfoxacademy.restexercises.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
public class LogObject implements MessageInterface {


  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String endpoint;
  private String data;

  @JsonIgnore
  @CreationTimestamp
  private LocalDateTime createdAt;

  public LogObject() {
  }

  public LogObject(String endpoint, String data) {
    this.endpoint = endpoint;
    this.data = data;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }
}
