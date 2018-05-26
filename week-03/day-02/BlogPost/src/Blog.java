import java.util.ArrayList;
import java.util.List;

public class Blog {

  List<BlogPost> blogs;

  public Blog() {
    blogs = new ArrayList<>();
  }

  public List blogPostAdder (BlogPost blogPost) {
    blogs.add(blogPost);
    return blogs;
  }

  public List blogPostDeleter(int blogId) {
    blogs.remove(blogId);
    return blogs;
  }

  public List blogPostUpdater(int blogId, BlogPost blogPost) {
    blogs.set(blogId, blogPost);
    return blogs;
  }
}
