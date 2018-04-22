package niuke;
/**
 * @Description: LeetCode算法题
 * @author: zhangzhikai
 * @date: 2018/4/22 下午3:42
 * @version: V1.0.0
 * @since: JDK 1.8
 */
public class Problem11 {
    /**
     * 题目名称：reorder-list
     * 题目描述：Given a singly linked list L: L 0→L 1→…→L n-1→L n,
     reorder it to: L 0→L n →L 1→L n-1→L 2→L n-2→…
     You must do this in-place without altering the nodes' values.
     For example,
     Given{1,2,3,4}, reorder it to{1,4,2,3}.
     */
    public void reorderList1(ListNode head) {
         ListNode first = head;
         ListNode pre = head;
         ListNode last = head;

        while (first != null && first.next != null && first.next != last) {

             while (last.next != null) {
                 pre = last;
                 last = last.next;
             }
             if(first == pre) { break; }
             last.next = first.next;
             first.next = last;
             pre.next = null;
             last = pre;
             first = first.next.next;

             pre = first;

             while (pre.next != null && pre.next != last) {
                 pre = pre.next;
             }

         }

         while (head != null) {
             System.out.println(head.val);
             head = head.next;
         }
    }

    public void reorderList(ListNode head) {
        //快慢指针找到中点，分成链表1，链表2
        if(head == null || head.next == null || head.next.next == null) return;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode list2 = slow.next;
        slow.next = null;
        //链表2反转
        ListNode pre = null;
        ListNode next = null;
        while (list2 != null) {
            next = list2.next;
            list2.next = pre;
            pre = list2;
            list2 = next;
        }
        list2 = pre;
        //合并两个链表
        ListNode before = head;
        while (list2 != null) {
            ListNode bTemp = before.next;
            ListNode nTemp = list2.next;

            before.next = list2;
            list2.next = bTemp;
            list2 = nTemp;
            before = bTemp;
        }

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Problem11 problem11 = new Problem11();
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;

        problem11.reorderList(head);
    }

}
