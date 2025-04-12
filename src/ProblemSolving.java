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
      // two if-else because charAt gets upset if empty string.
      if(!word.isEmpty()){
        if((word.charAt(0) != 'a' && word.charAt(0) != 'A')){
        returnable = false;
        }
      }
      else{
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
    boolean returnable = false;
    for(String word : words){
      if(word.isEmpty()){
        returnable = true;
      }
    }
    return returnable;
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
    int value = 0;
      for(String word : words){
        if(!word.isEmpty()){
          if(word.length() > value){
            value = word.length();
          }
        }
      }
    return value;
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
    int value = Integer.MAX_VALUE;
    for(String word : words){
      if(!word.isEmpty()){
        if(word.length() < value){
          value = word.length();
        }
      }
      else{
        value = 0;
      }
    }
    return value;
  }
}