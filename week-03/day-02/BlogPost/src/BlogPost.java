public class BlogPost {

  String authorName;
  String title;
  String text;
  String date;

  @Override
  public String toString() {
    return "\"" + this.title + "\" " + "titled by " + this.authorName + " posted at \"" + this.date + "\" \n " +
            this.text;
  }

  public BlogPost(String authorName, String title, String text, String date) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.date = date;
  }
}
