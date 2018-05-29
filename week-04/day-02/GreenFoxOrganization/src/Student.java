public class Student extends Person {

  private String previousOrganization;
  private int skippedDays;

  public Student(){
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public String getPreviousOrganization() {
    return previousOrganization;
  }

  public void setPreviousOrganization(String previousOrganization) {
    this.previousOrganization = previousOrganization;
  }

  public int getSkippedDays() {
    return skippedDays;
  }

  public void setSkippedDays(int skippedDays) {
    this.skippedDays = skippedDays;
  }

  public int skipDays(int numberOfDays) {
    this.skippedDays = this.skippedDays + numberOfDays;
    return this.skippedDays;
  }

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", " + getAge() + " year old " + getGender() + " from " + previousOrganization + " who skipped "
            + this.skippedDays + " days from the course already.");
  }
}
