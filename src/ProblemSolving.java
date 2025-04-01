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
    boolean returnable = true;
    for(String word : words){
      if(word.charAt(0) != 'a' || word.charAt(0) != 'A'){
        returnable = false;
      }
    }
    return returnable;
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
    // set value to interger max value
    // for every word in words
      // if the length of the string is less than value, replace value with length
    // return value
    return Integer.MAX_VALUE;
  }
}