import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

          // Starts with A tests

public class ProblemSolvingTest {
  @Test
  void testAllStartWithA_trueMixedCase() {
    // arrange
    Set<String> input = Set.of("armadillo", "Arcanine", "asbestos", "ABBA");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    //assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_falseOneElement() {
    // arrange
    Set<String> input = Set.of("armadillo", "utopia", "Arcanine");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_trueEmptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_falseEmptyStrings() {
    // arrange
    Set<String> input = Set.of("", "");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

              // Empty String tests

  @Test
  void testHasEmptyString_falseAllNonEmpty() {
    // arrange
    Set<String> input = Set.of("armadillo", "Arcanine", "utopia");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_trueOneEmpty() {
    // arrange
    Set<String> input = Set.of("armadillo", "", "utopia", "yeah");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testHasEmptyString_trueOnlyEmptyString() {
    // arrange
    Set<String> input = Set.of("");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testHasEmptyString_falseEmptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

                // max Length tests

  @Test
  void testMaxLength_multipleWords() {
    Set<String> input = Set.of("by", "a", "commodius", "vicus");
    int actual = ProblemSolving.maxLength(input);
    assertEquals(9, actual);
  }

  @Test
  void testMaxLength_singleWord() {
    Set<String> input = Set.of("e");
    int actual = ProblemSolving.maxLength(input);
    assertEquals(1, actual);
  }

  @Test
  void testMaxLength_noWords() {
    // arrange
    Set<String> input = Set.of();
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(0, actual);
  }

  @Test
  void testMaxLength_allEmptyStrings() {
    // arrange
    Set<String> input = Set.of("", "", "", "");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(0, actual);
  }
    
                // minimum length tests
                
  @Test
  void testMinLength_multipleWords() {
    Set<String> input = Set.of("appricot", "apple", "ear", "diamond");
    int actual = ProblemSolving.minLength(input);
    assertEquals(3, actual);
  }

  @Test
  void testMinLength_noWords() {
    Set<String> input = Set.of();
    int actual = ProblemSolving.minLength(input);
    assertEquals(Integer.MAX_VALUE, actual);
  }

  @Test
  void testMinLength_oneWord() {
    Set<String> input = Set.of("appricot");
    int actual = ProblemSolving.minLength(input);
    assertEquals(8, actual);
  }

  @Test
  void testMinLength_emptyString() {
    Set<String> input = Set.of("");
    int actual = ProblemSolving.minLength(input);
    assertEquals(0, actual);
  }
}
