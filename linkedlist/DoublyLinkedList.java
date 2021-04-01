package DsaAlgo.LinkedList;

public class DoublyLinkedList {
    private Link head;
    private int size;

    class Link{
        private int data;
        public Link prev;
        public Link next;

        public Link(int data){
            prev = null;
            this.data = data;
            next = null;
        }

        public Link(Link prev, int data, Link next ){
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }


    public DoublyLinkedList(){
        head = null;
        size = 0;
    }

    public void addFront(int data){
        if (head == null)
            head = new Link(null, data,null);
        else{
            Link newLink = new Link(null,data,head);
            head.prev = newLink;
            head = newLink;
        }
        size++;
    }

    public boolean isEmpty(){
        return (head==null);
    }

    public void addLast(int data){
        if (head == null)
            head = new Link(null, data, null);
        else {
            Link temp = head;
            while (temp.next!= null ){
                temp = temp.next;
            }

            Link newLink = new Link(temp,data,null);
            temp.next = newLink;
        }
        size++;
    }

    public void print(){
        Link temp = head;
        while (temp !=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void removeFront(){
        if (head == null) return;

        head = head.next;
        head.prev = null;
        size--;
    }

    public void removeLast(){
        if (head == null) return;

        Link temp = head;
        while (temp.next!= null){
            temp = temp.next;
        }

        temp = temp.prev;
        temp.next = null;
        size--;
    }

    public void removeAt(int index){
        if (head == null) return;
        if (index<1 || index > size) return;

        Link temp = head;
        int i =1;
        while (i<index){
            temp = temp.next;
            i++;
        }

        if (temp.next == null){
            temp.prev.next = null;
        }
        else if (temp.prev == null){
            temp = temp.next;
            temp.prev = null;
            head = temp;
        }
        else{
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        size--;
    }

    public void insertAt(int data, int index){
        if (head == null) return;
        if (index <1 || index >size) return;

        Link temp = head;
        int i = 1;
        while (i<index){
            temp = temp.next;
            i++;
        }

        if (temp.prev == null){
            // above condition tells that there is only one node present
            Link newLink = new Link(null,data,temp);
            temp.prev = newLink;
            head = newLink;
        }
        else{
            Link newLink = new Link(temp.prev,data,temp);
            temp.prev.next = newLink;
            temp.prev = newLink;
        }
        size++;
    }

    public void clear(){
        Link temp = head;
        temp = null;
        System.out.println("List deleted");
    }


    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFront(2);
        list.addFront(5);
        list.addFront(7);
        list.addFront(8);
        list.addFront(10);
        list.addFront(12);

        list.addLast(55);

        list.print();
        System.out.println("\n------");

        list.removeFront();
        list.print();

        System.out.println("\n------");
        list.removeLast();
        list.print();

        System.out.println("\n------");
        list.insertAt(36,2);
        list.print();
    }

}
