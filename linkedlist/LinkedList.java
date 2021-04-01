package DsaAlgo.LinkedList;
//Linked list - 139
//method for Linked list prblm - 10041

public class LinkedList {
    //Node is not a primitive data type it is custom dt which i have made

    class Node{
        Node next;      //address of next Node
        int data;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    Node head;       //this is the first pointer to track the linked list position

    //O(1)
    public void addFirst(int data){
            //1. Make a new Node nn;
            Node nn  = new Node(data);
            //2. changed the next pointer
            nn.next = head;
            //3. Now head is pointing to new node nn
            head = nn;
    }

    //O(n)
    public void print(){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    //O(n)
    public void addLast(int data){
        //Make a new node
        Node nn = new Node(data);

        if (head == null){
            head = nn;
            return;
        }

        Node temp = head;

        //2.traversing the list by temp ptr until it reaches last element
        while (temp.next!=null){
            temp =temp.next;
        }

        //3.add the new node nn in the end
        temp.next = nn;
    }

    //O(n)
    public void addAtMid(int index, int data){

        if (index < 0) {
            return; }

        if (index == 0) {
            addFirst(data);
        }

        //Make a new node
        Node nn =new Node(data);

        //attach
        Node temp = head;

        for (int i = 0; i <index-1; i++){
            temp = temp.next;
        }
        temp.next = nn;
        nn.next = temp.next;
    }

    public void delAtFirst(){
        Node temp = head;
        head = head.next;
    }

    //O(n)
    public void delAtLast(){
        Node temp = head;
        // 1 - 2- 3 -4 -5
        //traversing the temp pointer to last second positon i.e at 4
        //assign null to temp.next

        while (temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void del(int index){
        Node temp = head;
        for (int i =0; i<index-1; i++){
            temp = temp.next;
        }

        //temp2 ptr is storing the address of next node which is next
        //next to the deleting node
        //1-2-3-4-5 so del(3) i.e data = 3 temp is at 2 and tem2 is at 4

        Node temp2 = temp.next.next;
        temp.next = temp2;

    }

    public void reverse(){
        //3 pointer approach is used here in iterative form
        Node curr = head;
        Node next =null;
        Node prev = null;         // we are initializing 2 pointer as a  null
                                        // & next pointer which is null is now at next to
                                        // head or curr as curr is initially at head

        while (curr!=null){
            next = curr.next;   // this tell the pointer which is pointing to next is curr.next
            curr.next = prev;   //current.next is pointing to prev i.e we change the ptr pointing to prev;
            prev = curr;        //updating the prev ptr to shift fwrd
            curr =next;
        }
        head = prev;            //very imp point
    }



    //This method solves problem -141 of linkedlist
    //we are using two pointer method to detect loop in list
    //this is having space complexty --
    public static boolean detectLoop(Node head){
        Node fast = head;                     //assigining two ptr initially at 1st position of list
        Node slow = head;

        //moving the slow pointer by 1 step
        while(slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast==slow)
                return true;
        }
        return false;
    }


    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addFirst(1);
        l.addFirst(2);
        l.addFirst(3);
        l.addFirst(4);
        l.addFirst(5);

        l.print();
        System.out.println("\n Reversing the linked list ");

        l.reverse();
        l.print();
        System.out.println("\n");

        l.delAtFirst();
        l.print();

        System.out.println("\n");
        l.delAtLast();
        l.print();

        l.reverse();
        System.out.println();



    }
}
