package niuke;

/**
 * 题目名称：linked-list-cycle
 * 题目描述：Given a linked list, determine if it has a cycle in it.
 Follow up:
 Can you solve it without using extra space?
 */
public class Problem9 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow) { return true; }


        }

        return false;
    }
}
