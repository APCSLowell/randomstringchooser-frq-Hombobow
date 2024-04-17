import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
  private String[] words;
  private ArrayList<String> wordList;
  public RandomStringChooser(String[] word) {
    words = word;
    wordList = new ArrayList<String>();
    for (String word: words) {
      wordList.add(word);
    }
  }
  public String getNext() {
    if (words.length == 0) {
      return "NONE";
    }
    else {
      int index = (int) (Math.random * wordList.size());
      String temp = wordList.get(index);
      wordList.remove(index);
      return temp;
    }
  }
}
