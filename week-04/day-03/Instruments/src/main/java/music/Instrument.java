package main.java.music;

public abstract class Instrument {

  protected String nameOfInstrument;

  public String getNameOfInstrument() {
    return nameOfInstrument;
  }

  public void setNameOfInstrument(String nameOfInstrument) {
    this.nameOfInstrument = nameOfInstrument;
  }

  public abstract void play();

}
