package com.greenfoxacademy.hellodi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class Printer {

  @Autowired
  MyColor myColor;

  public void log(String message) {
    System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    myColor.printColor();
  }
}


