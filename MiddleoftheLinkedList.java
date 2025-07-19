public class MiddleoftheLinkedList {
    public static void main(String[] args) {
        InnerMiddleoftheLinkedList solution = new InnerMiddleoftheLinkedList();
        ListNode node = null;

        solution.middleNode(node);
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class InnerMiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode end = head;

        while (end != null && end.next != null) {
            middle = middle.next;
            end = end.next.next;
        }
        return middle;
    }
}
