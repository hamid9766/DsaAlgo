package DsaAlgo;
//Linked List -139

public class Reverse {
    static Node head;

    static class Node {
        int data;
        Node next;
        Node(int d){
            data =d;
            next = null;
        }
    }

    static Node reverse(Node head){
        Node prev =null, next =null;

        Node curr = head;
        while (curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public void print(Node head){
         Node temp = head;
         while(temp!=null){
             System.out.print(temp.data + " ");
             temp = temp.next;
         }

    }

    public static void main(String[] args) {
        Reverse linkedList = new Reverse();
        linkedList.head = new Node(85);
        linkedList.head.next = new Node(15);
        linkedList.head.next.next = new Node(4);
        linkedList.head.next.next.next = new Node(1);

        System.out.println("Given Linked list");
        linkedList.print(head);
        head = linkedList.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        linkedList.print(head);

    }


}
