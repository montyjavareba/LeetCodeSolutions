package juneChallange.day2;

import linkList.LinkList;
import linkList.ListNode;

/**
amangupta
*/
public class Day2 {
	public static void main(String[] args) {
		ListNode head=LinkList.create(new int[] {4,5,1,9});
		ListNode node=LinkList.getNthNode(head, 2);
		Solution s=new Solution();
		if(node!=null)
			s.deleteNode(node);
		else
			throw new NullPointerException();
		LinkList.printLinkList(head);
	}
}

class Solution {
    public void deleteNode(ListNode node) {
    	ListNode prev=node;
    	while(node.next!=null) {
    		node.val=node.next.val;
    		prev=node;
    		node=node.next;
    	}
    	prev.next=null;
    }
}