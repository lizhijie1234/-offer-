import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class reversalPrintLinkList {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        ListNode pre = null;
        ListNode p = listNode;
        ListNode q;
        while(p != null){
            q = p.next;
            p.next = pre;
            pre = p;
            p = q;
        }
        while(pre != null){
            res.add(pre.val);
            pre = pre.next;
        }
        return res;
    }
    public ArrayList<Integer> printListFromTailToHeadWithStack(ListNode listNode){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        while(listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while(!stack.isEmpty()){
            res.add(stack.pop());
        }
        return res;
    }

    public static void main(String[] args){
        ListNode list = new ListNode(8);
        System.out.println(list.val);
    }
}
class ListNode{
    int val;
    ListNode next = null;
    ListNode(int value){
        this.val = value;
    }
}
