import java.util.Set;

public class ProblemSolving {

  /**
   * Returns whether every word in the set starts with the letter A (either
   * upper or lower case).
   * 
   * Edge case: If set is empty, return true.
   * 
   * @param words a set of words
   * @return true if every word starts with A (case-insensitive), false otherwise.
   */
  public static boolean allStartWithA(Set<String> words) {
    // bool: true (this captures empty sets)
    // for every word in words
       // if empty string - we dont need to do anything
       // if starts with lowercase a - we dont need to do anything
       // if starts with uppercase A - we dont need to do anything
       // if anything else - we set bool to false
    // return the bool.
    return false;
  }

  /**
   * Returns whether there exists at least one empty string in the set of words.
   * 
   * Edge case: If set is empty, return false.
   * 
   * @param words a set of words
   * @return true if there is at least one empty string, false otherwise
   */
  public static boolean hasEmptyString(Set<String> words) {
    // set bool to false (to capture edgecase)
    // for every word in words
       // if a string has more than 0 length - we dont do anything
       // if a string has 0 length, we set bool to true
    // return bool.
    return false;
  }

  /**
   * Returns the length of the longest word in the set.
   * 
   * Edge case: If the set is empty, return 0
   * 
   * @param words a set of words
   * @return the maximum length of a word in the set
   */
  public static int maxLength(Set<String> words) {
    // set value to 0 (captures edgecase)
    // for every word in word
      // if the length of the word is less than the value - do nothing
      // if the length of the word is more than the value - replace value with length
    // return value
    return 0;
  }

 /**
   * Returns the length of the shortest word in the set.
   * 
   * Edge case: if set is empty, return Integer.MAX_VALUE
   * 
   * @param words a set of words
   * @return the minimum length of a word in the set
   */
  public static int minLength(Set<String> words) {
    return Integer.MAX_VALUE;
  }
}