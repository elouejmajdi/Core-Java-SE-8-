package the3profe.jse8.algorithms;

public class ListNode {

	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode head = new ListNode(0);
	    ListNode p = head;
	 
	    while(l1!=null||l2!=null){
	        if(l1!=null&&l2!=null){
	            if(l1.val < l2.val){
	                p.next = l1;
	                l1=l1.next;
	            }else{
	                p.next=l2;
	                l2=l2.next;
	            }
	            p = p.next;
	        }else if(l1==null){
	            p.next = l2;
	            break;
	        }else if(l2==null){
	            p.next = l1;
	            break;
	        }
	    }
	 
	    return head.next;
	}

	public static void main(String[] args) {

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode noderes = null;
	
		node1.next.val = 2;
		node1.next.val = 4;

	
		node2.next.val = 3;
		node2.next.val = 4;
		
		noderes = mergeTwoLists(node1, node2);
		while (noderes.next != null) {
			System.out.println(noderes.val);
		}
	}
}
