package DsaAlgo.LinkedList;

public class ReverseTwoNode extends LinkedList {
    class Node{
        LinkedList.Node next;      //address of next Node
        int data;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
}
