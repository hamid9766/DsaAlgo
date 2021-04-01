package DsaAlgo;

public class MergeTwoLL {
    class LinkedList {
        int data;
        LinkedList next;
        LinkedList(int val){
            data = val;
        }
    }
/*
    static LinkedList mergeTwoList(LinkedList l1, LinkedList l2){
        if (l1 ==null)
            return l2;
        else if (l2 == null)
            return l1;


        LinkedList head =null;
        if (l1.data < l2.data) {
            head = l1;
            l1 = l1.next;
        } else {
            head = l2;
            l2 = l2.next;
        }



    }*/
}
