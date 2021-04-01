package DsaAlgo.LinkedList;
//LinkedList - 146

public class LastPointer {
    class Node{
        Node next ;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;
    public void reverse(){
        if(head == null || head.next == null)
            return;

        // Initialize second last and last pointers
        Node last = head;
        Node secLast = null;

       // traversing the pointer till last position
        while(last.next!= null){
            secLast = last;
            last = last.next;
        }

        secLast.next = null;
        last.next = head;
        head = last;

    }

    public void print(){
        Node temp =head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void add(int data){
        Node nn = new Node(data);
        nn.next = head;
        head= nn;
    }

    public static void main(String[] args) {
        LastPointer l = new LastPointer();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);

        l.print();
        System.out.println("\n reversing the order");
        l.reverse();
        l.print();
    }
}
