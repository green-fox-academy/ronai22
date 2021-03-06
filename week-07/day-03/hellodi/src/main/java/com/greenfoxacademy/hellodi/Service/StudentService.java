package com.greenfoxacademy.hellodi.Service;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements StudentServiceInt {
  ArrayList<String> names;

  public StudentService() {
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
  }

  public int count() {
    return names.size();
  }

  public boolean check(String name) {
    return names.stream().anyMatch(name::equals);
  }

}
