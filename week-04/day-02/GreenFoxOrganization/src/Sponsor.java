public class Sponsor extends Person {

  String company;
  int hiredStudents;

  public Sponsor(String company, int hiredStudents) {
    this.company = "Google";
    this.hiredStudents = 0;
  }

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public void hire() {
    hiredStudents++;
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", " + getAge() + " year old " + getGender() + " who represents "
            + this.company + " and hired " + this.hiredStudents + " students so far.");
  }
}
