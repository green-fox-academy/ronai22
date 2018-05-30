public class Shifter implements CharSequence {
  String text;
  int where;

  public Shifter(String text, int where) {
    this.text = text;
    this.where = where;
  }

  @Override
  public int length() {
    return this.text.length();
  }

  @Override
  public char charAt(int index) {
    this.text = this.text.substring(this.where, (this.text.length() - 1)) + this.text.substring(0, this.where);
    return this.text.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return this.text.subSequence(start, end);
  }
}
