import java.awt.*;

public class Counter {

  int counter;
  int temp;

  public Counter() {
  }

  public Counter(int counter) {
    this.counter = counter;
    temp = counter;
  }

  public void add() {
    counter++;
  }

  public void add(int number) {
    counter += number;
  }

  public int get() {
    return counter;
  }

  public int reset() {
    return counter = temp;
  }

  public static void main(String[] args) {

    Counter counter1 = new Counter(100);
    Counter counter2 = new Counter(100);


    counter1.add();
    counter1.add(200);
    counter1.get();
    counter2.add();
    counter2.reset();

    System.out.println(counter2);

  }

  @Override
  public String toString() {
    return String.valueOf(this.counter);
  }
}
