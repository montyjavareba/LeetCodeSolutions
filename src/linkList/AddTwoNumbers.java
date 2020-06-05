package linkList;
/**
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * 
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 		Output: 7 -> 0 -> 8
 * 		Explanation: 342 + 465 = 807.
 */


/**
 * @author Aman Gupta
 *
 */
public class AddTwoNumbers {
	public static void main(String[] args) {
		ListNode l1=LinkList.create(new int[] {2,4,3});
		ListNode l2=LinkList.create(new int[] {5,6,8,9});
		Solution s=new Solution();
		ListNode result=s.addTwoNumbers(l1, l2);
		LinkList.printLinkList(l1);
		LinkList.printLinkList(l2);
		LinkList.printLinkList(result);
	}
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=null,node=null;
        int carry=0;
        while(l1!=null && l2!=null) {
        	int num=l1.val+l2.val+carry;
        	if(head==null) {
        		node=new ListNode(num%10);
        		head=node;
        	}else {
        		node.next=new ListNode(num%10);
        		node=node.next;
        	}
        	l1=l1.next;
    		l2=l2.next;
    		carry=num/10;
        }
        if(l1==null) {
        	while(l2!=null) {
        		int num=l2.val+carry;
        		node.next=new ListNode(num%10);
        		node=node.next;
        		l2=l2.next;
        		carry=num/10;
        	}
        }
        if(l2==null) {
        	while(l1!=null) {
        		int num=l1.val+carry;
        		node.next=new ListNode(num%10);
        		node=node.next;
        		l1=l1.next;
        		carry=num/10;
        	}
        }
        if(carry!=0) {
        	node.next=new ListNode(carry);
        }
        return head;
    }
}