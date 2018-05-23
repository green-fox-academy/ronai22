import java.util.*;
public class DoableHomework {
  public static void main(String... args) {
    ArrayList<Map<String, Object>> treeList = new ArrayList<>();

    Map<String, Object> row0 = new HashMap<>();
    row0.put("type", "Alder");
    row0.put("leaf color", "dark green");
    row0.put("age", 45);
    row0.put("sex", "male");
    treeList.add( row0 );

    Map<String, Object> row1 = new HashMap<>();
    row1.put("name", "Birch");
    row1.put("leaf color", "light green");
    row1.put("age", 60);
    row1.put("sex", "female");
    treeList.add( row1 );

    Map<String, Object> row2 = new HashMap<>();
    row2.put("name", "Hornbeam");
    row2.put("leaf color", "olive");
    row2.put("age",30);
    row2.put("sex", "male");
    treeList.add( row2 );

    Map<String, Object> row3 = new HashMap<>();
    row3.put("name", "Pine");
    row3.put("leaf color", "pine");
    row3.put("age",62);
    row3.put("sex", "female");
    treeList.add( row3 );

    Map<String, Object> row4 = new HashMap<>();
    row4.put("name", "Juniper");
    row4.put("leaf color", "grass green");
    row4.put("age",48);
    row3.put("sex", "male");
    treeList.add( row4 );

  }
}
