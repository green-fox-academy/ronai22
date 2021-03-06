public class CreateBlogPost {
  public static void main(String[] args) {

    BlogPost blogPost1 = new BlogPost("John Doe", "Lorem Ipsum",
            "Lorem ipsum dolor sit amet.", "2000.05.04.");
    BlogPost blogPost2 = new BlogPost("Tim Urban", "Wait but why",
            "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
    BlogPost blogPost3 = new BlogPost("William Turton", "Wait but why",
            "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to \n " +
                    "take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole \n" +
                    " organizer profile thing.", "2017.03.28.");

    Blog blogs = new Blog();

    blogs.blogPostAdder(blogPost1);
    blogs.blogPostAdder(blogPost2);
    blogs.blogPostAdder(blogPost3);

    blogs.blogPostDeleter(1);
    blogs.blogPostUpdater(0, blogPost3);

    System.out.println(blogPost1);
    System.out.println(blogPost2);
    System.out.println(blogPost3);



  }
}
