//LeetCode -273 -DELETE NODE IN LINKED LIST WITHOUR HEAD POINTER REF.
//You are given a pointer/ reference to the node which is to be deleted from the linked list of N nodes. 
//The task is to delete the node. Pointer/ reference to head node is not given. 

public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp;                              // creating temp node
        temp = node.next;                           // assigning position to temp i.e next to the node to be deleted 
        node.val = temp.val;                        // copying the value of temp node to the node to be delete 
        node.next = temp.next;                      // now skipping the temp node and poining to next node of temp 
        temp = null;                                // just assign null as temp node value is copied to the node which we want to delete
    }
}
