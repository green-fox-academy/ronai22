import java.util.ArrayList;
import java.util.List;

public class Cohort {

  String name;
  List<Student> students;
  List<Mentor> mentors;

  public Cohort(String name) {
    this.name = name;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {

    System.out.println("The " + this.name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
  }
}
