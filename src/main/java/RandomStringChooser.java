import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
  private ArrayList<String> wordList;
  public RandomStringChooser(String[] word) {
    wordList = new ArrayList<String>();
    for (String singleWord: word) {
      wordList.add(singleWord);
    }
  }
  public String getNext() {
    if (wordList.size() == 0) {
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
