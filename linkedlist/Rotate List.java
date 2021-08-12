// Leetcode 61   Rotate List


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next ==  null || k == 0) return head;
        
        ListNode curr = head;
        
        int len = 1;
        while(curr.next !=null){                        // reaching the node at end
            len++;
            curr = curr.next;
        }
        
        curr.next = head;                               // attaching the end node to the head that is first node to make it cyclic
        k = k % len;                                    // if the k is greater thean len then at doubling the length
                                                        // we will get same list so we are taking modulo to do only k rotation
        k= len - k;                                     // this will take to the k node after doing module ex 12 % 5 then k will be at 2 that is only 2 rotation needed
        
        while(k-->0) curr = curr.next;                  //until k becomes 0 we will traverse to the node and then we will connect the head and then break the link 
        
        head = curr.next;
        curr.next = null;
        
        
        return head;
        }
}
