package main.java.music;

public abstract class StringedInstrument extends Instrument {
  private int stringNum;
  private String sound;

  public int getStringNum() {
    return stringNum;
  }

  public void setStringNum(int stringNum) {
    this.stringNum = stringNum;
  }

  public String getSound() {
    return sound;
  }

  public void setSound(String sound) {
    this.sound = sound;
  }

  public String sound() {
    return sound;
  }

  @Override
  public void play() {
    System.out.println(getNameOfInstrument() + ", a " + getStringNum() + "-stringed instrument that goes " + sound());
  }
}
