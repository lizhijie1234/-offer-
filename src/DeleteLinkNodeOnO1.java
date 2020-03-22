public class DeleteLinkNodeOnO1 {
    public ListNode delete(ListNode head, ListNode toDelete){
        if(head == null || toDelete == null){
            return null;
        }
        if(toDelete.next != null){
            ListNode next = toDelete.next;
            toDelete.val = next.val;
            toDelete.next = next.next;
        }else if(head == toDelete){
            head = null;
        }else{
            ListNode cur = head;
            while(cur.next != toDelete){
                cur = cur.next;
            }
            cur.next = null;
        }
        return head;
    }
}
