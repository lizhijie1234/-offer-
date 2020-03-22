public class DeleteSortedLinkDuplication {
    public ListNode deleteDuplication(ListNode pHead){
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode first = new ListNode(-1);
        first .next = pHead;
        ListNode pre = first;
        ListNode p = pHead;
        while(p != null ){
            if( p.next != null&& p.val == p.next.val){
                ListNode next = p.next;
                while(next != null && p.val == next.val){
                    next = next.next;
                }
                p = next;
                pre.next = p;
            }else {
                pre = p;
                p = p.next;
            }
        }
        return first.next;
    }
}
