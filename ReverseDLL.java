package DsaAlgo.LinkedList;

public class ReverseDLL extends DoublyLinkedList {
    private int size;
    private Link head;
    public int data;


    class Link{
       private Link pre;
       private Link next;
       private int data;

        public Link(int data){
            pre = null;
            this.data = data;
            next = null;
        }

        public Link(Link pre,int data,Link next){
            this.pre = pre;
            this.next = next;
            this.data = data;
        }
    }

    @Override
    public void addFront(int data) {
        super.addFront(data);
    }

    @Override
    public void print() {
        super.print();
    }

    public void nReverse(int n){
        if (head == null){
            head = new Link(null, this.data, null);
        }
        int i= 1;

        Link temp = null;
        if (size==n){
            while (i<=n){
                temp = temp.next;
            }

            temp.next = head.pre;
            head.next = null;
            head = temp.next;
        }
    }

    public static void main(String[] args) {
        ReverseDLL r = new ReverseDLL();
        r.addFront(1);
        r.addFront(2);

        r.print();
        System.out.println(" \n");

        r.nReverse(2);
        r.print();
    }
}
