package juneChallange.day9;
/**Given a string s and a string t, check if s is subsequence of t.
 * A subsequence of a string is a new string which is formed from the original string by deleting some(can be none) 
 * of the characters without disturbing the relative positions of the remaining characters. 
 * 
 * (ie, "ace" is a subsequence of "abcde" while "aec" is not).
 */

/**
amangupta
*/
public class Day9 {
	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.isSubsequence("abc", "ahbgdc"));
	}
}

class Solution {
    public boolean isSubsequence(String s, String t) {
        char sArr[]=s.toCharArray();
        char tArr[]=t.toCharArray();
        int i=0,j=0;
        while(i<sArr.length && j<tArr.length) {
        	if(sArr[i]==tArr[j++]) i++;
        }
        if(i==sArr.length) {
        	return true;
        }else {
        	return false;
        }
    }
}
