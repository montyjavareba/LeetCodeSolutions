package linkList;
/**
amangupta
*/
public class LinkList {
		public static ListNode create(int []data) {
			ListNode head=null,node=null;
			for(int i=0;i<data.length;i++) {
				if(head==null) {
					node=new ListNode(data[i]);
					head=node;
					continue;
				}
				node.next=new ListNode(data[i]);
				node=node.next;
			}
			return head;
		}
		
		public static void printLinkList(ListNode head) {
			ListNode node=head;
			while(node!=null) {
				System.out.print(node.val);
				node=node.next;
				if(node!=null)
					System.out.print("->");
				else
					System.out.println();
			}
		}
}
