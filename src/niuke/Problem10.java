package niuke;
/**
 * @Description: LeetCode算法题
 * @author: zhangzhikai
 * @date: 2018/4/22 下午3:42
 * @version: V1.0.0
 * @since: JDK 1.8
 */
public class Problem10 {

    public ListNode insertionSortList(ListNode head) {
        if (head == null) { return null; }
        ListNode l = head.next;
        while (l != null) {
            ListNode temp = head;
            ListNode pre = head;
            while (l.val > temp.val) {
                pre = temp;
                temp = temp.next;
            }
            if(temp == l) {
                l = l.next;
                continue;
            }

            ListNode r = temp;
            while (r.next != null && r.next != l) {
                r = r.next;
            }
            if (pre == temp) {
                r.next = l.next;
                head = l;
                l.next = pre;
                l = r.next;
            } else {
                r.next = l.next;
                pre.next = l;
                l.next = temp;
                l = r.next;
            }

        }
        return head;
//        while (l != null) {
//            ListNode temp = head;
//            if (temp.next == l && temp.val <= l.val){
//                l = l.next;
//                continue;
//            }
//            while (l.val > temp.next.val) {
//                temp = temp.next;
//            }
//
//            ListNode r = temp;
//            while (r.next != l) {
//                r = r.next;
//            }
//            r.next = l.next;
//            l.next = temp.next;
//            temp.next = l;
//
//            l = r.next;
//        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        head.next = node1;
//        node1.next = node2;
        Problem10 problem10 = new Problem10();
        ListNode list = problem10.insertionSortList(head);
        while (list != null) {
            System.out.println(list.val);
            list = list.next;
        }

    }
}
