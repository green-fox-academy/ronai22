public class Ex02UrlFixer {
  public static void main(String[] args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crutial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!

    // url = url.replace("https", "https:");
    // url = url.replace("bots", "odds");

    // url = url.substring(0, 5) + ":" + url.substring(5);
    // int index = url.indexOf("bots", 4);
    // url = url.substring(0, index) + "odds";

    String[] parts = url.split("/" , 2);
    url = parts[0] + ":/" + parts[1];
    String[] parts2 = url.split("bots", 2);
    url = parts2[0] + "odds";

    System.out.println(url);
  }
}
