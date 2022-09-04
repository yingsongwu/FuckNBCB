public class NC4hasCycle {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast!=null && fast.next !=null){
            fast = head.next.next;
            slow = head.next;
            if (fast == slow)
                return true;
        }
        return false;
    }

}
