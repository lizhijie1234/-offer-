public class CycleLinkEntry {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null){
            return null;
        }
        ListNode slow = pHead;
        ListNode fast = pHead.next;
        while(slow != fast && slow != null && fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow != fast){
            return null;
        }
        fast = fast.next;
        int rCount = 1;
        while(slow != fast ){
            rCount++;
            fast = fast.next;
        }
        ListNode p = pHead;
        ListNode r = pHead;
        int i = 0;
        while(i < rCount){
            r = r.next;
            i++;
        }
        while(p != r){
            p = p.next;
            r = r.next;
        }
        return p;
    }
}
