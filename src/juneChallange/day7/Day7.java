package juneChallange.day7;

import java.util.ArrayList;
import java.util.List;

/**
amangupta
*/
public class Day7 {
	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	
	public static void main(String[] args) {
		String str=findMissingLetters("");
		System.out.println(str);
	}
	
	
	public static String findMissingLetters(String sentence) {
	    List<Character> aList=new ArrayList<Character>();
	    char []sArr=sentence.toCharArray();
	    for(int i=0;i<ALPHABET.length();i++){
	      aList.add(ALPHABET.charAt(i));
	    }  
	    for(char ch:sArr){
	      if(aList.contains(ch)){
	        aList.remove(new Character(ch));
	      }
	    }
	    StringBuilder sb=new StringBuilder();
	    for(Character ch:aList){
	      sb.append(ch);
	    }
	    return new String(sb);
	  }
}

