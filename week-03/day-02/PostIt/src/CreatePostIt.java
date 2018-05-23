public class CreatePostIt {
  public static void main(String[] args) {

    PostIt postIt1 = new PostIt("orange", "blue", "Idea 1");
    PostIt postIt2 = new PostIt("pink", "black", "Awesome!");
    PostIt postIt3 = new PostIt("yellow", "green", "Superb!");

    System.out.println(postIt1);
    System.out.println(postIt2);
    System.out.println(postIt3);

  }
}
