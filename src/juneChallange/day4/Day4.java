package juneChallange.day4;

import java.util.Scanner;

/**Write a function that reverses a string. The input string is given as an array of characters char[].
 * 
 * Do not allocate extra space for another array, 
 * you must do this by modifying the input array in-place with O(1) extra memory.
 * 
 * You may assume all the characters consist of printable ascii characters.
 * 
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
*/

/**
amangupta
*/
public class Day4 {
	public static void main(String[] args) {
		Solution s=new Solution();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		char []chr=str.toCharArray();
		s.reverseString(chr);
		System.out.println(new String(chr));
	}
}

class Solution {
    public void reverseString(char[] s) {
        int l=0,r=s.length-1;
        char ch;
        while(l<r) {
        	ch=s[l];
        	s[l]=s[r];
        	s[r]=ch;
        	l++;
        	r--;
        }
    }
}
