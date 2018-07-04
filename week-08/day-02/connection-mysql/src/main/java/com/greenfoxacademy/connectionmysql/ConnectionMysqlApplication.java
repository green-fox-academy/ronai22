package com.greenfoxacademy.connectionmysql;

import com.greenfoxacademy.connectionmysql.models.Todo;
import com.greenfoxacademy.connectionmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionMysqlApplication implements CommandLineRunner {

  @Autowired
  TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(ConnectionMysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

  }
}
