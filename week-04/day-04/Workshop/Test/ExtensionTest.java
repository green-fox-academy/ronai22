import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

/**
 * Created by aze on 2017.04.04..
 */
public class ExtensionTest {

  static Extension extension;

  @BeforeClass
  public static void init () {
     extension = new Extension();
  }

  @Test
  public void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  public void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  public void testAdd_2and5is7() {
    assertEquals(7, extension.add(2, 5));
  }

  @Test
  public void testMaxOfThree_first() {
    assertEquals(7, extension.maxOfThree(5, 7, 3));
  }

  @Test
  public void testMaxOfThree_third() {
    assertEquals(7, extension.maxOfThree(3, 7, 5));
  }

  @Test
  public void testMedian_four() {
    assertEquals(5, extension.median(Arrays.asList(7,5,3,5)));
  }

  @Test
  public void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
  }

  @Test
  public void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  public void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  private void assertEquals2(String i, String add) {
  }

  @Test
  public void testTranslate_bemutatkozik() {
    assertEquals2("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  public void testTranslate_lagopus() {
    assertEquals2("lavagovopuvus", extension.translate("lagopus"));
  }
}