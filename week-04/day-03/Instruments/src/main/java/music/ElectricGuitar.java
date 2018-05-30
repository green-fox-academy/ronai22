package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    this(6);
    setSound("Twang");
  }

  public ElectricGuitar(int stringNum) {
    setStringNum(stringNum);
    setSound("Twangg");
    setNameOfInstrument("Electric Guitar");
  }
}
