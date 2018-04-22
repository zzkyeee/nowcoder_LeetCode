package niuke;
/**
 * @Description: LeetCode算法题
 * @author: zhangzhikai
 * @date: 2018/4/22 下午3:42
 * @version: V1.0.0
 * @since: JDK 1.8
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Problem4 {
    public ListNode getMid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode sortTwoList(ListNode head1,ListNode head2){
        ListNode merge = new ListNode(0);
        ListNode m = merge;
        ListNode l1 = head1;
        ListNode l2 = head2;
        while(l1 != null && l2 !=null){
            if(l1.val < l2.val){
                m.next = l1;
                m = m.next;
                l1 = l1.next;
            }else{
                m.next = l2;
                m = m.next;
                l2 = l2.next;
            }
        }
        if(l1 != null){
            m.next = l1;
        }else if(l2 != null){
            m.next = l2;
        }
        return merge.next;
    }
    public ListNode sortList(ListNode head) {
        if(head == null) return null;
        if(head.next ==null) return head;
        ListNode mid = getMid(head);
        ListNode r = sortList(mid.next);
        mid.next = null;
        ListNode l = sortList(head);

        return sortTwoList(l,r);
    }

    public static void main(String[] args){
        Problem4 problem4 = new Problem4();
        ListNode test = new ListNode(0);
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(4);

        test.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode sorted = problem4.sortList(test);

        while(sorted != null){
            System.out.println(sorted.val);
            sorted = sorted.next;
        }

    }

}
