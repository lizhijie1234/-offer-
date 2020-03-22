public class TailKnodeOnLinklist {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null){
            return null;
        }
        ListNode cur = head;
        int count = 0;
        while(cur != null && count < k){
            cur = cur.next;
            count ++;
        }
        if(count < k){
            return null;
        }
        ListNode p = head;
        while(cur != null){
            cur = cur.next;
            p = p.next;
        }
        return p;
    }
}
