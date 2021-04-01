package DsaAlgo;
//Linked List - 140
public class ReverseInSize {
    static Node head;

    static class Node {
        int data;
        Node next;
        Node(int d){
            data= d;
            next = null;
        }
    }

    public static Node reverse(Node head, int k){
        Node  curr = head;
        Node  prev =null, next = null;
        int i = 0;
        while (curr!=null && i<k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }

        /*if (next!= null){       // this if for getting k reverse of all elents till last;
            head.next = reverse(next,k);
        }*/

        if(next!=null){           // this for getting getting k reverse and printing rest as it is;
            prev = head.next;
        }
        return prev;
    }

    public void print(Node head){
        while(head!=null){
            System.out.print(head.data + " ");
            head =head.next;
        }
    }

    public static void main(String[] args) {
        ReverseInSize list = new ReverseInSize();
        list.head = new Node(4);
        list.head.next = new Node(2);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(1);
        list.head.next.next.next.next = new Node(3);

        System.out.println("Given Linked List");
        list.print(head);

        head = reverse(head,3);
        System.out.println();
        System.out.println("Reversed linked list after shuffle in k order");

        list.print(head);


    }
}
