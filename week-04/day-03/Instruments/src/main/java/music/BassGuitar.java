package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    this(4);
  }

  public BassGuitar(int stringNum) {
    setStringNum(stringNum);
    setSound("Duum-duum-duum");
    setNameOfInstrument("Bass Guitar");
  }
}
