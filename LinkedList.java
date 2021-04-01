/*
package DsaAlgo;
//Linked List -151

public class LinkedList {

    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
        //    next = null;
        }
    }

    static Node findMid(Node head, Node tail) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next == null) {
            //moving fast pointer by 2 steps and slow by 1
            fast = fast.next.next;
            slow = slow.next;
        }
        //where ever slow stops that is the mid
        return slow;
    }

    */
/*static LinkedList mergeSort(Node head, Node tail) {

        if (head == tail) {
            LinkedList br = new LinkedList();
            //br.addAtEnd(head.data);
            return br;
        }
        Node mid = findMid(head, tail);
        LinkedList fsl = mergeSort(head, mid);
        LinkedList scl = mergeSort(mid.next, tail);
        //LinkedList cl = mergeSort(fsl,scl);
       // return cl;

    *//*
}

    public static void main(String[] args) {
        LinkedList linkedList = new MergeLinkedList();
        linkedList.head = new Reverse.Node(85);
        linkedList.head.next = new Reverse.Node(15);
        linkedList.head.next.next = new Reverse.Node(4);
        linkedList.head.next.next.next = new Reverse.Node(1);
}
}*/
