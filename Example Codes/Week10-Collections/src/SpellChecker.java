import java.util.*;
public class SpellChecker {
	
	
	  public static void main(String... strings){
		  Set<String> dictionary=new HashSet<>();
		  Set<String> wordList=new HashSet<>();
		  dictionary.add("right");
		  dictionary.add("wrong");
		  dictionary.add("true");
		  wordList.add("right");
		  wordList.add("wrong");
		  wordList.add("ture");
		  Set<String> result=spellCheck(dictionary,wordList); 
		  System.out.print(result);
		  
	  }
	public static Set<String> spellCheck(Set<String> dictionary,Set<String> wordList){
		Set<String> wordSpellWrong = new HashSet<String>();
		for (Iterator<String> wordIterator = wordList.iterator() ; wordIterator.hasNext() ; ) {
		      String word = wordIterator.next();
		      if(!dictionary.contains(word)){
		    	  wordSpellWrong.add(word);
		      }
		    }
		return wordSpellWrong;
	}
}
