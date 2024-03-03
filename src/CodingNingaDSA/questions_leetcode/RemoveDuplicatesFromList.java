package CodingNingaDSA.questions_leetcode;

public class RemoveDuplicatesFromList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(){}
        ListNode(int val){this.val=val;}
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static ListNode deleteDuplicates(ListNode head){
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.val == current.next.val)
                current.next = current.next.next;
            else
                current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.val = 1;
        ListNode newHead = new ListNode();
        head.next = newHead;
        newHead.val = 1;
        ListNode newHead2 = new ListNode();
        newHead.next = newHead2;
        newHead2.val = 2;
        ListNode temp = deleteDuplicates(head);

        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }

    }
}
