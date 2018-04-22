package niuke;

public class Problem12 {

    /**
     * 题目名称：linked-list-cycle-ii
     * 题目描述：Given a linked list, return the node where the cycle begins. If there is no cycle, returnnull.
     Follow up:
     Can you solve it without using extra space?
     */
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

}
