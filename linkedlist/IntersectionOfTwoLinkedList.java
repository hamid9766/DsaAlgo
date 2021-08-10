// Leetcode 160. Intersection of Two Linked Lists

public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;                     //if any list is null then there is no intersection point  
        
        ListNode a = headA;                                                 // putting two dummy nodes on both the list a node on HeadA and b on headB
        ListNode b = headB;
        
        while(a!=b){                                                        // this loop will go until we get and common node
            a = a == null ? headB : a.next;                                 // just moving the node but if any pointer reaches end then we are assigning 
                                                                            // that dummy node to second linked list
            b = b == null ? headA : b.next;
        }
        return a;
   
 }
