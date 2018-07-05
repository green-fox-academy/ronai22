package com.greenfoxacademy.connectionmysql.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private String email;

  @OneToMany
  private List<Todo> todosAssigned = new ArrayList<>();

  public Assignee() {
  }

  public Assignee(String name, String email, List<Todo> todosAssigned) {
    this.name = name;
    this.email = email;
    this.todosAssigned = todosAssigned;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Todo> getTodosAssigned() {
    return todosAssigned;
  }

  public void setTodosAssigned(List<Todo> todosAssigned) {
    this.todosAssigned = todosAssigned;
  }
}
