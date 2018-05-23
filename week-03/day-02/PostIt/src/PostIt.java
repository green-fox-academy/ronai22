public class PostIt {

  String backgroundColor;
  String textColor;
  String text;

  @Override
  public String toString() {
    return "Post-it: " + this.backgroundColor + ", " + this.textColor + ", " + this.text;
  }

  public PostIt (String backgroundColor, String textColor, String text) {
    this.backgroundColor = backgroundColor;
    this.textColor = textColor;
    this.text = text;


  }

}
