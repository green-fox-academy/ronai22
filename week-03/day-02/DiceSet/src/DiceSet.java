import java.util.Arrays;

public class DiceSet {
  // You have a `DiceSet` class which has a list for 6 dices
// You can roll all of them with roll()
// Check the current rolled numbers with getCurrent()
// You can reroll with reroll()
// Your task is to roll the dices until all of the dices are 6
  int[] dices = new int[6];

  public int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }

  public int[] getCurrent() {
    return dices;
  }

  public int getCurrent(int i) {
    return dices[i];
  }

  public void reroll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
  }

  public void reroll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }

  public static void main(String[] args) {
    DiceSet diceSet = new DiceSet();
    int howManyRolls = 0;
    for (int j = 0; j < 6;) {

      if (diceSet.getCurrent(j) == 6) {
        j++;
      } else diceSet.reroll(j);
      howManyRolls++;
    }

    for (int i = 0; i <diceSet.getCurrent().length ; i++) {
      System.out.print(diceSet.getCurrent()[i] + ", ");
    }

    System.out.println(" \n" + "Reroll Counter: " + howManyRolls);
  }
}