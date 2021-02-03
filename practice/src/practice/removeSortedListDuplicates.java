package practice;

//remove duplicates in a sorted list

public class removeSortedListDuplicates {

	public static void main(String[] args) {
		ListNode list = new ListNode(1);
		list.next = new ListNode(1);
		list.next.next = new ListNode(2);
		list.next.next.next = new ListNode(2);
		list.next.next.next.next = new ListNode(3);
		list.next.next.next.next.next = new ListNode(3);
		
		ListNode result = deleteDuplicates(list);
		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while(current != null && current.next != null) {
            if (current.val == current.next.val){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
