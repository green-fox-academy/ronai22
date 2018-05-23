public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();

    Thing toDo1 = new Thing("Get milk");
    Thing toDo2 = new Thing("Remove the obstacles");
    Thing toDo3 = new Thing("Stand up");
    Thing toDo4 = new Thing("Eat lunch");

    fleet.add(toDo1);
    fleet.add(toDo2);
    fleet.add(toDo3);
    fleet.add(toDo4);

    toDo3.complete();
    toDo4.complete();

    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    System.out.println(fleet);
  }
}