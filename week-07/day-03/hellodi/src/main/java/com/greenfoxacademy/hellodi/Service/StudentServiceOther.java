package com.greenfoxacademy.hellodi.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Primary
@Service
public class StudentServiceOther implements StudentServiceInt {
  ArrayList<String> names;

  public StudentServiceOther() {
    names = new ArrayList<>();
    names.add("Sanyi");
    names.add("Lilla");
    names.add("John");
  }

  public List<String> findAll() {
    return names;
  }

  public void save(String student) {
    names.add(student);
    try {
      Path filePath = Paths.get("names.txt");
      Files.write(filePath, names);
    } catch (Exception e) {
      System.out.println("Uh-oh, could not write the file!");
    }
  }

  public int count() {
    return names.size();
  }

  public boolean check(String name) {
    return names.stream().anyMatch(name::equals);
  }
}
